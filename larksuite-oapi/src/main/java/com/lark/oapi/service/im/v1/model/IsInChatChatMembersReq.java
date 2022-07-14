// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class IsInChatChatMembersReq {

  @Path
  @SerializedName("chat_id")
  private String chatId;

  // builder 开始
  public IsInChatChatMembersReq() {
  }

  public IsInChatChatMembersReq(Builder builder) {
    this.chatId = builder.chatId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getChatId() {
    return this.chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public static class Builder {

    private String chatId;

    public Builder chatId(String chatId) {
      this.chatId = chatId;
      return this;
    }

    public IsInChatChatMembersReq build() {
      return new IsInChatChatMembersReq(this);
    }
  }
}
