package com.movie.service.impl;

import com.github.pagehelper.PageHelper;
import com.movie.mapper.TblAuthUserMapper;
import com.movie.mapper.TblParamMapper;
import com.movie.mapper.extend.TblAuthPermissionExtendMapper;
import com.movie.model.*;
import com.movie.service.AuthUserService;
import com.movie.service.ParamService;
import com.movie.util.common.DateUtil;
import com.movie.util.oss.OssUploadByPartUtil;
import com.movie.util.request.TblAuthUserPageReq;
import com.movie.util.request.TblParamPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import com.movie.util.response.ResponseCode;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class AuthUserServiceImpl implements AuthUserService {
    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Resource
    private TblAuthUserMapper tblAuthUserMapper;
    @Resource
    private TblAuthPermissionExtendMapper tblAuthPermissionExtendMapper;


    @Override
    public TblAuthUser findUserByNickName(String nickname) {
        TblAuthUserExample example = new TblAuthUserExample();
        example.createCriteria().andNicknameEqualTo(nickname);
        List<TblAuthUser> tblAuthUsers = tblAuthUserMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(tblAuthUsers)) {
            //更新客户的最近登录时间
            TblAuthUser tblAuthUser = tblAuthUsers.get(0);
            tblAuthUser.setLastLoginTime(new Date());
            tblAuthUserMapper.updateByPrimaryKeySelective(tblAuthUser);
            return tblAuthUsers.get(0);
        }
        return null;

    }
    @Override
    public CommonResp<TblAuthUser> save(TblAuthUser tblAuthUser) {
        CommonResp<TblAuthUser> resp = new CommonResp<TblAuthUser>();
        try {
            //初始密码000000
            tblAuthUser.setPswd("000000");
            tblAuthUserMapper.insertSelective(tblAuthUser);
            resp.setResultList(null);
        } catch (Exception e) {
            logger.error("保存异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public PageResp<TblAuthUser> selectListByPage(TblAuthUserPageReq pageReq) {
        PageResp<TblAuthUser> resp = new PageResp<TblAuthUser>();
        TblAuthUserExample example = new TblAuthUserExample();
        try {
            Integer offset = pageReq.getOffset() == null ? 0 : pageReq.getOffset();
            Integer limit = pageReq.getLimit() == null ? 10 : pageReq.getLimit();
            PageHelper.offsetPage(offset, limit);
            if (null != pageReq) {
                TblAuthUserExample.Criteria criteria = example.createCriteria();
                if (!StringUtils.isBlank(pageReq.getNickname())) {
                    criteria.andNicknameLike("%" + pageReq.getNickname() + "%");
                }
                if (!Objects.isNull(pageReq.getStatus())) {
                    criteria.andStatusEqualTo(pageReq.getStatus());
                }
                if(!StringUtils.isBlank(pageReq.getLastLoginTimeStr())){
                    String[] times = pageReq.getLastLoginTimeStr().split(" - ");
                    criteria.andLastLoginTimeBetween(DateUtil.parse(times[0],DateUtil.YYYYMMDDCOMMON),DateUtil.parse(times[1],DateUtil.YYYYMMDDCOMMON));
                }
            }
            List<TblAuthUser> list = tblAuthUserMapper.selectByExample(example);
            Integer total = tblAuthUserMapper.countByExample(example);
            resp.setTotalPage(total % limit == 0 ? total / limit : (total / limit + 1));
            resp.setTotal(total);
            resp.setOffset(offset);
            resp.setLimit(limit);
            resp.setResultList(list);
        } catch (Exception e) {
            logger.error("获取异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }
    @Override
    public CommonResp<String> delete(String ids) {
        CommonResp<String> resp = new CommonResp<String>();
        try {
            TblAuthUserExample example = new TblAuthUserExample();
            String[] idLongs =  ids.split(",");
            List<Long> values = new ArrayList<Long>();
            for(String id :idLongs){
                values.add(Long.parseLong(id));
            }
            example.createCriteria().andIdIn(values);
            tblAuthUserMapper.deleteByExample(example);
        } catch (Exception e) {
            logger.error("删除异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }



    @Override
    public CommonResp<TblAuthUser> update(TblAuthUser tblAuthUser) {
        CommonResp<TblAuthUser> resp = new CommonResp<TblAuthUser>();
        try {
            tblAuthUserMapper.updateByPrimaryKeySelective(tblAuthUser);
            resp.setResultList(null);
        } catch (Exception e) {
            logger.error("保存异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public TblAuthUser selectByKey(Long id) {
        return tblAuthUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TblAuthPermission> findUserPermissionByNickName(String nickname) {
        try {
            List<TblAuthPermission> list = tblAuthPermissionExtendMapper.findUserPermissionByNickName(nickname);
            return list;
        } catch (Exception e) {
            logger.error("保存异常" + e.getMessage());
            return null;
        }
    }
}