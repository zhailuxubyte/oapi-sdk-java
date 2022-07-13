// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;

public class RemoveInstanceCommentReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Query
    @SerializedName("user_id")
    private Long userId;
    @Path
    @SerializedName("instance_id")
    private String instanceId;

    // builder 开始
    public RemoveInstanceCommentReq() {
    }

    public RemoveInstanceCommentReq(Builder builder) {
        this.userIdType = builder.userIdType;
        this.userId = builder.userId;
        this.instanceId = builder.instanceId;
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

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public static class Builder {
        private String userIdType;
        private Long userId;
        private String instanceId;

        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        public Builder userIdType(com.larksuite.oapi.service.approval.v4.enums.UserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public RemoveInstanceCommentReq build() {
            return new RemoveInstanceCommentReq(this);
        }
    }
}
