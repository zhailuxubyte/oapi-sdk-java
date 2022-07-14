// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class PublicMailbox {

  @SerializedName("public_mailbox_id")
  private String publicMailboxId;
  @SerializedName("email")
  private String email;
  @SerializedName("name")
  private String name;

  // builder 开始
  public PublicMailbox() {
  }

  public PublicMailbox(Builder builder) {
    this.publicMailboxId = builder.publicMailboxId;
    this.email = builder.email;
    this.name = builder.name;
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

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static class Builder {

    private String publicMailboxId;
    private String email;
    private String name;

    public Builder publicMailboxId(String publicMailboxId) {
      this.publicMailboxId = publicMailboxId;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }


    public PublicMailbox build() {
      return new PublicMailbox(this);
    }
  }
}
