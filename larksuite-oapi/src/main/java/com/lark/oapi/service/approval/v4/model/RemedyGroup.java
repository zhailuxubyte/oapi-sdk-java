// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class RemedyGroup {

  @SerializedName("type")
  private String type;
  @SerializedName("instance_code")
  private String instanceCode;
  @SerializedName("employee_id")
  private String employeeId;
  @SerializedName("start_time")
  private Integer startTime;
  @SerializedName("end_time")
  private Integer endTime;
  @SerializedName("remedy_time")
  private Integer remedyTime;
  @SerializedName("remedy_reason")
  private String remedyReason;
  @SerializedName("status")
  private String status;

  // builder 开始
  public RemedyGroup() {
  }

  public RemedyGroup(Builder builder) {
    this.type = builder.type;
    this.instanceCode = builder.instanceCode;
    this.employeeId = builder.employeeId;
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.remedyTime = builder.remedyTime;
    this.remedyReason = builder.remedyReason;
    this.status = builder.status;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getInstanceCode() {
    return this.instanceCode;
  }

  public void setInstanceCode(String instanceCode) {
    this.instanceCode = instanceCode;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Integer getStartTime() {
    return this.startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public Integer getEndTime() {
    return this.endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public Integer getRemedyTime() {
    return this.remedyTime;
  }

  public void setRemedyTime(Integer remedyTime) {
    this.remedyTime = remedyTime;
  }

  public String getRemedyReason() {
    return this.remedyReason;
  }

  public void setRemedyReason(String remedyReason) {
    this.remedyReason = remedyReason;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public static class Builder {

    private String type;
    private String instanceCode;
    private String employeeId;
    private Integer startTime;
    private Integer endTime;
    private Integer remedyTime;
    private String remedyReason;
    private String status;

    public Builder type(String type) {
      this.type = type;
      return this;
    }

    public Builder instanceCode(String instanceCode) {
      this.instanceCode = instanceCode;
      return this;
    }

    public Builder employeeId(String employeeId) {
      this.employeeId = employeeId;
      return this;
    }

    public Builder startTime(Integer startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(Integer endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder remedyTime(Integer remedyTime) {
      this.remedyTime = remedyTime;
      return this;
    }

    public Builder remedyReason(String remedyReason) {
      this.remedyReason = remedyReason;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }


    public RemedyGroup build() {
      return new RemedyGroup(this);
    }
  }
}
