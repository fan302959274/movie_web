package com.movie.service.impl;

import com.movie.mapper.TblVideoMapper;
import com.movie.mapper.extend.TblVideoExtendMapper;
import com.movie.model.TblVideo;
import com.movie.model.TblVideoExample;
import com.movie.model.extend.TblVideoExtend;
import com.movie.service.VideoService;
import com.movie.util.oss.OssUploadByPartUtil;
import com.movie.util.request.TblVideoPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import com.movie.util.response.ResponseCode;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VideoServiceImpl implements VideoService {
    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Resource
    private TblVideoMapper tblVideoMapper;
    @Resource
    private TblVideoExtendMapper tblVideoExtendMapper;
    @Value("${endpoint}")
    private String endpoint;
    @Value("${accessKeyId}")
    private String accessKeyId;
    @Value("${accessKeySecret}")
    private String accessKeySecret;
    @Value("${bucketName.pic}")
    private String bucketName;


    @Override
    public CommonResp<TblVideo> save(MultipartFile file, String videoName, BigDecimal videoDuration, BigDecimal videoSize, String videoType,String videoViewPath, String videoTag,String videoIntroduction) {

        CommonResp<TblVideo> resp = new CommonResp<TblVideo>();
        try {
            if (!file.isEmpty()) {
                // 上传文件至oss
                String uploadResult = OssUploadByPartUtil.fileUpload(file, endpoint, accessKeyId, accessKeySecret, bucketName);
                TblVideo tblVideo = new TblVideo();
                tblVideo.setVideoName(videoName);
                tblVideo.setVideoDuration(videoDuration);
                tblVideo.setVideoSize(videoSize);
                tblVideo.setVideoType(videoType);
                tblVideo.setVideoViewPath(videoViewPath);
                tblVideo.setVideoTag(videoTag);
                tblVideo.setVideoIntroduction(videoIntroduction);
                tblVideo.setVideoPoster(uploadResult);
                tblVideoMapper.insertSelective(tblVideo);
            } else {
                resp.setCode(ResponseCode.FILE_IS_EMPTY.getCode());
                resp.setMsg(ResponseCode.FILE_IS_EMPTY.getMsg());
                return resp;
            }
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
    public PageResp<TblVideoExtend> selectListByPage(TblVideoPageReq pageReq) {
        PageResp<TblVideoExtend> resp = new PageResp<TblVideoExtend>();
        TblVideoExample example = new TblVideoExample();
        Map param = new HashMap();
        try {
            Integer offset = pageReq.getOffset() == null ? 0 : pageReq.getOffset();
            Integer limit = pageReq.getLimit() == null ? 10 : pageReq.getLimit();
            param.put("offset",offset);
            param.put("limit",limit);
            if (null != pageReq) {
                TblVideoExample.Criteria criteria = example.createCriteria();
                if (!StringUtils.isBlank(pageReq.getVideoName())) {
                    criteria.andVideoNameLike("%"+pageReq.getVideoName()+"%");
                    param.put("videoName",pageReq.getVideoName());
                }
                if (!StringUtils.isBlank(pageReq.getVideoType())) {
                    criteria.andVideoTypeEqualTo(pageReq.getVideoType());
                    param.put("videoType",pageReq.getVideoType());
                }
            }
            List<TblVideoExtend> list = tblVideoExtendMapper.selectByExample(param);
            Integer total = tblVideoMapper.countByExample(example);
            resp.setCountPage(total % limit == 0 ? total / limit : (total / limit + 1));
            resp.setCount(total);
            resp.setOffset(offset);
            resp.setLimit(limit);
            resp.setData(list);
        } catch (Exception e) {
            logger.error("获取异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }

    @Override
    public CommonResp<TblVideo> upload(MultipartFile file, Long id) {
        CommonResp<TblVideo> resp = new CommonResp<TblVideo>();
        if (!file.isEmpty()) {
            try {
                // 上传文件至oss
                String uploadResult = OssUploadByPartUtil.fileUpload(file, endpoint, accessKeyId, accessKeySecret, bucketName);
                TblVideo tblVideo = new TblVideo();
                tblVideo.setId(id);
                tblVideo.setVideoViewPath(uploadResult);
                tblVideoMapper.updateByPrimaryKeySelective(tblVideo);
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
    public CommonResp<String> delete(String ids) {
        CommonResp<String> resp = new CommonResp<String>();
        try {
            TblVideoExample example = new TblVideoExample();
            String[] idLongs =  ids.split(",");
            List<Long> values = new ArrayList<Long>();
            for(String id :idLongs){
                values.add(Long.parseLong(id));
            }
            example.createCriteria().andIdIn(values);
            tblVideoMapper.deleteByExample(example);
        } catch (Exception e) {
            logger.error("删除异常" + e.getMessage());
            resp.setCode(ResponseCode.SYSTEM_ERROR.getCode());
            resp.setMsg(ResponseCode.SYSTEM_ERROR.getMsg());
            return resp;
        }
        return resp;
    }


    @Override
    public CommonResp<TblVideo> update(MultipartFile file, Long id,String videoName, BigDecimal videoDuration, BigDecimal videoSize, String videoType,String videoViewPath, String videoTag,String videoIntroduction) {

        CommonResp<TblVideo> resp = new CommonResp<TblVideo>();
        try {
            TblVideo tblVideo = new TblVideo();
            tblVideo.setId(id);
            tblVideo.setVideoName(videoName);
            tblVideo.setVideoDuration(videoDuration);
            tblVideo.setVideoSize(videoSize);
            tblVideo.setVideoType(videoType);
            tblVideo.setVideoViewPath(videoViewPath);
            tblVideo.setVideoTag(videoTag);
            tblVideo.setVideoIntroduction(videoIntroduction);
            if (!file.isEmpty()) {
                // 上传文件至oss
                String uploadResult = OssUploadByPartUtil.fileUpload(file, endpoint, accessKeyId, accessKeySecret, bucketName);
                tblVideo.setVideoPoster(uploadResult);
            }
            tblVideoMapper.updateByPrimaryKeySelective(tblVideo);
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
    public TblVideo selectByKey(Long id) {
        return tblVideoMapper.selectByPrimaryKey(id);
    }
}