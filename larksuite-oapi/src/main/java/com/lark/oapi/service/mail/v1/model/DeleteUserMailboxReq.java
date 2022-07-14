// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class DeleteUserMailboxReq {

  @Query
  @SerializedName("transfer_mailbox")
  private String transferMailbox;
  @Path
  @SerializedName("user_mailbox_id")
  private String userMailboxId;

  // builder 开始
  public DeleteUserMailboxReq() {
  }

  public DeleteUserMailboxReq(Builder builder) {
    this.transferMailbox = builder.transferMailbox;
    this.userMailboxId = builder.userMailboxId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTransferMailbox() {
    return this.transferMailbox;
  }

  public void setTransferMailbox(String transferMailbox) {
    this.transferMailbox = transferMailbox;
  }

  public String getUserMailboxId() {
    return this.userMailboxId;
  }

  public void setUserMailboxId(String userMailboxId) {
    this.userMailboxId = userMailboxId;
  }

  public static class Builder {

    private String transferMailbox;
    private String userMailboxId;

    public Builder transferMailbox(String transferMailbox) {
      this.transferMailbox = transferMailbox;
      return this;
    }

    public Builder userMailboxId(String userMailboxId) {
      this.userMailboxId = userMailboxId;
      return this;
    }

    public DeleteUserMailboxReq build() {
      return new DeleteUserMailboxReq(this);
    }
  }
}
