package com.movie.service;

import com.movie.model.TblParam;
import com.movie.model.TblParamExample;
import com.movie.model.TblVideo;
import com.movie.util.request.TblVideoPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;

import java.util.List;

public interface ParamService {


    /**
     * @description 获取参数
     * @author sh00859
     * @date 2017/7/13
     */
    public List<TblParam> selectList(TblParam tblParam);

}