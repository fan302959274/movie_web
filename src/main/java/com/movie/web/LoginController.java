package com.movie.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author sh00859
 * @description 登录相关
 * @date 2017/8/21
 */
@Controller
public class LoginController {

    protected final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * 登录
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"/login"})
    public String login() throws Exception {
        return "login";
    }


}
