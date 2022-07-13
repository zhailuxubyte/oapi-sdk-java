// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppRoleMemberId {
    @SerializedName("type")
    private String type;
    @SerializedName("id")
    private String id;

    // builder 开始
    public AppRoleMemberId() {
    }

    public AppRoleMemberId(Builder builder) {
        this.type = builder.type;
        this.id = builder.id;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class Builder {
        private String type;
        private String id;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder type(com.larksuite.oapi.service.bitable.v1.enums.RoleMemberIdTypeEnum type) {
            this.type = type.getValue();
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }


        public AppRoleMemberId build() {
            return new AppRoleMemberId(this);
        }
    }
}
