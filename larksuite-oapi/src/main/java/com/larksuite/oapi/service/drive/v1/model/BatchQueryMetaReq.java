// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Query;

public class BatchQueryMetaReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Body
    private MetaRequest body;

    // builder 开始
    public BatchQueryMetaReq() {
    }

    public BatchQueryMetaReq(Builder builder) {
        this.userIdType = builder.userIdType;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public MetaRequest getMetaRequest() {
        return this.body;
    }

    public void setMetaRequest(MetaRequest body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType;
        private MetaRequest body;

        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        public Builder userIdType(com.larksuite.oapi.service.drive.v1.enums.UserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public MetaRequest getMetaRequest() {
            return this.body;
        }

        public Builder metaRequest(MetaRequest body) {
            this.body = body;
            return this;
        }

        public BatchQueryMetaReq build() {
            return new BatchQueryMetaReq(this);
        }
    }
}
