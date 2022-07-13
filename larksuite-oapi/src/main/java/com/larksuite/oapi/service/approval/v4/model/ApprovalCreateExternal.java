// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class ApprovalCreateExternal {
    @SerializedName("biz_name")
    private String bizName;
    @SerializedName("biz_type")
    private String bizType;
    @SerializedName("create_link_mobile")
    private String createLinkMobile;
    @SerializedName("create_link_pc")
    private String createLinkPc;
    @SerializedName("support_pc")
    private Boolean supportPc;
    @SerializedName("support_mobile")
    private Boolean supportMobile;
    @SerializedName("support_batch_read")
    private Boolean supportBatchRead;
    @SerializedName("enable_mark_readed")
    private Boolean enableMarkReaded;
    @SerializedName("enable_quick_operate")
    private Boolean enableQuickOperate;
    @SerializedName("action_callback_url")
    private String actionCallbackUrl;
    @SerializedName("action_callback_token")
    private String actionCallbackToken;
    @SerializedName("action_callback_key")
    private String actionCallbackKey;

    // builder 开始
    public ApprovalCreateExternal() {
    }

    public ApprovalCreateExternal(Builder builder) {
        this.bizName = builder.bizName;
        this.bizType = builder.bizType;
        this.createLinkMobile = builder.createLinkMobile;
        this.createLinkPc = builder.createLinkPc;
        this.supportPc = builder.supportPc;
        this.supportMobile = builder.supportMobile;
        this.supportBatchRead = builder.supportBatchRead;
        this.enableMarkReaded = builder.enableMarkReaded;
        this.enableQuickOperate = builder.enableQuickOperate;
        this.actionCallbackUrl = builder.actionCallbackUrl;
        this.actionCallbackToken = builder.actionCallbackToken;
        this.actionCallbackKey = builder.actionCallbackKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBizName() {
        return this.bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getCreateLinkMobile() {
        return this.createLinkMobile;
    }

    public void setCreateLinkMobile(String createLinkMobile) {
        this.createLinkMobile = createLinkMobile;
    }

    public String getCreateLinkPc() {
        return this.createLinkPc;
    }

    public void setCreateLinkPc(String createLinkPc) {
        this.createLinkPc = createLinkPc;
    }

    public Boolean getSupportPc() {
        return this.supportPc;
    }

    public void setSupportPc(Boolean supportPc) {
        this.supportPc = supportPc;
    }

    public Boolean getSupportMobile() {
        return this.supportMobile;
    }

    public void setSupportMobile(Boolean supportMobile) {
        this.supportMobile = supportMobile;
    }

    public Boolean getSupportBatchRead() {
        return this.supportBatchRead;
    }

    public void setSupportBatchRead(Boolean supportBatchRead) {
        this.supportBatchRead = supportBatchRead;
    }

    public Boolean getEnableMarkReaded() {
        return this.enableMarkReaded;
    }

    public void setEnableMarkReaded(Boolean enableMarkReaded) {
        this.enableMarkReaded = enableMarkReaded;
    }

    public Boolean getEnableQuickOperate() {
        return this.enableQuickOperate;
    }

    public void setEnableQuickOperate(Boolean enableQuickOperate) {
        this.enableQuickOperate = enableQuickOperate;
    }

    public String getActionCallbackUrl() {
        return this.actionCallbackUrl;
    }

    public void setActionCallbackUrl(String actionCallbackUrl) {
        this.actionCallbackUrl = actionCallbackUrl;
    }

    public String getActionCallbackToken() {
        return this.actionCallbackToken;
    }

    public void setActionCallbackToken(String actionCallbackToken) {
        this.actionCallbackToken = actionCallbackToken;
    }

    public String getActionCallbackKey() {
        return this.actionCallbackKey;
    }

    public void setActionCallbackKey(String actionCallbackKey) {
        this.actionCallbackKey = actionCallbackKey;
    }

    public static class Builder {
        private String bizName;
        private String bizType;
        private String createLinkMobile;
        private String createLinkPc;
        private Boolean supportPc;
        private Boolean supportMobile;
        private Boolean supportBatchRead;
        private Boolean enableMarkReaded;
        private Boolean enableQuickOperate;
        private String actionCallbackUrl;
        private String actionCallbackToken;
        private String actionCallbackKey;

        public Builder bizName(String bizName) {
            this.bizName = bizName;
            return this;
        }

        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        public Builder createLinkMobile(String createLinkMobile) {
            this.createLinkMobile = createLinkMobile;
            return this;
        }

        public Builder createLinkPc(String createLinkPc) {
            this.createLinkPc = createLinkPc;
            return this;
        }

        public Builder supportPc(Boolean supportPc) {
            this.supportPc = supportPc;
            return this;
        }

        public Builder supportMobile(Boolean supportMobile) {
            this.supportMobile = supportMobile;
            return this;
        }

        public Builder supportBatchRead(Boolean supportBatchRead) {
            this.supportBatchRead = supportBatchRead;
            return this;
        }

        public Builder enableMarkReaded(Boolean enableMarkReaded) {
            this.enableMarkReaded = enableMarkReaded;
            return this;
        }

        public Builder enableQuickOperate(Boolean enableQuickOperate) {
            this.enableQuickOperate = enableQuickOperate;
            return this;
        }

        public Builder actionCallbackUrl(String actionCallbackUrl) {
            this.actionCallbackUrl = actionCallbackUrl;
            return this;
        }

        public Builder actionCallbackToken(String actionCallbackToken) {
            this.actionCallbackToken = actionCallbackToken;
            return this;
        }

        public Builder actionCallbackKey(String actionCallbackKey) {
            this.actionCallbackKey = actionCallbackKey;
            return this;
        }


        public ApprovalCreateExternal build() {
            return new ApprovalCreateExternal(this);
        }
    }
}
