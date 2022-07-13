// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class File {
    @SerializedName("token")
    private String token;
    @SerializedName("name")
    private String name;

    // builder 开始
    public File() {
    }

    public File(Builder builder) {
        this.token = builder.token;
        this.name = builder.name;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        private String token;
        private String name;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public File build() {
            return new File(this);
        }
    }
}
