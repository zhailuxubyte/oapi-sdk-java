// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.baike.v1.model;

import com.lark.oapi.core.annotation.Body;

public class HighlightEntityReq {

  @Body
  private HighlightEntityReqBody body;

  // builder 开始
  public HighlightEntityReq() {
  }

  public HighlightEntityReq(Builder builder) {
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public HighlightEntityReqBody getHighlightEntityReqBody() {
    return this.body;
  }

  public void setHighlightEntityReqBody(HighlightEntityReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private HighlightEntityReqBody body;

    public HighlightEntityReqBody getHighlightEntityReqBody() {
      return this.body;
    }

    public Builder highlightEntityReqBody(HighlightEntityReqBody body) {
      this.body = body;
      return this;
    }

    public HighlightEntityReq build() {
      return new HighlightEntityReq(this);
    }
  }
}
