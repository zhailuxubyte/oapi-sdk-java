// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditEventExtend {
    @SerializedName("comment_type")
    private String commentType;
    @SerializedName("app_detail")
    private String appDetail;
    @SerializedName("two_step_validation")
    private Boolean twoStepValidation;
    @SerializedName("login_method")
    private String loginMethod;
    @SerializedName("new_people_num_in_video")
    private Integer newPeopleNumInVideo;
    @SerializedName("external_people_num_in_video")
    private Integer externalPeopleNumInVideo;
    @SerializedName("external_people_num_in_chat")
    private Integer externalPeopleNumInChat;
    @SerializedName("join_group")
    private Integer joinGroup;
    @SerializedName("quit_group")
    private Integer quitGroup;
    @SerializedName("external_people_num_in_doc_share")
    private Integer externalPeopleNumInDocShare;

    // builder 开始
    public AuditEventExtend() {
    }

    public AuditEventExtend(Builder builder) {
        this.commentType = builder.commentType;
        this.appDetail = builder.appDetail;
        this.twoStepValidation = builder.twoStepValidation;
        this.loginMethod = builder.loginMethod;
        this.newPeopleNumInVideo = builder.newPeopleNumInVideo;
        this.externalPeopleNumInVideo = builder.externalPeopleNumInVideo;
        this.externalPeopleNumInChat = builder.externalPeopleNumInChat;
        this.joinGroup = builder.joinGroup;
        this.quitGroup = builder.quitGroup;
        this.externalPeopleNumInDocShare = builder.externalPeopleNumInDocShare;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCommentType() {
        return this.commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public String getAppDetail() {
        return this.appDetail;
    }

    public void setAppDetail(String appDetail) {
        this.appDetail = appDetail;
    }

    public Boolean getTwoStepValidation() {
        return this.twoStepValidation;
    }

    public void setTwoStepValidation(Boolean twoStepValidation) {
        this.twoStepValidation = twoStepValidation;
    }

    public String getLoginMethod() {
        return this.loginMethod;
    }

    public void setLoginMethod(String loginMethod) {
        this.loginMethod = loginMethod;
    }

    public Integer getNewPeopleNumInVideo() {
        return this.newPeopleNumInVideo;
    }

    public void setNewPeopleNumInVideo(Integer newPeopleNumInVideo) {
        this.newPeopleNumInVideo = newPeopleNumInVideo;
    }

    public Integer getExternalPeopleNumInVideo() {
        return this.externalPeopleNumInVideo;
    }

    public void setExternalPeopleNumInVideo(Integer externalPeopleNumInVideo) {
        this.externalPeopleNumInVideo = externalPeopleNumInVideo;
    }

    public Integer getExternalPeopleNumInChat() {
        return this.externalPeopleNumInChat;
    }

    public void setExternalPeopleNumInChat(Integer externalPeopleNumInChat) {
        this.externalPeopleNumInChat = externalPeopleNumInChat;
    }

    public Integer getJoinGroup() {
        return this.joinGroup;
    }

    public void setJoinGroup(Integer joinGroup) {
        this.joinGroup = joinGroup;
    }

    public Integer getQuitGroup() {
        return this.quitGroup;
    }

    public void setQuitGroup(Integer quitGroup) {
        this.quitGroup = quitGroup;
    }

    public Integer getExternalPeopleNumInDocShare() {
        return this.externalPeopleNumInDocShare;
    }

    public void setExternalPeopleNumInDocShare(Integer externalPeopleNumInDocShare) {
        this.externalPeopleNumInDocShare = externalPeopleNumInDocShare;
    }

    public static class Builder {
        private String commentType;
        private String appDetail;
        private Boolean twoStepValidation;
        private String loginMethod;
        private Integer newPeopleNumInVideo;
        private Integer externalPeopleNumInVideo;
        private Integer externalPeopleNumInChat;
        private Integer joinGroup;
        private Integer quitGroup;
        private Integer externalPeopleNumInDocShare;

        public Builder commentType(String commentType) {
            this.commentType = commentType;
            return this;
        }

        public Builder appDetail(String appDetail) {
            this.appDetail = appDetail;
            return this;
        }

        public Builder twoStepValidation(Boolean twoStepValidation) {
            this.twoStepValidation = twoStepValidation;
            return this;
        }

        public Builder loginMethod(String loginMethod) {
            this.loginMethod = loginMethod;
            return this;
        }

        public Builder newPeopleNumInVideo(Integer newPeopleNumInVideo) {
            this.newPeopleNumInVideo = newPeopleNumInVideo;
            return this;
        }

        public Builder externalPeopleNumInVideo(Integer externalPeopleNumInVideo) {
            this.externalPeopleNumInVideo = externalPeopleNumInVideo;
            return this;
        }

        public Builder externalPeopleNumInChat(Integer externalPeopleNumInChat) {
            this.externalPeopleNumInChat = externalPeopleNumInChat;
            return this;
        }

        public Builder joinGroup(Integer joinGroup) {
            this.joinGroup = joinGroup;
            return this;
        }

        public Builder quitGroup(Integer quitGroup) {
            this.quitGroup = quitGroup;
            return this;
        }

        public Builder externalPeopleNumInDocShare(Integer externalPeopleNumInDocShare) {
            this.externalPeopleNumInDocShare = externalPeopleNumInDocShare;
            return this;
        }


        public AuditEventExtend build() {
            return new AuditEventExtend(this);
        }
    }
}
