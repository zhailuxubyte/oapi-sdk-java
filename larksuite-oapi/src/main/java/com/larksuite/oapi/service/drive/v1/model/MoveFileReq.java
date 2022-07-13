// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;

public class MoveFileReq {
    @Path
    @SerializedName("file_token")
    private String fileToken;
    @Body
    private MoveFileReqBody body;

    // builder 开始
    public MoveFileReq() {
    }

    public MoveFileReq(Builder builder) {
        this.fileToken = builder.fileToken;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public MoveFileReqBody getMoveFileReqBody() {
        return this.body;
    }

    public void setMoveFileReqBody(MoveFileReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String fileToken;
        private MoveFileReqBody body;

        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public MoveFileReqBody getMoveFileReqBody() {
            return this.body;
        }

        public Builder moveFileReqBody(MoveFileReqBody body) {
            this.body = body;
            return this;
        }

        public MoveFileReq build() {
            return new MoveFileReq(this);
        }
    }
}
