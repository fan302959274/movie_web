package com.movie.web;

import com.movie.model.TblAuthPermission;
import com.movie.model.TblParam;
import com.movie.service.AuthPermissionService;
import com.movie.util.request.TblAuthPermissionPageReq;
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
@RequestMapping("/permission")
public class PermissionController {

    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Autowired
    private AuthPermissionService authPermissionService;

    /**
     * @description 主界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/main"})
    public ModelAndView search(Map map) throws Exception {
        //获取所有的视频类型
        TblParam param = new TblParam();
        return new ModelAndView("/permission/main", map);

    }


    /**
     * @description 列表数据
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/data"})
    @ResponseBody
    public PageResp<TblAuthPermission> list(TblAuthPermissionPageReq pageReq) throws Exception {
        PageResp<TblAuthPermission> resp = authPermissionService.selectListByPage(pageReq);
        return resp;
    }


    /**
     * @description 添加界面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/add"})
    public String add() throws Exception {
        return "/permission/add";
    }


    /**
     * @description 保存(此处需要将对象转换为json String类型ps:ajaxFileUpload版本太老, 重构太麻烦)
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/save"})
    @ResponseBody
    public CommonResp<TblAuthPermission> save(TblAuthPermission record) throws Exception {
        return authPermissionService.save(record);
    }


    /**
     * @description 更新页面
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/edit"})
    public ModelAndView edit(TblAuthPermission tblAuthUser, Map map) throws Exception {
        map.put("data", authPermissionService.selectByKey(tblAuthUser.getId()));
        return new ModelAndView("/permission/edit", map);
    }

    /**
     * @description 更新
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/update"})
    @ResponseBody
    public CommonResp<TblAuthPermission> update(TblAuthPermission record) throws Exception {
        return authPermissionService.update(record);
    }

    /**
     * @description 删除
     * @author sh00859
     * @date 2017/9/8
     */
    @RequestMapping(value = {"/delete"})
    @ResponseBody
    public CommonResp<String> delete(String ids) throws Exception {
        return authPermissionService.delete(ids);
    }

}
