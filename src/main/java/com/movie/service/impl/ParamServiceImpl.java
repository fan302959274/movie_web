package com.movie.service.impl;

import com.github.pagehelper.PageHelper;
import com.movie.mapper.TblParamMapper;
import com.movie.model.TblParam;
import com.movie.model.TblParamExample;
import com.movie.service.ParamService;
import com.movie.util.oss.OssUploadByPartUtil;
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
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParamServiceImpl implements ParamService {
    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Resource
    private TblParamMapper tblParamMapper;

    @Value("${endpoint}")
    private String endpoint;
    @Value("${accessKeyId}")
    private String accessKeyId;
    @Value("${accessKeySecret}")
    private String accessKeySecret;
    @Value("${bucketName.pic}")
    private String bucketName;

    @Cacheable(value = "tblParamListCache",key = "#tblParam.paramType")
    @Override
    public List<TblParam> selectList(TblParam tblParam) {
        if (tblParam != null) {
            TblParamExample example = new TblParamExample();
            TblParamExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isBlank(tblParam.getParamType())) {
                criteria.andParamTypeEqualTo(tblParam.getParamType());
            }
            return tblParamMapper.selectByExample(example);
        }
        return null;

    }
    @CacheEvict(value="tblParamListCache",allEntries=true)// 清空tblParamListCache 缓存
    @Override
    public CommonResp<TblParam> save(MultipartFile file, String paramValue, String paramType, String paramCode, String paramDesc) {
        CommonResp<TblParam> resp = new CommonResp<TblParam>();
        TblParam tblParam = new TblParam();
        try {
            tblParam.setParamValue(paramValue);
            tblParam.setParamType(paramType);
            tblParam.setParamCode(paramCode);
            tblParam.setParamDesc(paramDesc);
            if (!file.isEmpty()) {
                // 上传文件至oss
                String uploadResult = OssUploadByPartUtil.fileUpload(file, endpoint, accessKeyId, accessKeySecret, bucketName);
                tblParam.setParamUrl(uploadResult);
            }
            tblParamMapper.insertSelective(tblParam);
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
    public PageResp<TblParam> selectListByPage(TblParamPageReq pageReq) {
        PageResp<TblParam> resp = new PageResp<TblParam>();
        TblParamExample example = new TblParamExample();
        try {
            Integer offset = pageReq.getOffset() == null ? 0 : pageReq.getOffset();
            Integer limit = pageReq.getLimit() == null ? 10 : pageReq.getLimit();
            PageHelper.offsetPage(offset, limit);
            if (null != pageReq) {
                TblParamExample.Criteria criteria = example.createCriteria();
                if (!StringUtils.isBlank(pageReq.getParamValue())) {
                    criteria.andParamValueLike("%" + pageReq.getParamValue() + "%");
                }
                if (!StringUtils.isBlank(pageReq.getParamCode())) {
                    criteria.andParamCodeEqualTo(pageReq.getParamCode());
                }
                if (!StringUtils.isBlank(pageReq.getParamType())) {
                    criteria.andParamTypeEqualTo(pageReq.getParamType());
                }
            }
            List<TblParam> list = tblParamMapper.selectByExample(example);
            Integer total = tblParamMapper.countByExample(example);
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
    @CacheEvict(value="tblParamListCache",allEntries=true)// 清空tblParamListCache 缓存
    @Override
    public CommonResp<String> delete(String ids) {
        CommonResp<String> resp = new CommonResp<String>();
        try {
            TblParamExample example = new TblParamExample();
            String[] idLongs =  ids.split(",");
            List<Long> values = new ArrayList<Long>();
            for(String id :idLongs){
                values.add(Long.parseLong(id));
            }
            example.createCriteria().andIdIn(values);
            tblParamMapper.deleteByExample(example);
        } catch (Exception e) {
            logger.error("删除异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }


    @CacheEvict(value="tblParamListCache",allEntries=true)// 清空tblParamListCache 缓存
    @Override
    public CommonResp<TblParam> update(MultipartFile file, Long id,String paramValue, String paramType, String paramCode, String paramDesc) {
        CommonResp<TblParam> resp = new CommonResp<TblParam>();
        TblParam tblParam = new TblParam();
        try {
            tblParam.setId(id);
            tblParam.setParamValue(paramValue);
            tblParam.setParamType(paramType);
            tblParam.setParamCode(paramCode);
            tblParam.setParamDesc(paramDesc);
            if (!file.isEmpty()) {
                // 上传文件至oss
                String uploadResult = OssUploadByPartUtil.fileUpload(file, endpoint, accessKeyId, accessKeySecret, bucketName);
                tblParam.setParamUrl(uploadResult);
            }
            tblParamMapper.updateByPrimaryKeySelective(tblParam);
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
    public TblParam selectByKey(Long id) {
        return tblParamMapper.selectByPrimaryKey(id);
    }


}