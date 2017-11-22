package com.movie.mapper;

import com.movie.model.TblAuthPermission;
import com.movie.model.TblAuthPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAuthPermissionMapper {
    int countByExample(TblAuthPermissionExample example);

    int deleteByExample(TblAuthPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblAuthPermission record);

    int insertSelective(TblAuthPermission record);

    List<TblAuthPermission> selectByExample(TblAuthPermissionExample example);

    TblAuthPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblAuthPermission record, @Param("example") TblAuthPermissionExample example);

    int updateByExample(@Param("record") TblAuthPermission record, @Param("example") TblAuthPermissionExample example);

    int updateByPrimaryKeySelective(TblAuthPermission record);

    int updateByPrimaryKey(TblAuthPermission record);
}