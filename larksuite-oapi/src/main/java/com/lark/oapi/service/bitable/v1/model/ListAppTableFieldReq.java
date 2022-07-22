// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListAppTableFieldReq {

  @Query
  @SerializedName("view_id")
  private String viewId;
  @Query
  @SerializedName("page_token")
  private String pageToken;
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  @Path
  @SerializedName("app_token")
  private String appToken;
  @Path
  @SerializedName("table_id")
  private String tableId;

  // builder 开始
  public ListAppTableFieldReq() {
  }

  public ListAppTableFieldReq(Builder builder) {
    this.viewId = builder.viewId;
    this.pageToken = builder.pageToken;
    this.pageSize = builder.pageSize;
    this.appToken = builder.appToken;
    this.tableId = builder.tableId;
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

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
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

  public static class Builder {

    private String viewId;
    private String pageToken;
    private Integer pageSize;
    private String appToken;
    private String tableId;

    public Builder viewId(String viewId) {
      this.viewId = viewId;
      return this;
    }

    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder appToken(String appToken) {
      this.appToken = appToken;
      return this;
    }

    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    public ListAppTableFieldReq build() {
      return new ListAppTableFieldReq(this);
    }
  }
}
