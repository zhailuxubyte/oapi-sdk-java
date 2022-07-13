// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;

public class EndMeetingReq {
    @Path
    @SerializedName("meeting_id")
    private Long meetingId;

    // builder 开始
    public EndMeetingReq() {
    }

    public EndMeetingReq(Builder builder) {
        this.meetingId = builder.meetingId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Long getMeetingId() {
        return this.meetingId;
    }

    public void setMeetingId(Long meetingId) {
        this.meetingId = meetingId;
    }

    public static class Builder {

        private Long meetingId;

        public Builder meetingId(Long meetingId) {
            this.meetingId = meetingId;
            return this;
        }

        public EndMeetingReq build() {
            return new EndMeetingReq(this);
        }
    }
}
