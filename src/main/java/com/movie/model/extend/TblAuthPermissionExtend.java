package com.movie.model.extend;

import com.movie.model.TblAuthPermission;

public class TblAuthPermissionExtend extends TblAuthPermission {
    private Long roleId;

    private Boolean isRoleHave;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Boolean getRoleHave() {
        return isRoleHave;
    }

    public void setRoleHave(Boolean roleHave) {
        isRoleHave = roleHave;
    }
}