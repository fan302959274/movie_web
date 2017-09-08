package com.movie.service;

import com.movie.model.TblVideo;
import com.movie.util.request.TblVideoPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;

public interface VideoService {


    /**
     * @description 保存记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblVideo> save(TblVideo tblVideo);

    /**
     * @description 分页查询记录
     * @author sh00859
     * @date 2017/7/13
     */
    public PageResp<TblVideo> selectListByPage(TblVideoPageReq pageReq);

}