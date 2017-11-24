package com.movie.web;

import com.alibaba.fastjson.JSONObject;
import com.movie.model.TblAuthRole;
import com.movie.model.TblAuthUser;
import com.movie.model.TblParam;
import com.movie.model.extend.TblAuthRoleExtend;
import com.movie.model.extend.TblAuthUserExtend;
import com.movie.service.AuthRoleService;
import com.movie.service.AuthUserService;
import com.movie.service.ParamService;
import com.movie.util.request.TblAuthRolePageReq;
import com.movie.util.request.TblAuthUserPageReq;
import com.movie.util.request.TblParamPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * @author sh00859
 * @description 实例代码
 * @date 2017/8/21
 */
@Controller
@RequestMapping("/user")
public class UserController {

    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Autowired
    private AuthUserService authUserService;

    /**
     * @description 主界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/main"})
    public ModelAndView search(Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        return new ModelAndView("/user/main", map);

    }


    /**
     * @description 列表数据
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/data"})
    @ResponseBody
    public PageResp<TblAuthUser> list(TblAuthUserPageReq pageReq) throws Exception {
        PageResp<TblAuthUser> resp = authUserService.selectListByPage(pageReq);
        return resp;
    }


    /**
     * @description 添加界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/add"})
    public String add() throws Exception {
        return "/user/add";
    }


    /**
     * @description 保存(此处需要将对象转换为json String类型ps:ajaxFileUpload版本太老, 重构太麻烦)
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/save"})
    @ResponseBody
    public CommonResp<TblAuthUser> save(TblAuthUser tblAuthUser) throws Exception {
        return authUserService.save(tblAuthUser);
    }


    /**
     * @description 更新页面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/edit"})
    public ModelAndView edit(TblAuthUser tblAuthUser, Map map) throws Exception {
        map.put("data", authUserService.selectByKey(tblAuthUser.getId()));
        return new ModelAndView("/user/edit", map);
    }

    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/update"})
    @ResponseBody
    public CommonResp<TblAuthUser> update(TblAuthUser tblAuthUser) throws Exception {
        return authUserService.update(tblAuthUser);
    }

    /**
     * @description 删除
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/delete"})
    @ResponseBody
    public CommonResp<String> delete(String ids) throws Exception {
        return authUserService.delete(ids);
    }



    @RequestMapping(value = {"/allot"})
    public ModelAndView allot(String id,Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        return new ModelAndView("/user/allot", map);
    }


}
