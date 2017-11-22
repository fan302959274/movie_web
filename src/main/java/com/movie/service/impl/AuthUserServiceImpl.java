package com.movie.service.impl;

import com.movie.mapper.TblAuthUserMapper;
import com.movie.mapper.TblVideoMapper;
import com.movie.mapper.extend.TblVideoExtendMapper;
import com.movie.model.TblAuthUser;
import com.movie.model.TblAuthUserExample;
import com.movie.model.TblVideo;
import com.movie.model.TblVideoExample;
import com.movie.model.extend.TblVideoExtend;
import com.movie.service.AuthUserService;
import com.movie.service.VideoService;
import com.movie.util.oss.OssUploadByPartUtil;
import com.movie.util.request.TblVideoPageReq;
import com.movie.util.response.CommonResp;
import com.movie.util.response.PageResp;
import com.movie.util.response.ResponseCode;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthUserServiceImpl implements AuthUserService {
    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Resource
    private TblAuthUserMapper tblAuthUserMapper;

    @Override
    public TblAuthUser findUserByNickName(String nickname) {
        TblAuthUserExample example = new TblAuthUserExample();
        example.createCriteria().andNicknameEqualTo(nickname);
        List<TblAuthUser> tblAuthUsers = tblAuthUserMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(tblAuthUsers)) {
            return tblAuthUsers.get(0);
        }
        return null;

    }
}