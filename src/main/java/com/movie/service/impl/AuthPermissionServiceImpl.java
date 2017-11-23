package com.movie.service.impl;

import com.github.pagehelper.PageHelper;
import com.movie.mapper.TblAuthPermissionMapper;
import com.movie.model.TblAuthPermission;
import com.movie.model.TblAuthPermissionExample;
import com.movie.service.AuthPermissionService;
import com.movie.util.request.TblAuthPermissionPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import com.movie.util.response.ResponseCode;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthPermissionServiceImpl implements AuthPermissionService {
    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Resource
    private TblAuthPermissionMapper tblAuthPermissionMapper;



    @Override
    public CommonResp<TblAuthPermission> save(TblAuthPermission record) {
        CommonResp<TblAuthPermission> resp = new CommonResp<TblAuthPermission>();
        try {
            tblAuthPermissionMapper.insertSelective(record);
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
    public PageResp<TblAuthPermission> selectListByPage(TblAuthPermissionPageReq pageReq) {
        PageResp<TblAuthPermission> resp = new PageResp<TblAuthPermission>();
        TblAuthPermissionExample example = new TblAuthPermissionExample();
        try {
            Integer offset = pageReq.getOffset() == null ? 0 : pageReq.getOffset();
            Integer limit = pageReq.getLimit() == null ? 10 : pageReq.getLimit();
            PageHelper.offsetPage(offset, limit);
            if (null != pageReq) {
                TblAuthPermissionExample.Criteria criteria = example.createCriteria();
                if (!StringUtils.isBlank(pageReq.getName())) {
                    criteria.andNameLike("%" + pageReq.getName() + "%");
                }
                if (!StringUtils.isBlank(pageReq.getCode())) {
                    criteria.andCodeEqualTo(pageReq.getCode());
                }
            }
            List<TblAuthPermission> list = tblAuthPermissionMapper.selectByExample(example);
            Integer total = tblAuthPermissionMapper.countByExample(example);
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
            TblAuthPermissionExample example = new TblAuthPermissionExample();
            String[] idLongs =  ids.split(",");
            List<Long> values = new ArrayList<Long>();
            for(String id :idLongs){
                values.add(Long.parseLong(id));
            }
            example.createCriteria().andIdIn(values);
            tblAuthPermissionMapper.deleteByExample(example);
        } catch (Exception e) {
            logger.error("删除异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }



    @Override
    public CommonResp<TblAuthPermission> update(TblAuthPermission record) {
        CommonResp<TblAuthPermission> resp = new CommonResp<TblAuthPermission>();
        try {
            tblAuthPermissionMapper.updateByPrimaryKeySelective(record);
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
    public TblAuthPermission selectByKey(Long id) {
        return tblAuthPermissionMapper.selectByPrimaryKey(id);
    }

}