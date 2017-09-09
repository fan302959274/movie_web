package com.movie.service.impl;

import com.movie.model.TblParam;
import com.movie.model.TblParamExample;
import com.movie.service.ParamService;
import com.movie.mapper.TblParamMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParamServiceImpl implements ParamService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private TblParamMapper tblParamMapper;

    @Override
    public List<TblParam> selectList(TblParam tblParam) {
        if (tblParam!=null){
            TblParamExample example = new TblParamExample();
            TblParamExample.Criteria criteria = example.createCriteria();
            if(!StringUtils.isBlank(tblParam.getParamType())){
                criteria.andParamTypeEqualTo(tblParam.getParamType());
            }
            return tblParamMapper.selectByExample(example);
        }
        return null;

    }
}