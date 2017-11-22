package com.movie.web;

import com.movie.model.TblAuthUser;
import com.movie.model.TblParam;
import com.movie.util.response.CommonResp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * @author sh00859
 * @description 登录相关
 * @date 2017/8/21
 */
@Controller
public class LoginController {

    protected final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * 登录页面
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

    /**
     * 登录页面
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"/ajaxlogin"})
    @ResponseBody
    public CommonResp<TblAuthUser> ajaxlogin(TblAuthUser tblAuthUser, HttpSession session) throws Exception {
        CommonResp<TblAuthUser> resp = new CommonResp<>();

        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(tblAuthUser.getNickname(), tblAuthUser.getPswd());
        Subject subject = SecurityUtils.getSubject();
        subject.login(usernamePasswordToken);   //完成登录
        TblAuthUser user = (TblAuthUser) subject.getPrincipal();
        session.setAttribute("user", user);
        return resp;
    }



}
