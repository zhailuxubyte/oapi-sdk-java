// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class KickoutMeetingResp extends BaseResponse {

  @SerializedName("data")
  private KickoutMeetingDTO body;

  public KickoutMeetingDTO getKickoutMeetingDTO() {
    return this.body;
  }

  public void setKickoutMeetingDTO(KickoutMeetingDTO body) {
    this.body = body;
  }
}
