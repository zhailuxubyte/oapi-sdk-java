// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class DocsLink {

  @SerializedName("url")
  private String url;

  // builder 开始
  public DocsLink() {
  }

  public DocsLink(Builder builder) {
    this.url = builder.url;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public static class Builder {

    private String url;

    public Builder url(String url) {
      this.url = url;
      return this;
    }


    public DocsLink build() {
      return new DocsLink(this);
    }
  }
}
