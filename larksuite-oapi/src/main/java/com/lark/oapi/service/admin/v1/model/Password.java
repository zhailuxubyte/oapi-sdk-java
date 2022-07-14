// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class Password {

  @SerializedName("ent_email_password")
  private String entEmailPassword;

  // builder 开始
  public Password() {
  }

  public Password(Builder builder) {
    this.entEmailPassword = builder.entEmailPassword;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEntEmailPassword() {
    return this.entEmailPassword;
  }

  public void setEntEmailPassword(String entEmailPassword) {
    this.entEmailPassword = entEmailPassword;
  }

  public static class Builder {

    private String entEmailPassword;

    public Builder entEmailPassword(String entEmailPassword) {
      this.entEmailPassword = entEmailPassword;
      return this;
    }


    public Password build() {
      return new Password(this);
    }
  }
}
