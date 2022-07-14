// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;

public class Referer {

  @SerializedName("id")
  private String id;
  @SerializedName("title")
  private String title;
  @SerializedName("url")
  private String url;

  // builder 开始
  public Referer() {
  }

  public Referer(Builder builder) {
    this.id = builder.id;
    this.title = builder.title;
    this.url = builder.url;
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

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public static class Builder {

    private String id;
    private String title;
    private String url;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }


    public Referer build() {
      return new Referer(this);
    }
  }
}
