// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;

public class GetFileReq {
    @Path
    @SerializedName("file_key")
    private String fileKey;

    // builder 开始
    public GetFileReq() {
    }

    public GetFileReq(Builder builder) {
        this.fileKey = builder.fileKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileKey() {
        return this.fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public static class Builder {

        private String fileKey;

        public Builder fileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }

        public GetFileReq build() {
            return new GetFileReq(this);
        }
    }
}
