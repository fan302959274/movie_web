package com.movie.service;

import com.movie.model.TblAuthUser;

public interface AuthUserService {
    TblAuthUser findUserByNickName(String nickname);
}