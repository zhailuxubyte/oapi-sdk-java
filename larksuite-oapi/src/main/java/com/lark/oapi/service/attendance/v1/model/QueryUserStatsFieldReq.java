// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class QueryUserStatsFieldReq {

  @Query
  @SerializedName("employee_type")
  private String employeeType;
  @Body
  private QueryUserStatsFieldReqBody body;

  // builder 开始
  public QueryUserStatsFieldReq() {
  }

  public QueryUserStatsFieldReq(Builder builder) {
    this.employeeType = builder.employeeType;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEmployeeType() {
    return this.employeeType;
  }

  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  public QueryUserStatsFieldReqBody getQueryUserStatsFieldReqBody() {
    return this.body;
  }

  public void setQueryUserStatsFieldReqBody(QueryUserStatsFieldReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String employeeType;
    private QueryUserStatsFieldReqBody body;

    public Builder employeeType(String employeeType) {
      this.employeeType = employeeType;
      return this;
    }

    public Builder employeeType(
        com.lark.oapi.service.attendance.v1.enums.EmployeeTypeEnum employeeType) {
      this.employeeType = employeeType.getValue();
      return this;
    }

    public QueryUserStatsFieldReqBody getQueryUserStatsFieldReqBody() {
      return this.body;
    }

    public Builder queryUserStatsFieldReqBody(QueryUserStatsFieldReqBody body) {
      this.body = body;
      return this;
    }

    public QueryUserStatsFieldReq build() {
      return new QueryUserStatsFieldReq(this);
    }
  }
}
