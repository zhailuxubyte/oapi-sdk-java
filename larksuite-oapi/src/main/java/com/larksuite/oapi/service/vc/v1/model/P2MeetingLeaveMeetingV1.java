// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.event.model.BaseEventV2;

public class P2MeetingLeaveMeetingV1 extends BaseEventV2 {
    @SerializedName("event")
    private P2MeetingLeaveMeetingV1Data event;

    public P2MeetingLeaveMeetingV1Data getEvent() {
        return this.event;
    }

    public void setEvent(P2MeetingLeaveMeetingV1Data event) {
        this.event = event;
    }

}
