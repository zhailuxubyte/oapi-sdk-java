// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateCalendarAclResp extends BaseResponse {

  @SerializedName("data")
  private CreateCalendarAclDTO body;

  public CreateCalendarAclDTO getCreateCalendarAclDTO() {
    return this.body;
  }

  public void setCreateCalendarAclDTO(CreateCalendarAclDTO body) {
    this.body = body;
  }
}
