package com.movie.service;

import com.movie.model.TblAuthRole;
import com.movie.model.TblAuthUser;
import com.movie.model.extend.TblAuthRoleExtend;
import com.movie.model.extend.TblAuthUserExtend;
import com.movie.util.request.TblAuthRolePageReq;
import com.movie.util.request.TblAuthUserPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;

public interface AuthRoleService {

    /**
     * @description 获取参数
     * @author sh00859
     * @date 2017/7/13
     */
    public TblAuthRole selectByKey(Long id);

    /**
     * @description 分页查询记录
     * @author sh00859
     * @date 2017/7/13
     */
    public PageResp<TblAuthRole> selectListByPage(TblAuthRolePageReq pageReq);

    /**
     * @description 保存记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblAuthRole> save(TblAuthRole record);

    /**
     * @description 修改记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblAuthRole> update(TblAuthRole record);

    /**
     * @description 删除记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<String> delete(String ids);

    /**
     * @description 分页查询记录
     * @author sh00859
     * @date 2017/7/13
     */
    public PageResp<TblAuthRoleExtend> selectUserRoleListByPage(TblAuthRolePageReq pageReq);

}