// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class CreateAppRoleMemberReq {

  @Query
  @SerializedName("member_id_type")
  private String memberIdType;
  @Path
  @SerializedName("app_token")
  private String appToken;
  @Path
  @SerializedName("role_id")
  private String roleId;
  @Body
  private AppRoleMember body;
  // builder 开始
  public CreateAppRoleMemberReq() {
  }

  public CreateAppRoleMemberReq(Builder builder) {
    this.memberIdType = builder.memberIdType;
    this.appToken = builder.appToken;
    this.roleId = builder.roleId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMemberIdType() {
    return this.memberIdType;
  }

  public void setMemberIdType(String memberIdType) {
    this.memberIdType = memberIdType;
  }

  public String getAppToken() {
    return this.appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public AppRoleMember getAppRoleMember() {
    return this.body;
  }

  public void setAppRoleMember(AppRoleMember body) {
    this.body = body;
  }

  public static class Builder {

    private String memberIdType;
    private String appToken;
    private String roleId;
    private AppRoleMember body;

    public Builder memberIdType(String memberIdType) {
      this.memberIdType = memberIdType;
      return this;
    }

    public Builder memberIdType(
        com.lark.oapi.service.bitable.v1.enums.MemberIdTypeEnum memberIdType) {
      this.memberIdType = memberIdType.getValue();
      return this;
    }

    public Builder appToken(String appToken) {
      this.appToken = appToken;
      return this;
    }

    public Builder roleId(String roleId) {
      this.roleId = roleId;
      return this;
    }

    public AppRoleMember getAppRoleMember() {
      return this.body;
    }

    public Builder appRoleMember(AppRoleMember body) {
      this.body = body;
      return this;
    }

    public CreateAppRoleMemberReq build() {
      return new CreateAppRoleMemberReq(this);
    }
  }
}
