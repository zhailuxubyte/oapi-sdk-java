// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class UpdateAppReq {

  @Path
  @SerializedName("app_token")
  private String appToken;
  @Body
  private UpdateAppReqBody body;

  // builder 开始
  public UpdateAppReq() {
  }

  public UpdateAppReq(Builder builder) {
    this.appToken = builder.appToken;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAppToken() {
    return this.appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public UpdateAppReqBody getUpdateAppReqBody() {
    return this.body;
  }

  public void setUpdateAppReqBody(UpdateAppReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String appToken;
    private UpdateAppReqBody body;

    public Builder appToken(String appToken) {
      this.appToken = appToken;
      return this;
    }

    public UpdateAppReqBody getUpdateAppReqBody() {
      return this.body;
    }

    public Builder updateAppReqBody(UpdateAppReqBody body) {
      this.body = body;
      return this;
    }

    public UpdateAppReq build() {
      return new UpdateAppReq(this);
    }
  }
}
