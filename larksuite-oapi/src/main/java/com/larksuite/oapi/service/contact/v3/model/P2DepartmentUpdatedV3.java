// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.event.model.BaseEventV2;

public class P2DepartmentUpdatedV3 extends BaseEventV2 {
    @SerializedName("event")
    private P2DepartmentUpdatedV3Data event;

    public P2DepartmentUpdatedV3Data getEvent() {
        return this.event;
    }

    public void setEvent(P2DepartmentUpdatedV3Data event) {
        this.event = event;
    }

}
