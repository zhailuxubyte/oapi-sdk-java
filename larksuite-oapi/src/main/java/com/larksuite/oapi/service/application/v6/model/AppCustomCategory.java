// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class AppCustomCategory {
    @SerializedName("i18n_key")
    private String i18nKey;
    @SerializedName("description")
    private String description;
    @SerializedName("app_ids")
    private String[] appIds;

    // builder 开始
    public AppCustomCategory() {
    }

    public AppCustomCategory(Builder builder) {
        this.i18nKey = builder.i18nKey;
        this.description = builder.description;
        this.appIds = builder.appIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getI18nKey() {
        return this.i18nKey;
    }

    public void setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAppIds() {
        return this.appIds;
    }

    public void setAppIds(String[] appIds) {
        this.appIds = appIds;
    }

    public static class Builder {
        private String i18nKey;
        private String description;
        private String[] appIds;

        public Builder i18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }

        public Builder i18nKey(com.larksuite.oapi.service.application.v6.enums.I18nKeyEnum i18nKey) {
            this.i18nKey = i18nKey.getValue();
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder appIds(String[] appIds) {
            this.appIds = appIds;
            return this;
        }


        public AppCustomCategory build() {
            return new AppCustomCategory(this);
        }
    }
}
