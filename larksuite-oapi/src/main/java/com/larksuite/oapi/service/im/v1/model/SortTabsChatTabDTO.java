// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class SortTabsChatTabDTO {
    @SerializedName("chat_tabs")
    private ChatTab[] chatTabs;

    public ChatTab[] getChatTabs() {
        return this.chatTabs;
    }

    public void setChatTabs(ChatTab[] chatTabs) {
        this.chatTabs = chatTabs;
    }

}
