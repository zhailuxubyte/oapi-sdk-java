// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class GetMeetingRecordingResp extends BaseResponse {

  @SerializedName("data")
  private GetMeetingRecordingDTO body;

  public GetMeetingRecordingDTO getGetMeetingRecordingDTO() {
    return this.body;
  }

  public void setGetMeetingRecordingDTO(GetMeetingRecordingDTO body) {
    this.body = body;
  }
}
