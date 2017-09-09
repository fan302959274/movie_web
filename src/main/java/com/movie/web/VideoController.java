package com.movie.web;

import com.movie.model.TblVideo;
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
import org.springframework.web.servlet.ModelAndView;

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

    /**
     * @description 搜索界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/search"})
    public String search() throws Exception {
        return "/video/search";
    }

    /**
     * @description 列表界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/list"})
    public ModelAndView list(TblVideoPageReq pageReq, Map map) throws Exception {
        PageResp<TblVideo> resp = videoService.selectListByPage(pageReq);
        map.put("data", resp);
        return new ModelAndView("/video/list", map);
    }


    /**
     * @description 添加界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/add"})
    public String add() throws Exception {
        return "/video/add";
    }


    /**
     * @description 保存
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/save"})
    @ResponseBody
    public CommonResp<TblVideo> save(TblVideo tblVideo) throws Exception {
        return videoService.save(tblVideo);
    }


}
