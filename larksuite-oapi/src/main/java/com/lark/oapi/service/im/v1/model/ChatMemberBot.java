// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class ChatMemberBot {

  @SerializedName("bot_id")
  private String botId;

  // builder 开始
  public ChatMemberBot() {
  }

  public ChatMemberBot(Builder builder) {
    this.botId = builder.botId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getBotId() {
    return this.botId;
  }

  public void setBotId(String botId) {
    this.botId = botId;
  }

  public static class Builder {

    private String botId;

    public Builder botId(String botId) {
      this.botId = botId;
      return this;
    }


    public ChatMemberBot build() {
      return new ChatMemberBot(this);
    }
  }
}
