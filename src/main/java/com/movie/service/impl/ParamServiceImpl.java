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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParamServiceImpl implements ParamService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private TblParamMapper tblParamMapper;

    @Value("${endpoint}")
    private String endpoint;
    @Value("${accessKeyId}")
    private String accessKeyId;
    @Value("${accessKeySecret}")
    private String accessKeySecret;
    @Value("${bucketName}")
    private String bucketName;

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

    @Override
    public CommonResp<TblParam> save(TblParam tblParam) {
        CommonResp<TblParam> resp = new CommonResp<TblParam>();
        try {
            tblParamMapper.insertSelective(tblParam);
            resp.setResultList(null);
        } catch (Exception e) {
            logger.error("保存param列表异常" + e.getMessage());
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
            Integer page = pageReq.getPage() == null ? 1 : pageReq.getPage();
            Integer pageSize = pageReq.getPageSize() == null ? 10 : pageReq.getPageSize();
            PageHelper.startPage(page, pageSize);
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
            resp.setTotalPage(total % pageSize == 0 ? total / pageSize : (total / pageSize + 1));
            resp.setTotal(total);
            resp.setPage(page);
            resp.setPageSize(pageSize);
            resp.setResultList(list);
        } catch (Exception e) {
            logger.error("获取param列表异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public CommonResp<String> delete(TblParam tblParam) {
        CommonResp<String> resp = new CommonResp<String>();
        try {
            tblParamMapper.deleteByPrimaryKey(tblParam.getId());
        } catch (Exception e) {
            logger.error("删除param列表异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public CommonResp<TblParam> upload(MultipartFile file,Long id) {
        CommonResp<TblParam> resp = new CommonResp<TblParam>();
        if (!file.isEmpty()) {
            try {
                // 上传文件至oss
                String uploadResult = OssUploadByPartUtil.fileUpload(file, endpoint, accessKeyId, accessKeySecret, bucketName);
                TblParam tblParam = new TblParam();
                tblParam.setId(id);
                tblParam.setParamUrl(uploadResult);
                tblParamMapper.updateByPrimaryKeySelective(tblParam);
            } catch (Exception e) {
                logger.error("上传参数文件异常" + e.getMessage());
                resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
                resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
                return resp;
            }
        } else {
            resp.setCode(ResponseCode.FILE_IS_EMPTY.getCode());
            resp.setMsg(ResponseCode.FILE_IS_EMPTY.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public CommonResp<TblParam> edit(TblParam tblParam) {
        CommonResp<TblParam> resp = new CommonResp<TblParam>();
        try {
            tblParamMapper.updateByPrimaryKeySelective(tblParam);
            resp.setResultList(null);
        } catch (Exception e) {
            logger.error("编辑param异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }
}