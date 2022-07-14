// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class ChatCard {

  @SerializedName("chat_id")
  private Long chatId;
  @SerializedName("align")
  private Integer align;

  // builder 开始
  public ChatCard() {
  }

  public ChatCard(Builder builder) {
    this.chatId = builder.chatId;
    this.align = builder.align;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getChatId() {
    return this.chatId;
  }

  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

  public Integer getAlign() {
    return this.align;
  }

  public void setAlign(Integer align) {
    this.align = align;
  }

  public static class Builder {

    private Long chatId;
    private Integer align;

    public Builder chatId(Long chatId) {
      this.chatId = chatId;
      return this;
    }

    public Builder align(Integer align) {
      this.align = align;
      return this;
    }

    public Builder align(com.lark.oapi.service.docx.v1.enums.AlignEnum align) {
      this.align = align.getValue();
      return this;
    }


    public ChatCard build() {
      return new ChatCard(this);
    }
  }
}
