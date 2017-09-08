package com.movie.mapper;

import com.movie.model.TblReply;
import com.movie.model.TblReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblReplyMapper {
    int countByExample(TblReplyExample example);

    int deleteByExample(TblReplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblReply record);

    int insertSelective(TblReply record);

    List<TblReply> selectByExample(TblReplyExample example);

    TblReply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblReply record, @Param("example") TblReplyExample example);

    int updateByExample(@Param("record") TblReply record, @Param("example") TblReplyExample example);

    int updateByPrimaryKeySelective(TblReply record);

    int updateByPrimaryKey(TblReply record);
}