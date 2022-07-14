// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class UsageUser {

  @SerializedName("user_id")
  private String userId;

  // builder 开始
  public UsageUser() {
  }

  public UsageUser(Builder builder) {
    this.userId = builder.userId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public static class Builder {

    private String userId;

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    public UsageUser build() {
      return new UsageUser(this);
    }
  }
}
