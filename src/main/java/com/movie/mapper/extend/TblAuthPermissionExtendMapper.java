package com.movie.mapper.extend;

import com.movie.model.extend.TblAuthPermissionExtend;
import com.movie.model.extend.TblAuthRoleExtend;

import java.util.List;
import java.util.Map;

public interface TblAuthPermissionExtendMapper {
    List<TblAuthPermissionExtend> selectRolePermissionByExample(Map map);

}