// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.acs.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.event.model.BaseEventV2;

public class P2UserUpdatedV1 extends BaseEventV2 {

  @SerializedName("event")
  private P2UserUpdatedV1Data event;

  public P2UserUpdatedV1Data getEvent() {
    return this.event;
  }

  public void setEvent(P2UserUpdatedV1Data event) {
    this.event = event;
  }

}
