// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;

public class HighlightEntityReqBody {

  @SerializedName("text")
  private String text;

  // builder 开始
  public HighlightEntityReqBody() {
  }

  public HighlightEntityReqBody(Builder builder) {
    this.text = builder.text;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public static class Builder {

    private String text;

    public Builder text(String text) {
      this.text = text;
      return this;
    }


    public HighlightEntityReqBody build() {
      return new HighlightEntityReqBody(this);
    }
  }
}
