// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class AppScope {
    @SerializedName("scope")
    private String scope;
    @SerializedName("description")
    private String description;
    @SerializedName("level")
    private Integer level;

    // builder 开始
    public AppScope() {
    }

    public AppScope(Builder builder) {
        this.scope = builder.scope;
        this.description = builder.description;
        this.level = builder.level;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public static class Builder {
        private String scope;
        private String description;
        private Integer level;

        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        public Builder level(com.larksuite.oapi.service.application.v6.enums.ScopeLevelEnum level) {
            this.level = level.getValue();
            return this;
        }


        public AppScope build() {
            return new AppScope(this);
        }
    }
}
