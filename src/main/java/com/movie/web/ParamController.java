package com.movie.web;

import com.alibaba.fastjson.JSONObject;
import com.movie.model.TblParam;
import com.movie.model.TblParam;
import com.movie.service.ParamService;
import com.movie.util.request.TblParamPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Map;


/**
 * @author sh00859
 * @description 实例代码
 * @date 2017/8/21
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ParamService paramService;

    /**
     * @description 主界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/main"})
    public ModelAndView search(Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        return new ModelAndView("/param/main", map);

    }


    /**
     * @description 列表数据
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/data"})
    @ResponseBody
    public PageResp<TblParam> list(TblParamPageReq pageReq) throws Exception {
        PageResp<TblParam> resp = paramService.selectListByPage(pageReq);
        return resp;
    }


    /**
     * @description 添加界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/add"})
    public String add() throws Exception {
        return "/param/add";
    }


    /**
     * @description 保存(此处需要将对象转换为json String类型ps:ajaxFileUpload版本太老,重构太麻烦)
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/save"})
    @ResponseBody
    public String save(HttpServletRequest request, String paramValue, String paramType,String paramCode, String paramDesc) throws Exception {
        CommonResp<TblParam> resp = new CommonResp<TblParam>();
        MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("paramUrl");
        resp = paramService.save(file, paramValue,  paramType, paramCode,  paramDesc);
        return JSONObject.toJSONString(resp);
    }


    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/edit"})
    public ModelAndView edit(TblParam tblParam,Map map) throws Exception {
        map.put("data",paramService.selectByKey(tblParam.getId()));
        return new ModelAndView("/param/edit", map);
    }

    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/update"})
    @ResponseBody
    public CommonResp<TblParam> update(HttpServletRequest request, Long id,String paramValue, String paramType,String paramCode, String paramDesc) throws Exception {
        MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("paramUrl");
        return paramService.update(file, id,paramValue,  paramType, paramCode,  paramDesc);
    }

    /**
     * @description 删除
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/delete"})
    @ResponseBody
    public CommonResp<String> delete(String ids) throws Exception {
        return paramService.delete(ids);
    }


    /**
     * @description 上传页面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/uploadpage"})
    public ModelAndView uploadpage(TblParam tblParam, Map map) throws Exception {
        map.put("data",tblParam);
        return new ModelAndView("/param/upload",map);
    }

    /**
     * @description 上传文件
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/upload"})
    @ResponseBody
    public CommonResp<TblParam> upload(HttpServletRequest request,Long id) throws Exception {
        MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("paramUrl");
        return paramService.upload(file,id);
    }





    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/search_id"})
    @ResponseBody
    public CommonResp<TblParam> video_type(TblParam tblParam) throws Exception {
        return paramService.video_type(tblParam.getId());
    }
}
