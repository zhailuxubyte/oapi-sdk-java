// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.annotation.Body;

public class UploadAllMediaReq {

  @Body
  private UploadAllMediaReqBody body;

  // builder 开始
  public UploadAllMediaReq() {
  }

  public UploadAllMediaReq(Builder builder) {
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public UploadAllMediaReqBody getUploadAllMediaReqBody() {
    return this.body;
  }

  public void setUploadAllMediaReqBody(UploadAllMediaReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private UploadAllMediaReqBody body;

    public UploadAllMediaReqBody getUploadAllMediaReqBody() {
      return this.body;
    }

    public Builder uploadAllMediaReqBody(UploadAllMediaReqBody body) {
      this.body = body;
      return this;
    }

    public UploadAllMediaReq build() {
      return new UploadAllMediaReq(this);
    }
  }
}
