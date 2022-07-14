// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppTableView {

  @SerializedName("view_id")
  private String viewId;
  @SerializedName("view_name")
  private String viewName;
  @SerializedName("view_type")
  private String viewType;

  // builder 开始
  public AppTableView() {
  }

  public AppTableView(Builder builder) {
    this.viewId = builder.viewId;
    this.viewName = builder.viewName;
    this.viewType = builder.viewType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getViewId() {
    return this.viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
  }

  public String getViewName() {
    return this.viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  public String getViewType() {
    return this.viewType;
  }

  public void setViewType(String viewType) {
    this.viewType = viewType;
  }

  public static class Builder {

    private String viewId;
    private String viewName;
    private String viewType;

    public Builder viewId(String viewId) {
      this.viewId = viewId;
      return this;
    }

    public Builder viewName(String viewName) {
      this.viewName = viewName;
      return this;
    }

    public Builder viewType(String viewType) {
      this.viewType = viewType;
      return this;
    }


    public AppTableView build() {
      return new AppTableView(this);
    }
  }
}
