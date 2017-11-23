package com.movie.service;

import com.movie.model.TblAuthUser;
import com.movie.util.request.TblAuthUserPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;

public interface AuthUserService {
    /**
     *@description 通过名称获取
     *@author sh00859
     *@date 2017/11/23
     */
    TblAuthUser findUserByNickName(String nickname);

    /**
     * @description 获取参数
     * @author sh00859
     * @date 2017/7/13
     */
    public TblAuthUser selectByKey(Long id);

    /**
     * @description 分页查询记录
     * @author sh00859
     * @date 2017/7/13
     */
    public PageResp<TblAuthUser> selectListByPage(TblAuthUserPageReq pageReq);

    /**
     * @description 保存记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblAuthUser> save(TblAuthUser tblAuthUser);

    /**
     * @description 修改记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<TblAuthUser> update(TblAuthUser tblAuthUser);

    /**
     * @description 删除记录
     * @author sh00859
     * @date 2017/7/13
     */
    public CommonResp<String> delete(String ids);

}