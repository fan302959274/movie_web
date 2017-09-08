package com.movie.service.impl;

import com.github.pagehelper.PageHelper;
import com.movie.mapper.TblVideoMapper;
import com.movie.model.TblVideo;
import com.movie.model.TblVideoExample;
import com.movie.service.VideoService;
import com.movie.util.request.TblVideoPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import com.movie.util.response.ResponseCode;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private TblVideoMapper tblVideoMapper;
    @Value("${endpoint}")
    private String endpoint;
    @Value("${accessKeyId}")
    private String accessKeyId;
    @Value("${accessKeySecret}")
    private String accessKeySecret;
    @Value("${bucketName}")
    private String bucketName;


    @Override
    public CommonResp<TblVideo> save(TblVideo tblVideo) {
        CommonResp<TblVideo> resp = new CommonResp<TblVideo>();
        try {
            tblVideoMapper.insertSelective(tblVideo);
            resp.setResultList(null);
        } catch (Exception e) {
            logger.error("保存video列表异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public PageResp<TblVideo> selectListByPage(TblVideoPageReq pageReq) {
        PageResp<TblVideo> resp = new PageResp<TblVideo>();
        TblVideoExample example = new TblVideoExample();
        try {
            Integer page = pageReq.getPage() == null ? 1 : pageReq.getPage();
            Integer pageSize = pageReq.getPageSize() == null ? 10 : pageReq.getPageSize();
            PageHelper.startPage(page, pageSize);
            if (null != pageReq) {
                TblVideoExample.Criteria criteria = example.createCriteria();
                if (!StringUtils.isBlank(pageReq.getVideoName())) {
                    criteria.andVideoNameLike("%" + pageReq.getVideoName() + "%");
                }
                if (!StringUtils.isBlank(pageReq.getVideoType())) {
                    criteria.andVideoTypeEqualTo(pageReq.getVideoType());
                }
            }
            List<TblVideo> list = tblVideoMapper.selectByExample(example);
            Integer total = tblVideoMapper.countByExample(example);
            resp.setTotalPage(total % pageSize == 0 ? total / pageSize : (total / pageSize + 1));
            resp.setTotal(total);
            resp.setPage(page);
            resp.setPageSize(pageSize);
            resp.setResultList(list);
        } catch (Exception e) {
            logger.error("获取video列表异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }
}