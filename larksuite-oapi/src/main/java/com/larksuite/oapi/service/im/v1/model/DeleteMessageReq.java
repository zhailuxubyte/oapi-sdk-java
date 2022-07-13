// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;

public class DeleteMessageReq {
    @Path
    @SerializedName("message_id")
    private String messageId;

    // builder 开始
    public DeleteMessageReq() {
    }

    public DeleteMessageReq(Builder builder) {
        this.messageId = builder.messageId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public static class Builder {

        private String messageId;

        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public DeleteMessageReq build() {
            return new DeleteMessageReq(this);
        }
    }
}
