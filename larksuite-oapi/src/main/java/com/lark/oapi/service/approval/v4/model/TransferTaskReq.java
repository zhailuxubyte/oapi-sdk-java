// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class TransferTaskReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Body
  private TaskTransfer body;

  // builder 开始
  public TransferTaskReq() {
  }

  public TransferTaskReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.body = builder.body;
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

  public TaskTransfer getTaskTransfer() {
    return this.body;
  }

  public void setTaskTransfer(TaskTransfer body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private TaskTransfer body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.approval.v4.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public TaskTransfer getTaskTransfer() {
      return this.body;
    }

    public Builder taskTransfer(TaskTransfer body) {
      this.body = body;
      return this;
    }

    public TransferTaskReq build() {
      return new TransferTaskReq(this);
    }
  }
}
