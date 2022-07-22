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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class OverviewApplicationAppUsageReq {

  @Query
  @SerializedName("department_id_type")
  private String departmentIdType;
  @Path
  @SerializedName("app_id")
  private String appId;
  @Body
  private OverviewApplicationAppUsageReqBody body;

  // builder 开始
  public OverviewApplicationAppUsageReq() {
  }

  public OverviewApplicationAppUsageReq(Builder builder) {
    this.departmentIdType = builder.departmentIdType;
    this.appId = builder.appId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getDepartmentIdType() {
    return this.departmentIdType;
  }

  public void setDepartmentIdType(String departmentIdType) {
    this.departmentIdType = departmentIdType;
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OverviewApplicationAppUsageReqBody getOverviewApplicationAppUsageReqBody() {
    return this.body;
  }

  public void setOverviewApplicationAppUsageReqBody(OverviewApplicationAppUsageReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String departmentIdType;
    private String appId;
    private OverviewApplicationAppUsageReqBody body;

    public Builder departmentIdType(String departmentIdType) {
      this.departmentIdType = departmentIdType;
      return this;
    }

    public Builder departmentIdType(
        com.lark.oapi.service.application.v6.enums.DepartmentIdTypeEnum departmentIdType) {
      this.departmentIdType = departmentIdType.getValue();
      return this;
    }

    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    public OverviewApplicationAppUsageReqBody getOverviewApplicationAppUsageReqBody() {
      return this.body;
    }

    public Builder overviewApplicationAppUsageReqBody(OverviewApplicationAppUsageReqBody body) {
      this.body = body;
      return this;
    }

    public OverviewApplicationAppUsageReq build() {
      return new OverviewApplicationAppUsageReq(this);
    }
  }
}
