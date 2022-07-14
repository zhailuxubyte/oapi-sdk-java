// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class PatchChatAnnouncementReq {

  @Path
  @SerializedName("chat_id")
  private String chatId;
  @Body
  private PatchChatAnnouncementReqBody body;

  // builder 开始
  public PatchChatAnnouncementReq() {
  }

  public PatchChatAnnouncementReq(Builder builder) {
    this.chatId = builder.chatId;
    this.body = builder.body;
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

  public PatchChatAnnouncementReqBody getPatchChatAnnouncementReqBody() {
    return this.body;
  }

  public void setPatchChatAnnouncementReqBody(PatchChatAnnouncementReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String chatId;
    private PatchChatAnnouncementReqBody body;

    public Builder chatId(String chatId) {
      this.chatId = chatId;
      return this;
    }

    public PatchChatAnnouncementReqBody getPatchChatAnnouncementReqBody() {
      return this.body;
    }

    public Builder patchChatAnnouncementReqBody(PatchChatAnnouncementReqBody body) {
      this.body = body;
      return this;
    }

    public PatchChatAnnouncementReq build() {
      return new PatchChatAnnouncementReq(this);
    }
  }
}
