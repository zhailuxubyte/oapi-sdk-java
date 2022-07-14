// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteAppTableViewReq {

  @Path
  @SerializedName("app_token")
  private String appToken;
  @Path
  @SerializedName("table_id")
  private String tableId;
  @Path
  @SerializedName("view_id")
  private String viewId;

  // builder 开始
  public DeleteAppTableViewReq() {
  }

  public DeleteAppTableViewReq(Builder builder) {
    this.appToken = builder.appToken;
    this.tableId = builder.tableId;
    this.viewId = builder.viewId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAppToken() {
    return this.appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public String getTableId() {
    return this.tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }

  public String getViewId() {
    return this.viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
  }

  public static class Builder {

    private String appToken;
    private String tableId;
    private String viewId;

    public Builder appToken(String appToken) {
      this.appToken = appToken;
      return this;
    }

    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    public Builder viewId(String viewId) {
      this.viewId = viewId;
      return this;
    }

    public DeleteAppTableViewReq build() {
      return new DeleteAppTableViewReq(this);
    }
  }
}
