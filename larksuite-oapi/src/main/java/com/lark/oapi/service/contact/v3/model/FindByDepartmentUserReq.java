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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class FindByDepartmentUserReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Query
  @SerializedName("department_id_type")
  private String departmentIdType;
  @Query
  @SerializedName("department_id")
  private String departmentId;
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  @Query
  @SerializedName("page_token")
  private String pageToken;

  // builder 开始
  public FindByDepartmentUserReq() {
  }

  public FindByDepartmentUserReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.departmentIdType = builder.departmentIdType;
    this.departmentId = builder.departmentId;
    this.pageSize = builder.pageSize;
    this.pageToken = builder.pageToken;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getDepartmentIdType() {
    return this.departmentIdType;
  }

  public void setDepartmentIdType(String departmentIdType) {
    this.departmentIdType = departmentIdType;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public static class Builder {

    private String userIdType;
    private String departmentIdType;
    private String departmentId;
    private Integer pageSize;
    private String pageToken;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.contact.v3.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder departmentIdType(String departmentIdType) {
      this.departmentIdType = departmentIdType;
      return this;
    }

    public Builder departmentIdType(
        com.lark.oapi.service.contact.v3.enums.DepartmentIdTypeEnum departmentIdType) {
      this.departmentIdType = departmentIdType.getValue();
      return this;
    }

    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    public FindByDepartmentUserReq build() {
      return new FindByDepartmentUserReq(this);
    }
  }
}
