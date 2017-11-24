package com.movie.mapper.extend;

import com.movie.model.TblAuthPermission;
import com.movie.model.extend.TblAuthPermissionExtend;

import java.util.List;
import java.util.Map;

public interface TblAuthPermissionExtendMapper {
    List<TblAuthPermissionExtend> selectRolePermissionByExample(Map map);


    List<TblAuthPermission> findUserPermissionByNickName(String nickname);

}