// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;

public class UpdateFileCommentReplyReq {
    @Query
    @SerializedName("file_type")
    private String fileType;
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Path
    @SerializedName("file_token")
    private String fileToken;
    @Path
    @SerializedName("comment_id")
    private Long commentId;
    @Path
    @SerializedName("reply_id")
    private Long replyId;
    @Body
    private UpdateFileCommentReplyReqBody body;

    // builder 开始
    public UpdateFileCommentReplyReq() {
    }
    public UpdateFileCommentReplyReq(Builder builder) {
        this.fileType = builder.fileType;
        this.userIdType = builder.userIdType;
        this.fileToken = builder.fileToken;
        this.commentId = builder.commentId;
        this.replyId = builder.replyId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public Long getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getReplyId() {
        return this.replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public UpdateFileCommentReplyReqBody getUpdateFileCommentReplyReqBody() {
        return this.body;
    }

    public void setUpdateFileCommentReplyReqBody(UpdateFileCommentReplyReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String fileType;
        private String userIdType;
        private String fileToken;
        private Long commentId;
        private Long replyId;
        private UpdateFileCommentReplyReqBody body;

        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        public Builder fileType(com.larksuite.oapi.service.drive.v1.enums.FileTypeEnum fileType) {
            this.fileType = fileType.getValue();
            return this;
        }

        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        public Builder userIdType(com.larksuite.oapi.service.drive.v1.enums.UserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public Builder commentId(Long commentId) {
            this.commentId = commentId;
            return this;
        }

        public Builder replyId(Long replyId) {
            this.replyId = replyId;
            return this;
        }

        public UpdateFileCommentReplyReqBody getUpdateFileCommentReplyReqBody() {
            return this.body;
        }

        public Builder updateFileCommentReplyReqBody(UpdateFileCommentReplyReqBody body) {
            this.body = body;
            return this;
        }

        public UpdateFileCommentReplyReq build() {
            return new UpdateFileCommentReplyReq(this);
        }
    }
}
