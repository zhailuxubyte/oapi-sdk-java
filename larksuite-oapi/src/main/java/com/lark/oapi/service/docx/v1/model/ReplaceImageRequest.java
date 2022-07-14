// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class ReplaceImageRequest {

  @SerializedName("token")
  private String token;

  // builder 开始
  public ReplaceImageRequest() {
  }

  public ReplaceImageRequest(Builder builder) {
    this.token = builder.token;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public static class Builder {

    private String token;

    public Builder token(String token) {
      this.token = token;
      return this;
    }


    public ReplaceImageRequest build() {
      return new ReplaceImageRequest(this);
    }
  }
}
