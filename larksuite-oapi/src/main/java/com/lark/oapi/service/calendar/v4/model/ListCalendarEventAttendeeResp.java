// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class ListCalendarEventAttendeeResp extends BaseResponse {

  @SerializedName("data")
  private ListCalendarEventAttendeeDTO body;

  public ListCalendarEventAttendeeDTO getListCalendarEventAttendeeDTO() {
    return this.body;
  }

  public void setListCalendarEventAttendeeDTO(ListCalendarEventAttendeeDTO body) {
    this.body = body;
  }
}
