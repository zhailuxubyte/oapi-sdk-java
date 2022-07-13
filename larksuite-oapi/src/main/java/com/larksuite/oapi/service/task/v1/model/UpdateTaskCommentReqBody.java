// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdateTaskCommentReqBody {
    @SerializedName("content")
    private String content;

    // builder 开始
    public UpdateTaskCommentReqBody() {
    }

    public UpdateTaskCommentReqBody(Builder builder) {
        this.content = builder.content;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class Builder {
        private String content;

        public Builder content(String content) {
            this.content = content;
            return this;
        }


        public UpdateTaskCommentReqBody build() {
            return new UpdateTaskCommentReqBody(this);
        }
    }
}
