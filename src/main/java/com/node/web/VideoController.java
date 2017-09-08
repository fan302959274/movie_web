package com.node.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author sh00859
 * @description 实例代码
 * @date 2017/8/21
 */
@Controller
@RequestMapping("/video")
public class VideoController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


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
    public String getName() throws Exception {
        return "/video/table";
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


}
