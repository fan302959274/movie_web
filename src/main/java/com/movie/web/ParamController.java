package com.movie.web;

import com.movie.model.TblParam;
import com.movie.model.TblParam;
import com.movie.service.ParamService;
import com.movie.util.request.TblParamPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
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
     * @description 搜索界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/search"})
    public ModelAndView search(Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        return new ModelAndView("/param/search", map);

    }


    /**
     * @description 列表界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/list"})
    public ModelAndView list(TblParamPageReq pageReq, Map map) throws Exception {
        PageResp<TblParam> resp = paramService.selectListByPage(pageReq);
        map.put("data", resp);
        return new ModelAndView("/param/list", map);
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
     * @description 保存
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/save"})
    @ResponseBody
    public CommonResp<TblParam> save(HttpServletRequest request, String paramValue, String paramType,String paramCode, String paramDesc) throws Exception {
        MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("paramUrl");
        return paramService.save(file, paramValue,  paramType, paramCode,  paramDesc);
    }


    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/edit"})
    @ResponseBody
    public CommonResp<TblParam> edit(TblParam tblParam) throws Exception {
        return paramService.edit(tblParam);
    }

    /**
     * @description 删除
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/delete"})
    @ResponseBody
    public CommonResp<String> delete(TblParam tblParam) throws Exception {
        return paramService.delete(tblParam);
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


}
