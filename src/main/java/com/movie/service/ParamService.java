package com.movie.service;

import com.movie.model.TblParam;
import com.movie.model.TblParamExample;
import com.movie.model.TblVideo;
import com.movie.util.request.TblParamPageReq;
import com.movie.util.request.TblVideoPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

public interface ParamService {


    /**
     * @description 获取参数
     * @author sh00859
     * @date 2017/7/13
     */
    public TblParam selectByKey(Long id);
    /**
     * @description 获取参数
     * @author sh00859
     * @date 2017/7/13
     */
    public List<TblParam> selectList(TblParam record);

    /**
     * @description 分页查询记录
     * @author sh00859
     * @date 2017/7/13
     */
    public PageResp<TblParam> selectListByPage(TblParamPageReq pageReq);

    /**
     * @description 保存记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblParam> save(MultipartFile file,String paramValue, String paramType, String paramCode, String paramDesc);

    /**
     * @description 修改记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblParam> update(MultipartFile file,Long id,String paramValue, String paramType, String paramCode, String paramDesc);

    /**
     * @description 删除记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<String> delete(String ids);


}