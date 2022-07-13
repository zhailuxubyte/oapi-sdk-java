// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;

public class DeleteUserReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Path
    @SerializedName("user_id")
    private String userId;
    @Body
    private DeleteUserReqBody body;

    // builder 开始
    public DeleteUserReq() {
    }

    public DeleteUserReq(Builder builder) {
        this.userIdType = builder.userIdType;
        this.userId = builder.userId;
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

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DeleteUserReqBody getDeleteUserReqBody() {
        return this.body;
    }

    public void setDeleteUserReqBody(DeleteUserReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType;
        private String userId;
        private DeleteUserReqBody body;

        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        public Builder userIdType(com.larksuite.oapi.service.contact.v3.enums.UserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DeleteUserReqBody getDeleteUserReqBody() {
            return this.body;
        }

        public Builder deleteUserReqBody(DeleteUserReqBody body) {
            this.body = body;
            return this;
        }

        public DeleteUserReq build() {
            return new DeleteUserReq(this);
        }
    }
}
