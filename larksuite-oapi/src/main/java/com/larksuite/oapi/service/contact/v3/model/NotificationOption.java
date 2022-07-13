// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class NotificationOption {
    @SerializedName("channels")
    private String[] channels;
    @SerializedName("language")
    private String language;

    // builder 开始
    public NotificationOption() {
    }

    public NotificationOption(Builder builder) {
        this.channels = builder.channels;
        this.language = builder.language;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getChannels() {
        return this.channels;
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static class Builder {
        private String[] channels;
        private String language;

        public Builder channels(String[] channels) {
            this.channels = channels;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder language(com.larksuite.oapi.service.contact.v3.enums.LanguageEnum language) {
            this.language = language.getValue();
            return this;
        }


        public NotificationOption build() {
            return new NotificationOption(this);
        }
    }
}
