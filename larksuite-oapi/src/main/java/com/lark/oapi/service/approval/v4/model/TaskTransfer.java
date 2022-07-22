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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class TaskTransfer {

  @SerializedName("approval_code")
  private String approvalCode;
  @SerializedName("instance_code")
  private String instanceCode;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("comment")
  private String comment;
  @SerializedName("transfer_user_id")
  private String transferUserId;
  @SerializedName("task_id")
  private String taskId;

  // builder 开始
  public TaskTransfer() {
  }

  public TaskTransfer(Builder builder) {
    this.approvalCode = builder.approvalCode;
    this.instanceCode = builder.instanceCode;
    this.userId = builder.userId;
    this.comment = builder.comment;
    this.transferUserId = builder.transferUserId;
    this.taskId = builder.taskId;
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

  public String getInstanceCode() {
    return this.instanceCode;
  }

  public void setInstanceCode(String instanceCode) {
    this.instanceCode = instanceCode;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getTransferUserId() {
    return this.transferUserId;
  }

  public void setTransferUserId(String transferUserId) {
    this.transferUserId = transferUserId;
  }

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public static class Builder {

    private String approvalCode;
    private String instanceCode;
    private String userId;
    private String comment;
    private String transferUserId;
    private String taskId;

    public Builder approvalCode(String approvalCode) {
      this.approvalCode = approvalCode;
      return this;
    }

    public Builder instanceCode(String instanceCode) {
      this.instanceCode = instanceCode;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder comment(String comment) {
      this.comment = comment;
      return this;
    }

    public Builder transferUserId(String transferUserId) {
      this.transferUserId = transferUserId;
      return this;
    }

    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }


    public TaskTransfer build() {
      return new TaskTransfer(this);
    }
  }
}
