// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class UploadFinishMediaReqBody {
    @SerializedName("upload_id")
    private String uploadId;
    @SerializedName("block_num")
    private Integer blockNum;

    // builder 开始
    public UploadFinishMediaReqBody() {
    }

    public UploadFinishMediaReqBody(Builder builder) {
        this.uploadId = builder.uploadId;
        this.blockNum = builder.blockNum;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getBlockNum() {
        return this.blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public static class Builder {
        private String uploadId;
        private Integer blockNum;

        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public Builder blockNum(Integer blockNum) {
            this.blockNum = blockNum;
            return this;
        }


        public UploadFinishMediaReqBody build() {
            return new UploadFinishMediaReqBody(this);
        }
    }
}
