// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchCreateAppRoleMemberReqBody {

  @SerializedName("member_list")
  private AppRoleMemberId[] memberList;

  // builder 开始
  public BatchCreateAppRoleMemberReqBody() {
  }

  public BatchCreateAppRoleMemberReqBody(Builder builder) {
    this.memberList = builder.memberList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public AppRoleMemberId[] getMemberList() {
    return this.memberList;
  }

  public void setMemberList(AppRoleMemberId[] memberList) {
    this.memberList = memberList;
  }

  public static class Builder {

    private AppRoleMemberId[] memberList;

    public Builder memberList(AppRoleMemberId[] memberList) {
      this.memberList = memberList;
      return this;
    }


    public BatchCreateAppRoleMemberReqBody build() {
      return new BatchCreateAppRoleMemberReqBody(this);
    }
  }
}
