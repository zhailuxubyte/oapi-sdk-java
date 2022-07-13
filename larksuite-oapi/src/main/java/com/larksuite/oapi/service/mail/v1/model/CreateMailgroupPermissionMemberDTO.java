// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateMailgroupPermissionMemberDTO {
    @SerializedName("permission_member_id")
    private String permissionMemberId;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("type")
    private String type;

    public String getPermissionMemberId() {
        return this.permissionMemberId;
    }

    public void setPermissionMemberId(String permissionMemberId) {
        this.permissionMemberId = permissionMemberId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
