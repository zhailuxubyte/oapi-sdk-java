// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class ModifyUserSettingReqBody {

  @SerializedName("user_setting")
  private UserSetting userSetting;

  // builder 开始
  public ModifyUserSettingReqBody() {
  }

  public ModifyUserSettingReqBody(Builder builder) {
    this.userSetting = builder.userSetting;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public UserSetting getUserSetting() {
    return this.userSetting;
  }

  public void setUserSetting(UserSetting userSetting) {
    this.userSetting = userSetting;
  }

  public static class Builder {

    private UserSetting userSetting;

    public Builder userSetting(UserSetting userSetting) {
      this.userSetting = userSetting;
      return this;
    }


    public ModifyUserSettingReqBody build() {
      return new ModifyUserSettingReqBody(this);
    }
  }
}
