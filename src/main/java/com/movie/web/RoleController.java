package com.movie.web;

import com.movie.model.TblAuthRole;
import com.movie.model.TblParam;
import com.movie.model.extend.TblAuthRoleExtend;
import com.movie.service.AuthRoleService;
import com.movie.util.request.TblAuthRolePageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
@RequestMapping("/role")
public class RoleController {

    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Autowired
    private AuthRoleService authRoleService;

    /**
     * @description 主界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/main"})
    public ModelAndView search(Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        return new ModelAndView("/role/main", map);

    }


    /**
     * @description 列表数据
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/data"})
    @ResponseBody
    public PageResp<TblAuthRole> list(TblAuthRolePageReq pageReq) throws Exception {
        PageResp<TblAuthRole> resp = authRoleService.selectListByPage(pageReq);
        return resp;
    }


    /**
     * @description 添加界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/add"})
    public String add() throws Exception {
        return "/role/add";
    }


    /**
     * @description 保存(此处需要将对象转换为json String类型ps:ajaxFileUpload版本太老, 重构太麻烦)
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/save"})
    @ResponseBody
    public CommonResp<TblAuthRole> save(TblAuthRole record) throws Exception {
        return authRoleService.save(record);
    }


    /**
     * @description 更新页面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/edit"})
    public ModelAndView edit(TblAuthRole tblAuthUser, Map map) throws Exception {
        map.put("data", authRoleService.selectByKey(tblAuthUser.getId()));
        return new ModelAndView("/role/edit", map);
    }

    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/update"})
    @ResponseBody
    public CommonResp<TblAuthRole> update(TblAuthRole record) throws Exception {
        return authRoleService.update(record);
    }

    /**
     * @description 删除
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/delete"})
    @ResponseBody
    public CommonResp<String> delete(String ids) throws Exception {
        return authRoleService.delete(ids);
    }

    /**
     * @description 用户角色数据
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/userroledata"})
    @ResponseBody
    public PageResp<TblAuthRoleExtend> userroledata(TblAuthRolePageReq pageReq) throws Exception {
        PageResp<TblAuthRoleExtend> resp = authRoleService.selectUserRoleListByPage(pageReq);
        return resp;
    }

}
