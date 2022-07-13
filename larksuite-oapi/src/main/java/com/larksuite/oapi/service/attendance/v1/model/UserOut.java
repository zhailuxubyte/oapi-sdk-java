// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class UserOut {
    @SerializedName("approval_id")
    private String approvalId;
    @SerializedName("uniq_id")
    private String uniqId;
    @SerializedName("unit")
    private Integer unit;
    @SerializedName("interval")
    private Integer interval;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("end_time")
    private String endTime;
    @SerializedName("i18n_names")
    private I18nNames i18nNames;
    @SerializedName("default_locale")
    private String defaultLocale;
    @SerializedName("reason")
    private String reason;
    @SerializedName("approve_pass_time")
    private String approvePassTime;
    @SerializedName("approve_apply_time")
    private String approveApplyTime;

    // builder 开始
    public UserOut() {
    }

    public UserOut(Builder builder) {
        this.approvalId = builder.approvalId;
        this.uniqId = builder.uniqId;
        this.unit = builder.unit;
        this.interval = builder.interval;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.i18nNames = builder.i18nNames;
        this.defaultLocale = builder.defaultLocale;
        this.reason = builder.reason;
        this.approvePassTime = builder.approvePassTime;
        this.approveApplyTime = builder.approveApplyTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApprovalId() {
        return this.approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
    }

    public String getUniqId() {
        return this.uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId;
    }

    public Integer getUnit() {
        return this.unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getInterval() {
        return this.interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public I18nNames getI18nNames() {
        return this.i18nNames;
    }

    public void setI18nNames(I18nNames i18nNames) {
        this.i18nNames = i18nNames;
    }

    public String getDefaultLocale() {
        return this.defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApprovePassTime() {
        return this.approvePassTime;
    }

    public void setApprovePassTime(String approvePassTime) {
        this.approvePassTime = approvePassTime;
    }

    public String getApproveApplyTime() {
        return this.approveApplyTime;
    }

    public void setApproveApplyTime(String approveApplyTime) {
        this.approveApplyTime = approveApplyTime;
    }

    public static class Builder {
        private String approvalId;
        private String uniqId;
        private Integer unit;
        private Integer interval;
        private String startTime;
        private String endTime;
        private I18nNames i18nNames;
        private String defaultLocale;
        private String reason;
        private String approvePassTime;
        private String approveApplyTime;

        public Builder approvalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }

        public Builder uniqId(String uniqId) {
            this.uniqId = uniqId;
            return this;
        }

        public Builder unit(Integer unit) {
            this.unit = unit;
            return this;
        }

        public Builder unit(com.larksuite.oapi.service.attendance.v1.enums.UnitEnum unit) {
            this.unit = unit.getValue();
            return this;
        }

        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder i18nNames(I18nNames i18nNames) {
            this.i18nNames = i18nNames;
            return this;
        }

        public Builder defaultLocale(String defaultLocale) {
            this.defaultLocale = defaultLocale;
            return this;
        }

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder approvePassTime(String approvePassTime) {
            this.approvePassTime = approvePassTime;
            return this;
        }

        public Builder approveApplyTime(String approveApplyTime) {
            this.approveApplyTime = approveApplyTime;
            return this;
        }


        public UserOut build() {
            return new UserOut(this);
        }
    }
}
