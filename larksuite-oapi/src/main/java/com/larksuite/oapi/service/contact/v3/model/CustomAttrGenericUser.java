// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class CustomAttrGenericUser {
    @SerializedName("id")
    private String id;
    @SerializedName("type")
    private Integer type;

    // builder 开始
    public CustomAttrGenericUser() {
    }

    public CustomAttrGenericUser(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public static class Builder {
        private String id;
        private Integer type;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder type(Integer type) {
            this.type = type;
            return this;
        }


        public CustomAttrGenericUser build() {
            return new CustomAttrGenericUser(this);
        }
    }
}
