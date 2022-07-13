// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchMessageSendProgress {
    @SerializedName("valid_user_ids_count")
    private Integer validUserIdsCount;
    @SerializedName("success_user_ids_count")
    private Integer successUserIdsCount;
    @SerializedName("read_user_ids_count")
    private Integer readUserIdsCount;

    // builder 开始
    public BatchMessageSendProgress() {
    }

    public BatchMessageSendProgress(Builder builder) {
        this.validUserIdsCount = builder.validUserIdsCount;
        this.successUserIdsCount = builder.successUserIdsCount;
        this.readUserIdsCount = builder.readUserIdsCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getValidUserIdsCount() {
        return this.validUserIdsCount;
    }

    public void setValidUserIdsCount(Integer validUserIdsCount) {
        this.validUserIdsCount = validUserIdsCount;
    }

    public Integer getSuccessUserIdsCount() {
        return this.successUserIdsCount;
    }

    public void setSuccessUserIdsCount(Integer successUserIdsCount) {
        this.successUserIdsCount = successUserIdsCount;
    }

    public Integer getReadUserIdsCount() {
        return this.readUserIdsCount;
    }

    public void setReadUserIdsCount(Integer readUserIdsCount) {
        this.readUserIdsCount = readUserIdsCount;
    }

    public static class Builder {
        private Integer validUserIdsCount;
        private Integer successUserIdsCount;
        private Integer readUserIdsCount;

        public Builder validUserIdsCount(Integer validUserIdsCount) {
            this.validUserIdsCount = validUserIdsCount;
            return this;
        }

        public Builder successUserIdsCount(Integer successUserIdsCount) {
            this.successUserIdsCount = successUserIdsCount;
            return this;
        }

        public Builder readUserIdsCount(Integer readUserIdsCount) {
            this.readUserIdsCount = readUserIdsCount;
            return this;
        }


        public BatchMessageSendProgress build() {
            return new BatchMessageSendProgress(this);
        }
    }
}
