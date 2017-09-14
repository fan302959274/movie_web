package com.movie.web;

import com.alibaba.fastjson.JSON;
import com.movie.model.TblParam;
import com.movie.model.TblVideo;
import com.movie.service.ParamService;
import com.movie.service.VideoService;
import com.movie.util.request.TblVideoPageReq;
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
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.Map;


/**
 * @author sh00859
 * @description 实例代码
 * @date 2017/8/21
 */
@Controller
@RequestMapping("/video")
public class VideoController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private VideoService videoService;
    @Autowired
    private ParamService paramService;

    /**
     * @description 搜索界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/main"})
    public ModelAndView search(Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        param.setParamType("001");
        map.put("video_type_list",paramService.selectList(param ));
        return new ModelAndView("/video/main", map);

    }

    /**
     * @description 列表界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/data"})
    @ResponseBody
    public PageResp<TblVideo> list(TblVideoPageReq pageReq) throws Exception {
        PageResp<TblVideo> resp = videoService.selectListByPage(pageReq);
        return resp;
    }


    /**
     * @description 添加界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/add"})
    public ModelAndView add(Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        param.setParamType("001");
        map.put("video_type_list",paramService.selectList(param ));
        param.setParamType("002");
        map.put("video_tag_list",paramService.selectList(param ));
        return new ModelAndView("/video/add", map);
    }


    /**
     * @description 保存
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/save"})
    @ResponseBody
    public CommonResp<TblVideo> save(HttpServletRequest request, String videoName, BigDecimal videoDuration, BigDecimal videoSize, String videoType, String videoViewPath, String videoTag) throws Exception {
        MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("videoPoster");
        return videoService.save(file , videoName,  videoDuration, videoSize, videoType, videoViewPath, videoTag);
    }

    /**
     * @description 上传页面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/uploadpage"})
    public ModelAndView uploadpage(TblVideo tblVideo, Map map) throws Exception {
        map.put("data",tblVideo);
        return new ModelAndView("/video/upload",map);
    }

    /**
     * @description 上传文件
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/upload"})
    @ResponseBody
    public CommonResp<TblVideo> upload(HttpServletRequest request, Long id) throws Exception {
        MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("videoViewPath");
        return videoService.upload(file,id);
    }

    /**
     * @description 删除
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/delete"})
    @ResponseBody
    public CommonResp<String> delete(String ids) throws Exception {
        return videoService.delete(ids);
    }


    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/edit"})
    public ModelAndView edit(TblVideo tblVideo,Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        param.setParamType("001");
        map.put("video_type_list",paramService.selectList(param ));
        param.setParamType("002");
        map.put("video_tag_list",paramService.selectList(param ));
        map.put("data",videoService.selectByKey(tblVideo.getId()));
        return new ModelAndView("/video/edit", map);
    }

    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/update"})
    @ResponseBody
    public CommonResp<TblVideo> update(HttpServletRequest request, Long id,String videoName, BigDecimal videoDuration, BigDecimal videoSize, String videoType, String videoViewPath, String videoTag) throws Exception {
        MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("videoPoster");
        return videoService.update(file, id, videoName,  videoDuration,  videoSize,  videoType,  videoViewPath,  videoTag);
    }


}
