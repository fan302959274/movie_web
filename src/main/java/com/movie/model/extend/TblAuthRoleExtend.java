package com.movie.model.extend;

import com.movie.model.TblAuthRole;

public class TblAuthRoleExtend extends TblAuthRole {

    private Boolean isUserHave;

    public Boolean getUserHave() {
        return isUserHave;
    }

    public void setUserHave(Boolean userHave) {
        isUserHave = userHave;
    }
}