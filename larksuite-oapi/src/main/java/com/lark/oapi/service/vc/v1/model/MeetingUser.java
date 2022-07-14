// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class MeetingUser {

  @SerializedName("id")
  private String id;
  @SerializedName("user_type")
  private Integer userType;

  // builder 开始
  public MeetingUser() {
  }

  public MeetingUser(Builder builder) {
    this.id = builder.id;
    this.userType = builder.userType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getUserType() {
    return this.userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  public static class Builder {

    private String id;
    private Integer userType;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder userType(Integer userType) {
      this.userType = userType;
      return this;
    }

    public Builder userType(com.lark.oapi.service.vc.v1.enums.UserTypeEnum userType) {
      this.userType = userType.getValue();
      return this;
    }


    public MeetingUser build() {
      return new MeetingUser(this);
    }
  }
}
