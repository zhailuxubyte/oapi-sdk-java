// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.event.model.BaseEventV2;

public class P2MeetingShareStartedV1 extends BaseEventV2 {
    @SerializedName("event")
    private P2MeetingShareStartedV1Data event;

    public P2MeetingShareStartedV1Data getEvent() {
        return this.event;
    }

    public void setEvent(P2MeetingShareStartedV1Data event) {
        this.event = event;
    }

}
