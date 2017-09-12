package com.movie.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author sh00859
 * @description 首页代码
 * @date 2017/8/21
 */
@Controller
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 首页
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"/"})
    public String index() throws Exception {
        return "/index";
    }



}
