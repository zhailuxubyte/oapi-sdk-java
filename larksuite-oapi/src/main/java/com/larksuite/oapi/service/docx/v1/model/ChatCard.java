// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class ChatCard {
    @SerializedName("chat_id")
    private Long chatId;
    @SerializedName("align")
    private Integer align;

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

}
