// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class DeleteTabsChatTabDTO {

  @SerializedName("chat_tabs")
  private ChatTab[] chatTabs;

  public ChatTab[] getChatTabs() {
    return this.chatTabs;
  }

  public void setChatTabs(ChatTab[] chatTabs) {
    this.chatTabs = chatTabs;
  }

}
