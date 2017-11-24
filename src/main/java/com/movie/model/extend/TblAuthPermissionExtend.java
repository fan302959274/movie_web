package com.movie.model.extend;

import com.movie.model.TblAuthPermission;

public class TblAuthPermissionExtend extends TblAuthPermission {

    private Boolean isRoleHave;

    public Boolean getRoleHave() {
        return isRoleHave;
    }

    public void setRoleHave(Boolean roleHave) {
        isRoleHave = roleHave;
    }
}