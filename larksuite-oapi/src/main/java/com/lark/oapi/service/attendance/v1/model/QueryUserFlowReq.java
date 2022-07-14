// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class QueryUserFlowReq {

  @Query
  @SerializedName("employee_type")
  private String employeeType;
  @Query
  @SerializedName("include_terminated_user")
  private Boolean includeTerminatedUser;
  @Body
  private QueryUserFlowReqBody body;

  // builder 开始
  public QueryUserFlowReq() {
  }

  public QueryUserFlowReq(Builder builder) {
    this.employeeType = builder.employeeType;
    this.includeTerminatedUser = builder.includeTerminatedUser;
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

  public Boolean getIncludeTerminatedUser() {
    return this.includeTerminatedUser;
  }

  public void setIncludeTerminatedUser(Boolean includeTerminatedUser) {
    this.includeTerminatedUser = includeTerminatedUser;
  }

  public QueryUserFlowReqBody getQueryUserFlowReqBody() {
    return this.body;
  }

  public void setQueryUserFlowReqBody(QueryUserFlowReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String employeeType;
    private Boolean includeTerminatedUser;
    private QueryUserFlowReqBody body;

    public Builder employeeType(String employeeType) {
      this.employeeType = employeeType;
      return this;
    }

    public Builder employeeType(
        com.lark.oapi.service.attendance.v1.enums.EmployeeTypeEnum employeeType) {
      this.employeeType = employeeType.getValue();
      return this;
    }

    public Builder includeTerminatedUser(Boolean includeTerminatedUser) {
      this.includeTerminatedUser = includeTerminatedUser;
      return this;
    }

    public QueryUserFlowReqBody getQueryUserFlowReqBody() {
      return this.body;
    }

    public Builder queryUserFlowReqBody(QueryUserFlowReqBody body) {
      this.body = body;
      return this;
    }

    public QueryUserFlowReq build() {
      return new QueryUserFlowReq(this);
    }
  }
}
