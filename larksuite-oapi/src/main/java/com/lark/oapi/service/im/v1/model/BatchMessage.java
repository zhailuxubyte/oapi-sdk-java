// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchMessage {

  @SerializedName("batch_message_id")
  private String batchMessageId;
  @SerializedName("batch_send_progress")
  private BatchSendProgress batchSendProgress;
  @SerializedName("batch_recall_progress")
  private BatchRecallProgress batchRecallProgress;

  // builder 开始
  public BatchMessage() {
  }

  public BatchMessage(Builder builder) {
    this.batchMessageId = builder.batchMessageId;
    this.batchSendProgress = builder.batchSendProgress;
    this.batchRecallProgress = builder.batchRecallProgress;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getBatchMessageId() {
    return this.batchMessageId;
  }

  public void setBatchMessageId(String batchMessageId) {
    this.batchMessageId = batchMessageId;
  }

  public BatchSendProgress getBatchSendProgress() {
    return this.batchSendProgress;
  }

  public void setBatchSendProgress(BatchSendProgress batchSendProgress) {
    this.batchSendProgress = batchSendProgress;
  }

  public BatchRecallProgress getBatchRecallProgress() {
    return this.batchRecallProgress;
  }

  public void setBatchRecallProgress(BatchRecallProgress batchRecallProgress) {
    this.batchRecallProgress = batchRecallProgress;
  }

  public static class Builder {

    private String batchMessageId;
    private BatchSendProgress batchSendProgress;
    private BatchRecallProgress batchRecallProgress;

    public Builder batchMessageId(String batchMessageId) {
      this.batchMessageId = batchMessageId;
      return this;
    }

    public Builder batchSendProgress(BatchSendProgress batchSendProgress) {
      this.batchSendProgress = batchSendProgress;
      return this;
    }

    public Builder batchRecallProgress(BatchRecallProgress batchRecallProgress) {
      this.batchRecallProgress = batchRecallProgress;
      return this;
    }


    public BatchMessage build() {
      return new BatchMessage(this);
    }
  }
}
