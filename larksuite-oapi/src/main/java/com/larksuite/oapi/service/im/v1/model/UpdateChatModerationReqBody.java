// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdateChatModerationReqBody {
    @SerializedName("moderation_setting")
    private String moderationSetting;
    @SerializedName("moderator_added_list")
    private String[] moderatorAddedList;
    @SerializedName("moderator_removed_list")
    private String[] moderatorRemovedList;

    // builder 开始
    public UpdateChatModerationReqBody() {
    }

    public UpdateChatModerationReqBody(Builder builder) {
        this.moderationSetting = builder.moderationSetting;
        this.moderatorAddedList = builder.moderatorAddedList;
        this.moderatorRemovedList = builder.moderatorRemovedList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getModerationSetting() {
        return this.moderationSetting;
    }

    public void setModerationSetting(String moderationSetting) {
        this.moderationSetting = moderationSetting;
    }

    public String[] getModeratorAddedList() {
        return this.moderatorAddedList;
    }

    public void setModeratorAddedList(String[] moderatorAddedList) {
        this.moderatorAddedList = moderatorAddedList;
    }

    public String[] getModeratorRemovedList() {
        return this.moderatorRemovedList;
    }

    public void setModeratorRemovedList(String[] moderatorRemovedList) {
        this.moderatorRemovedList = moderatorRemovedList;
    }

    public static class Builder {
        private String moderationSetting;
        private String[] moderatorAddedList;
        private String[] moderatorRemovedList;

        public Builder moderationSetting(String moderationSetting) {
            this.moderationSetting = moderationSetting;
            return this;
        }

        public Builder moderatorAddedList(String[] moderatorAddedList) {
            this.moderatorAddedList = moderatorAddedList;
            return this;
        }

        public Builder moderatorRemovedList(String[] moderatorRemovedList) {
            this.moderatorRemovedList = moderatorRemovedList;
            return this;
        }


        public UpdateChatModerationReqBody build() {
            return new UpdateChatModerationReqBody(this);
        }
    }
}
