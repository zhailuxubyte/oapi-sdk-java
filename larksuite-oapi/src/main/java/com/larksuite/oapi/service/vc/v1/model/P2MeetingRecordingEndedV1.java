// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.event.model.BaseEventV2;

public class P2MeetingRecordingEndedV1 extends BaseEventV2 {
    @SerializedName("event")
    private P2MeetingRecordingEndedV1Data event;

    public P2MeetingRecordingEndedV1Data getEvent() {
        return this.event;
    }

    public void setEvent(P2MeetingRecordingEndedV1Data event) {
        this.event = event;
    }

}
