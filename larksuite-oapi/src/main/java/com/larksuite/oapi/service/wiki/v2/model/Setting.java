// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;

public class Setting {
    @SerializedName("create_setting")
    private String createSetting;
    @SerializedName("security_setting")
    private String securitySetting;
    @SerializedName("comment_setting")
    private String commentSetting;

    // builder 开始
    public Setting() {
    }

    public Setting(Builder builder) {
        this.createSetting = builder.createSetting;
        this.securitySetting = builder.securitySetting;
        this.commentSetting = builder.commentSetting;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCreateSetting() {
        return this.createSetting;
    }

    public void setCreateSetting(String createSetting) {
        this.createSetting = createSetting;
    }

    public String getSecuritySetting() {
        return this.securitySetting;
    }

    public void setSecuritySetting(String securitySetting) {
        this.securitySetting = securitySetting;
    }

    public String getCommentSetting() {
        return this.commentSetting;
    }

    public void setCommentSetting(String commentSetting) {
        this.commentSetting = commentSetting;
    }

    public static class Builder {
        private String createSetting;
        private String securitySetting;
        private String commentSetting;

        public Builder createSetting(String createSetting) {
            this.createSetting = createSetting;
            return this;
        }

        public Builder securitySetting(String securitySetting) {
            this.securitySetting = securitySetting;
            return this;
        }

        public Builder commentSetting(String commentSetting) {
            this.commentSetting = commentSetting;
            return this;
        }


        public Setting build() {
            return new Setting(this);
        }
    }
}
