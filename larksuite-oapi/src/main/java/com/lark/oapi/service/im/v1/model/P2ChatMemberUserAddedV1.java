// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.event.model.BaseEventV2;

public class P2ChatMemberUserAddedV1 extends BaseEventV2 {

  @SerializedName("event")
  private P2ChatMemberUserAddedV1Data event;

  public P2ChatMemberUserAddedV1Data getEvent() {
    return this.event;
  }

  public void setEvent(P2ChatMemberUserAddedV1Data event) {
    this.event = event;
  }

}
