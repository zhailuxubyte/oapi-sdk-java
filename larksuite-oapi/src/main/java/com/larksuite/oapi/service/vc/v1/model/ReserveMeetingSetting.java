// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class ReserveMeetingSetting {
    @SerializedName("topic")
    private String topic;
    @SerializedName("action_permissions")
    private ReserveActionPermission[] actionPermissions;
    @SerializedName("meeting_initial_type")
    private Integer meetingInitialType;
    @SerializedName("call_setting")
    private ReserveCallSetting callSetting;

    // builder 开始
    public ReserveMeetingSetting() {
    }

    public ReserveMeetingSetting(Builder builder) {
        this.topic = builder.topic;
        this.actionPermissions = builder.actionPermissions;
        this.meetingInitialType = builder.meetingInitialType;
        this.callSetting = builder.callSetting;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ReserveActionPermission[] getActionPermissions() {
        return this.actionPermissions;
    }

    public void setActionPermissions(ReserveActionPermission[] actionPermissions) {
        this.actionPermissions = actionPermissions;
    }

    public Integer getMeetingInitialType() {
        return this.meetingInitialType;
    }

    public void setMeetingInitialType(Integer meetingInitialType) {
        this.meetingInitialType = meetingInitialType;
    }

    public ReserveCallSetting getCallSetting() {
        return this.callSetting;
    }

    public void setCallSetting(ReserveCallSetting callSetting) {
        this.callSetting = callSetting;
    }

    public static class Builder {
        private String topic;
        private ReserveActionPermission[] actionPermissions;
        private Integer meetingInitialType;
        private ReserveCallSetting callSetting;

        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public Builder actionPermissions(ReserveActionPermission[] actionPermissions) {
            this.actionPermissions = actionPermissions;
            return this;
        }

        public Builder meetingInitialType(Integer meetingInitialType) {
            this.meetingInitialType = meetingInitialType;
            return this;
        }

        public Builder meetingInitialType(com.larksuite.oapi.service.vc.v1.enums.MeetingInitialTypeEnum meetingInitialType) {
            this.meetingInitialType = meetingInitialType.getValue();
            return this;
        }

        public Builder callSetting(ReserveCallSetting callSetting) {
            this.callSetting = callSetting;
            return this;
        }


        public ReserveMeetingSetting build() {
            return new ReserveMeetingSetting(this);
        }
    }
}
