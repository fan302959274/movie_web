package com.movie.service;

import com.movie.model.TblAuthPermission;
import com.movie.util.request.TblAuthPermissionPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;

public interface AuthPermissionService {

    /**
     * @description 获取参数
     * @author sh00859
     * @date 2017/7/13
     */
    public TblAuthPermission selectByKey(Long id);

    /**
     * @description 分页查询记录
     * @author sh00859
     * @date 2017/7/13
     */
    public PageResp<TblAuthPermission> selectListByPage(TblAuthPermissionPageReq pageReq);

    /**
     * @description 保存记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblAuthPermission> save(TblAuthPermission record);

    /**
     * @description 修改记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblAuthPermission> update(TblAuthPermission record);

    /**
     * @description 删除记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<String> delete(String ids);

}