// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetGroupReq {

  @Query
  @SerializedName("employee_type")
  private String employeeType;
  @Query
  @SerializedName("dept_type")
  private String deptType;
  @Path
  @SerializedName("group_id")
  private String groupId;

  // builder 开始
  public GetGroupReq() {
  }

  public GetGroupReq(Builder builder) {
    this.employeeType = builder.employeeType;
    this.deptType = builder.deptType;
    this.groupId = builder.groupId;
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

  public String getDeptType() {
    return this.deptType;
  }

  public void setDeptType(String deptType) {
    this.deptType = deptType;
  }

  public String getGroupId() {
    return this.groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public static class Builder {

    private String employeeType;
    private String deptType;
    private String groupId;

    public Builder employeeType(String employeeType) {
      this.employeeType = employeeType;
      return this;
    }

    public Builder employeeType(
        com.lark.oapi.service.attendance.v1.enums.EmployeeTypeEnum employeeType) {
      this.employeeType = employeeType.getValue();
      return this;
    }

    public Builder deptType(String deptType) {
      this.deptType = deptType;
      return this;
    }

    public Builder deptType(com.lark.oapi.service.attendance.v1.enums.DeptTypeEnum deptType) {
      this.deptType = deptType.getValue();
      return this;
    }

    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    public GetGroupReq build() {
      return new GetGroupReq(this);
    }
  }
}
