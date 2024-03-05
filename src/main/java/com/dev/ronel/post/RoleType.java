package com.dev.ronel.post;

import java.util.Arrays;

public enum RoleType {

    ROLE_USER("ROLE_USER", false), //
    ROLE_HD_ADMIN("ROLE_HD_ADMIN", true), //
    ROLE_HD_CASE_AGENT("ROLE_HD_CASE_AGENT", true), //
    ROLE_QUARANO_ADMIN("ROLE_QUARANO_ADMIN", false), //
    ROLE_THIRD_PARTY("ROLE_THIRD_PARTY", false);

    private String code;
    private boolean isDepartmentRole;

    RoleType(String code, boolean isDepartmentRole) {
        this.code = code;
        this.isDepartmentRole = isDepartmentRole;
    }

    public String getCode() {
        return code;
    }

    public boolean isDepartmentRole() {
        return isDepartmentRole;
    }

    public static boolean isRoleType(String candidate){

        return Arrays.stream(RoleType.values())
                .map(RoleType::name)
                .anyMatch(candidate::equals);
    }
}
