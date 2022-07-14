// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class QueryUserTaskReq {

  @Query
  @SerializedName("employee_type")
  private String employeeType;
  @Query
  @SerializedName("ignore_invalid_users")
  private Boolean ignoreInvalidUsers;
  @Query
  @SerializedName("include_terminated_user")
  private Boolean includeTerminatedUser;
  @Body
  private QueryUserTaskReqBody body;

  // builder 开始
  public QueryUserTaskReq() {
  }

  public QueryUserTaskReq(Builder builder) {
    this.employeeType = builder.employeeType;
    this.ignoreInvalidUsers = builder.ignoreInvalidUsers;
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

  public Boolean getIgnoreInvalidUsers() {
    return this.ignoreInvalidUsers;
  }

  public void setIgnoreInvalidUsers(Boolean ignoreInvalidUsers) {
    this.ignoreInvalidUsers = ignoreInvalidUsers;
  }

  public Boolean getIncludeTerminatedUser() {
    return this.includeTerminatedUser;
  }

  public void setIncludeTerminatedUser(Boolean includeTerminatedUser) {
    this.includeTerminatedUser = includeTerminatedUser;
  }

  public QueryUserTaskReqBody getQueryUserTaskReqBody() {
    return this.body;
  }

  public void setQueryUserTaskReqBody(QueryUserTaskReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String employeeType;
    private Boolean ignoreInvalidUsers;
    private Boolean includeTerminatedUser;
    private QueryUserTaskReqBody body;

    public Builder employeeType(String employeeType) {
      this.employeeType = employeeType;
      return this;
    }

    public Builder employeeType(
        com.lark.oapi.service.attendance.v1.enums.EmployeeTypeEnum employeeType) {
      this.employeeType = employeeType.getValue();
      return this;
    }

    public Builder ignoreInvalidUsers(Boolean ignoreInvalidUsers) {
      this.ignoreInvalidUsers = ignoreInvalidUsers;
      return this;
    }

    public Builder includeTerminatedUser(Boolean includeTerminatedUser) {
      this.includeTerminatedUser = includeTerminatedUser;
      return this;
    }

    public QueryUserTaskReqBody getQueryUserTaskReqBody() {
      return this.body;
    }

    public Builder queryUserTaskReqBody(QueryUserTaskReqBody body) {
      this.body = body;
      return this;
    }

    public QueryUserTaskReq build() {
      return new QueryUserTaskReq(this);
    }
  }
}
