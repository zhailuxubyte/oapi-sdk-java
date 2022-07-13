// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Query;

public class BatchGetTmpDownloadUrlMediaReq {
    @Query
    @SerializedName("file_tokens")
    private String[] fileTokens;
    @Query
    @SerializedName("extra")
    private String extra;

    // builder 开始
    public BatchGetTmpDownloadUrlMediaReq() {
    }

    public BatchGetTmpDownloadUrlMediaReq(Builder builder) {
        this.fileTokens = builder.fileTokens;
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getFileTokens() {
        return this.fileTokens;
    }

    public void setFileTokens(String[] fileTokens) {
        this.fileTokens = fileTokens;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public static class Builder {
        private String[] fileTokens;
        private String extra;

        public Builder fileTokens(String[] fileTokens) {
            this.fileTokens = fileTokens;
            return this;
        }

        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        public BatchGetTmpDownloadUrlMediaReq build() {
            return new BatchGetTmpDownloadUrlMediaReq(this);
        }
    }
}
