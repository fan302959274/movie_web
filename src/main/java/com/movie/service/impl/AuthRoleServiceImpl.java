package com.movie.service.impl;

import com.github.pagehelper.PageHelper;
import com.movie.mapper.TblAuthRoleMapper;
import com.movie.mapper.TblAuthUserMapper;
import com.movie.model.TblAuthRole;
import com.movie.model.TblAuthRoleExample;
import com.movie.service.AuthRoleService;
import com.movie.service.AuthUserService;
import com.movie.util.common.DateUtil;
import com.movie.util.request.TblAuthRolePageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import com.movie.util.response.ResponseCode;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class AuthRoleServiceImpl implements AuthRoleService {
    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Resource
    private TblAuthRoleMapper tblAuthRoleMapper;



    @Override
    public CommonResp<TblAuthRole> save(TblAuthRole record) {
        CommonResp<TblAuthRole> resp = new CommonResp<TblAuthRole>();
        try {
            tblAuthRoleMapper.insertSelective(record);
            resp.setResultList(null);
        } catch (Exception e) {
            logger.error("保存user异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public PageResp<TblAuthRole> selectListByPage(TblAuthRolePageReq pageReq) {
        PageResp<TblAuthRole> resp = new PageResp<TblAuthRole>();
        TblAuthRoleExample example = new TblAuthRoleExample();
        try {
            Integer offset = pageReq.getOffset() == null ? 0 : pageReq.getOffset();
            Integer limit = pageReq.getLimit() == null ? 10 : pageReq.getLimit();
            PageHelper.offsetPage(offset, limit);
            if (null != pageReq) {
                TblAuthRoleExample.Criteria criteria = example.createCriteria();
                if (!StringUtils.isBlank(pageReq.getName())) {
                    criteria.andNameLike("%" + pageReq.getName() + "%");
                }
                if (!StringUtils.isBlank(pageReq.getCode())) {
                    criteria.andCodeEqualTo(pageReq.getCode());
                }
            }
            List<TblAuthRole> list = tblAuthRoleMapper.selectByExample(example);
            Integer total = tblAuthRoleMapper.countByExample(example);
            resp.setTotalPage(total % limit == 0 ? total / limit : (total / limit + 1));
            resp.setTotal(total);
            resp.setOffset(offset);
            resp.setLimit(limit);
            resp.setResultList(list);
        } catch (Exception e) {
            logger.error("获取role列表异常" + e.getMessage());
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
            TblAuthRoleExample example = new TblAuthRoleExample();
            String[] idLongs =  ids.split(",");
            List<Long> values = new ArrayList<Long>();
            for(String id :idLongs){
                values.add(Long.parseLong(id));
            }
            example.createCriteria().andIdIn(values);
            tblAuthRoleMapper.deleteByExample(example);
        } catch (Exception e) {
            logger.error("删除role列表异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }



    @Override
    public CommonResp<TblAuthRole> update(TblAuthRole record) {
        CommonResp<TblAuthRole> resp = new CommonResp<TblAuthRole>();
        try {
            tblAuthRoleMapper.updateByPrimaryKeySelective(record);
            resp.setResultList(null);
        } catch (Exception e) {
            logger.error("保存user列表异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public TblAuthRole selectByKey(Long id) {
        return tblAuthRoleMapper.selectByPrimaryKey(id);
    }

}