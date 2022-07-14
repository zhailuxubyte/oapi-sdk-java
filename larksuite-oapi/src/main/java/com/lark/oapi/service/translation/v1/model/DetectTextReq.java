// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.translation.v1.model;

import com.lark.oapi.core.annotation.Body;

public class DetectTextReq {

  @Body
  private DetectTextReqBody body;

  // builder 开始
  public DetectTextReq() {
  }

  public DetectTextReq(Builder builder) {
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public DetectTextReqBody getDetectTextReqBody() {
    return this.body;
  }

  public void setDetectTextReqBody(DetectTextReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private DetectTextReqBody body;

    public DetectTextReqBody getDetectTextReqBody() {
      return this.body;
    }

    public Builder detectTextReqBody(DetectTextReqBody body) {
      this.body = body;
      return this;
    }

    public DetectTextReq build() {
      return new DetectTextReq(this);
    }
  }
}
