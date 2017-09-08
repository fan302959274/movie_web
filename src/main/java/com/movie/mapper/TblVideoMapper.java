package com.movie.mapper;

import com.movie.model.TblVideo;
import com.movie.model.TblVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblVideoMapper {
    int countByExample(TblVideoExample example);

    int deleteByExample(TblVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblVideo record);

    int insertSelective(TblVideo record);

    List<TblVideo> selectByExample(TblVideoExample example);

    TblVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblVideo record, @Param("example") TblVideoExample example);

    int updateByExample(@Param("record") TblVideo record, @Param("example") TblVideoExample example);

    int updateByPrimaryKeySelective(TblVideo record);

    int updateByPrimaryKey(TblVideo record);
}