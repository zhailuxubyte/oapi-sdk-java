// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class AppAdminUser {
    @SerializedName("admin_type")
    private String[] adminType;
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public AppAdminUser() {
    }

    public AppAdminUser(Builder builder) {
        this.adminType = builder.adminType;
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getAdminType() {
        return this.adminType;
    }

    public void setAdminType(String[] adminType) {
        this.adminType = adminType;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        private String[] adminType;
        private String userId;

        public Builder adminType(String[] adminType) {
            this.adminType = adminType;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public AppAdminUser build() {
            return new AppAdminUser(this);
        }
    }
}
