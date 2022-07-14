// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class ApplicationVisibility {

  @SerializedName("is_all")
  private Boolean isAll;
  @SerializedName("visible_list")
  private AppVisibleList visibleList;
  @SerializedName("invisible_list")
  private AppVisibleList invisibleList;

  // builder 开始
  public ApplicationVisibility() {
  }

  public ApplicationVisibility(Builder builder) {
    this.isAll = builder.isAll;
    this.visibleList = builder.visibleList;
    this.invisibleList = builder.invisibleList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Boolean getIsAll() {
    return this.isAll;
  }

  public void setIsAll(Boolean isAll) {
    this.isAll = isAll;
  }

  public AppVisibleList getVisibleList() {
    return this.visibleList;
  }

  public void setVisibleList(AppVisibleList visibleList) {
    this.visibleList = visibleList;
  }

  public AppVisibleList getInvisibleList() {
    return this.invisibleList;
  }

  public void setInvisibleList(AppVisibleList invisibleList) {
    this.invisibleList = invisibleList;
  }

  public static class Builder {

    private Boolean isAll;
    private AppVisibleList visibleList;
    private AppVisibleList invisibleList;

    public Builder isAll(Boolean isAll) {
      this.isAll = isAll;
      return this;
    }

    public Builder visibleList(AppVisibleList visibleList) {
      this.visibleList = visibleList;
      return this;
    }

    public Builder invisibleList(AppVisibleList invisibleList) {
      this.invisibleList = invisibleList;
      return this;
    }


    public ApplicationVisibility build() {
      return new ApplicationVisibility(this);
    }
  }
}
