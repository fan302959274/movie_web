package com.movie.mapper.extend;

import com.movie.model.TblVideo;
import com.movie.model.TblVideoExample;
import com.movie.model.extend.TblVideoExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TblVideoExtendMapper {
    List<TblVideoExtend> selectByExample(Map map);

}