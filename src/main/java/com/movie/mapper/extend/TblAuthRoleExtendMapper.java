package com.movie.mapper.extend;

import com.movie.model.extend.TblAuthRoleExtend;

import java.util.List;
import java.util.Map;

public interface TblAuthRoleExtendMapper {
    List<TblAuthRoleExtend> selectUserRoleByExample(Map map);

}