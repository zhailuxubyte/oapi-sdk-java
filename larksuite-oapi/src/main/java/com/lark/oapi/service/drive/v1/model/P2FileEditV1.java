// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.event.model.BaseEventV2;

public class P2FileEditV1 extends BaseEventV2 {

  @SerializedName("event")
  private P2FileEditV1Data event;

  public P2FileEditV1Data getEvent() {
    return this.event;
  }

  public void setEvent(P2FileEditV1Data event) {
    this.event = event;
  }

}
