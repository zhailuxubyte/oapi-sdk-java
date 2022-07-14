// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class Badge {

  @SerializedName("id")
  private String id;
  @SerializedName("name")
  private String name;
  @SerializedName("explanation")
  private String explanation;
  @SerializedName("detail_image")
  private String detailImage;
  @SerializedName("show_image")
  private String showImage;

  // builder 开始
  public Badge() {
  }

  public Badge(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.explanation = builder.explanation;
    this.detailImage = builder.detailImage;
    this.showImage = builder.showImage;
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getExplanation() {
    return this.explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public String getDetailImage() {
    return this.detailImage;
  }

  public void setDetailImage(String detailImage) {
    this.detailImage = detailImage;
  }

  public String getShowImage() {
    return this.showImage;
  }

  public void setShowImage(String showImage) {
    this.showImage = showImage;
  }

  public static class Builder {

    private String id;
    private String name;
    private String explanation;
    private String detailImage;
    private String showImage;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder explanation(String explanation) {
      this.explanation = explanation;
      return this;
    }

    public Builder detailImage(String detailImage) {
      this.detailImage = detailImage;
      return this;
    }

    public Builder showImage(String showImage) {
      this.showImage = showImage;
      return this;
    }


    public Badge build() {
      return new Badge(this);
    }
  }
}
