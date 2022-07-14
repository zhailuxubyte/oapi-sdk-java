// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class Approval {

  @SerializedName("approval_code")
  private String approvalCode;
  @SerializedName("approval_name")
  private String approvalName;

  // builder 开始
  public Approval() {
  }

  public Approval(Builder builder) {
    this.approvalCode = builder.approvalCode;
    this.approvalName = builder.approvalName;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getApprovalCode() {
    return this.approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public String getApprovalName() {
    return this.approvalName;
  }

  public void setApprovalName(String approvalName) {
    this.approvalName = approvalName;
  }

  public static class Builder {

    private String approvalCode;
    private String approvalName;

    public Builder approvalCode(String approvalCode) {
      this.approvalCode = approvalCode;
      return this;
    }

    public Builder approvalName(String approvalName) {
      this.approvalName = approvalName;
      return this;
    }


    public Approval build() {
      return new Approval(this);
    }
  }
}
