// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2MeetingShareStartedV1Data {
    @SerializedName("meeting")
    private MeetingEventMeeting meeting;
    @SerializedName("operator")
    private MeetingEventUser operator;

    public MeetingEventMeeting getMeeting() {
        return this.meeting;
    }

    public void setMeeting(MeetingEventMeeting meeting) {
        this.meeting = meeting;
    }

    public MeetingEventUser getOperator() {
        return this.operator;
    }

    public void setOperator(MeetingEventUser operator) {
        this.operator = operator;
    }

}
