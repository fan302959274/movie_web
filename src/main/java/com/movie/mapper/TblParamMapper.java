package com.movie.mapper;

import com.movie.model.TblParam;
import com.movie.model.TblParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblParamMapper {
    int countByExample(TblParamExample example);

    int deleteByExample(TblParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblParam record);

    int insertSelective(TblParam record);

    List<TblParam> selectByExample(TblParamExample example);

    TblParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblParam record, @Param("example") TblParamExample example);

    int updateByExample(@Param("record") TblParam record, @Param("example") TblParamExample example);

    int updateByPrimaryKeySelective(TblParam record);

    int updateByPrimaryKey(TblParam record);
}