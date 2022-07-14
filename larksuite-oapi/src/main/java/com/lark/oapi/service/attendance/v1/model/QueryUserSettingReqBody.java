// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class QueryUserSettingReqBody {

  @SerializedName("user_ids")
  private String[] userIds;

  // builder 开始
  public QueryUserSettingReqBody() {
  }

  public QueryUserSettingReqBody(Builder builder) {
    this.userIds = builder.userIds;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String[] getUserIds() {
    return this.userIds;
  }

  public void setUserIds(String[] userIds) {
    this.userIds = userIds;
  }

  public static class Builder {

    private String[] userIds;

    public Builder userIds(String[] userIds) {
      this.userIds = userIds;
      return this;
    }


    public QueryUserSettingReqBody build() {
      return new QueryUserSettingReqBody(this);
    }
  }
}
