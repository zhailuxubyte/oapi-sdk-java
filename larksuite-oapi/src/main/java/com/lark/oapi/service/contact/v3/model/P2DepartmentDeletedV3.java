// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.event.model.BaseEventV2;

public class P2DepartmentDeletedV3 extends BaseEventV2 {

  @SerializedName("event")
  private P2DepartmentDeletedV3Data event;

  public P2DepartmentDeletedV3Data getEvent() {
    return this.event;
  }

  public void setEvent(P2DepartmentDeletedV3Data event) {
    this.event = event;
  }

}
