// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.event.model.BaseEventV2;

public class P2ChatMemberUserWithdrawnV1 extends BaseEventV2 {
    @SerializedName("event")
    private P2ChatMemberUserWithdrawnV1Data event;

    public P2ChatMemberUserWithdrawnV1Data getEvent() {
        return this.event;
    }

    public void setEvent(P2ChatMemberUserWithdrawnV1Data event) {
        this.event = event;
    }

}
