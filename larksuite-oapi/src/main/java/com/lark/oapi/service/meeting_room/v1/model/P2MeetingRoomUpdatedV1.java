// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.meeting_room.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.event.model.BaseEventV2;

public class P2MeetingRoomUpdatedV1 extends BaseEventV2 {

  @SerializedName("event")
  private P2MeetingRoomUpdatedV1Data event;

  public P2MeetingRoomUpdatedV1Data getEvent() {
    return this.event;
  }

  public void setEvent(P2MeetingRoomUpdatedV1Data event) {
    this.event = event;
  }

}
