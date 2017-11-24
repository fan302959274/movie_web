package com.movie.model.extend;

import com.movie.model.TblAuthRole;

public class TblAuthRoleExtend extends TblAuthRole {
    private Long userId;

    private Boolean isUserHave;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getUserHave() {
        return isUserHave;
    }

    public void setUserHave(Boolean userHave) {
        isUserHave = userHave;
    }
}