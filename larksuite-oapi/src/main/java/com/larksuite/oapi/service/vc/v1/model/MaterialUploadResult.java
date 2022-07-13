// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class MaterialUploadResult {
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("result")
    private Integer result;

    // builder 开始
    public MaterialUploadResult() {
    }

    public MaterialUploadResult(Builder builder) {
        this.fileToken = builder.fileToken;
        this.result = builder.result;
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

    public Integer getResult() {
        return this.result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public static class Builder {
        private String fileToken;
        private Integer result;

        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        public Builder result(com.larksuite.oapi.service.vc.v1.enums.UploadResultEnum result) {
            this.result = result.getValue();
            return this;
        }


        public MaterialUploadResult build() {
            return new MaterialUploadResult(this);
        }
    }
}
