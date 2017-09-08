package com.movie.mapper;

import com.movie.model.TblLikes;
import com.movie.model.TblLikesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblLikesMapper {
    int countByExample(TblLikesExample example);

    int deleteByExample(TblLikesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblLikes record);

    int insertSelective(TblLikes record);

    List<TblLikes> selectByExample(TblLikesExample example);

    TblLikes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblLikes record, @Param("example") TblLikesExample example);

    int updateByExample(@Param("record") TblLikes record, @Param("example") TblLikesExample example);

    int updateByPrimaryKeySelective(TblLikes record);

    int updateByPrimaryKey(TblLikes record);
}