package com.movie.service;

import com.movie.model.TblParam;
import com.movie.model.TblVideo;
import com.movie.util.request.TblVideoPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public interface VideoService {


    /**
     * @description 保存记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblVideo> save(MultipartFile file,String videoName, BigDecimal videoDuration, BigDecimal videoSize, String videoType,String videoViewPath, String videoTag,String videoIntroduction);

    /**
     * @description 分页查询记录
     * @author sh00859
     * @date 2017/7/13
     */
    public PageResp<TblVideo> selectListByPage(TblVideoPageReq pageReq);

    /**
     * @description 上传文件
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblVideo> upload(MultipartFile file, Long id);

    /**
     * @description 删除记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<String> delete(String ids);

    /**
     * @description 获取视频
     * @author sh00859
     * @date 2017/7/13
     */
    public TblVideo selectByKey(Long id);

    /**
     * @description 保存记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblVideo> update(MultipartFile file,Long id,String videoName, BigDecimal videoDuration, BigDecimal videoSize, String videoType,String videoViewPath, String videoTag,String videoIntroduction);

}