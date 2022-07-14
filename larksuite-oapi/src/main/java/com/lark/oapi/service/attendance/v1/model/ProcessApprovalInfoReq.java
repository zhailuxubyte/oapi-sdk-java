// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.annotation.Body;

public class ProcessApprovalInfoReq {

  @Body
  private ProcessApprovalInfoReqBody body;

  // builder 开始
  public ProcessApprovalInfoReq() {
  }

  public ProcessApprovalInfoReq(Builder builder) {
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public ProcessApprovalInfoReqBody getProcessApprovalInfoReqBody() {
    return this.body;
  }

  public void setProcessApprovalInfoReqBody(ProcessApprovalInfoReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private ProcessApprovalInfoReqBody body;

    public ProcessApprovalInfoReqBody getProcessApprovalInfoReqBody() {
      return this.body;
    }

    public Builder processApprovalInfoReqBody(ProcessApprovalInfoReqBody body) {
      this.body = body;
      return this;
    }

    public ProcessApprovalInfoReq build() {
      return new ProcessApprovalInfoReq(this);
    }
  }
}
