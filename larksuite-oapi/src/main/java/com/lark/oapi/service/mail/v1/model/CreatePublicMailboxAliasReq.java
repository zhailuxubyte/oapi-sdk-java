// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class CreatePublicMailboxAliasReq {

  @Path
  @SerializedName("public_mailbox_id")
  private String publicMailboxId;
  @Body
  private EmailAlias body;

  // builder 开始
  public CreatePublicMailboxAliasReq() {
  }

  public CreatePublicMailboxAliasReq(Builder builder) {
    this.publicMailboxId = builder.publicMailboxId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getPublicMailboxId() {
    return this.publicMailboxId;
  }

  public void setPublicMailboxId(String publicMailboxId) {
    this.publicMailboxId = publicMailboxId;
  }

  public EmailAlias getEmailAlias() {
    return this.body;
  }

  public void setEmailAlias(EmailAlias body) {
    this.body = body;
  }

  public static class Builder {

    private String publicMailboxId;
    private EmailAlias body;

    public Builder publicMailboxId(String publicMailboxId) {
      this.publicMailboxId = publicMailboxId;
      return this;
    }

    public EmailAlias getEmailAlias() {
      return this.body;
    }

    public Builder emailAlias(EmailAlias body) {
      this.body = body;
      return this;
    }

    public CreatePublicMailboxAliasReq build() {
      return new CreatePublicMailboxAliasReq(this);
    }
  }
}
