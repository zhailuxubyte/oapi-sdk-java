// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class PatchCalendarResp extends BaseResponse {

  @SerializedName("data")
  private PatchCalendarDTO body;

  public PatchCalendarDTO getPatchCalendarDTO() {
    return this.body;
  }

  public void setPatchCalendarDTO(PatchCalendarDTO body) {
    this.body = body;
  }
}
