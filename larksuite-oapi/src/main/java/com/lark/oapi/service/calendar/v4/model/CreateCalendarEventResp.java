// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateCalendarEventResp extends BaseResponse {

  @SerializedName("data")
  private CreateCalendarEventDTO body;

  public CreateCalendarEventDTO getCreateCalendarEventDTO() {
    return this.body;
  }

  public void setCreateCalendarEventDTO(CreateCalendarEventDTO body) {
    this.body = body;
  }
}
