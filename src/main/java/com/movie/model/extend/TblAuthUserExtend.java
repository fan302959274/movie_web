package com.movie.model.extend;

import com.movie.model.BaseModel;
import com.movie.model.TblAuthUser;

import java.util.Date;

public class TblAuthUserExtend extends TblAuthUser {

    private String lastLoginTimeStr;

    public String getLastLoginTimeStr() {
        return lastLoginTimeStr;
    }

    public void setLastLoginTimeStr(String lastLoginTimeStr) {
        this.lastLoginTimeStr = lastLoginTimeStr;
    }
}