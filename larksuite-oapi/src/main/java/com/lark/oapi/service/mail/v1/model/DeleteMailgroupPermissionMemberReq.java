// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteMailgroupPermissionMemberReq {

  @Path
  @SerializedName("mailgroup_id")
  private String mailgroupId;
  @Path
  @SerializedName("permission_member_id")
  private String permissionMemberId;

  // builder 开始
  public DeleteMailgroupPermissionMemberReq() {
  }

  public DeleteMailgroupPermissionMemberReq(Builder builder) {
    this.mailgroupId = builder.mailgroupId;
    this.permissionMemberId = builder.permissionMemberId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMailgroupId() {
    return this.mailgroupId;
  }

  public void setMailgroupId(String mailgroupId) {
    this.mailgroupId = mailgroupId;
  }

  public String getPermissionMemberId() {
    return this.permissionMemberId;
  }

  public void setPermissionMemberId(String permissionMemberId) {
    this.permissionMemberId = permissionMemberId;
  }

  public static class Builder {

    private String mailgroupId;
    private String permissionMemberId;

    public Builder mailgroupId(String mailgroupId) {
      this.mailgroupId = mailgroupId;
      return this;
    }

    public Builder permissionMemberId(String permissionMemberId) {
      this.permissionMemberId = permissionMemberId;
      return this;
    }

    public DeleteMailgroupPermissionMemberReq build() {
      return new DeleteMailgroupPermissionMemberReq(this);
    }
  }
}
