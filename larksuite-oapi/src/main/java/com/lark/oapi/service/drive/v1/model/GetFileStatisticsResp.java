// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class GetFileStatisticsResp extends BaseResponse {

  @SerializedName("data")
  private GetFileStatisticsDTO body;

  public GetFileStatisticsDTO getGetFileStatisticsDTO() {
    return this.body;
  }

  public void setGetFileStatisticsDTO(GetFileStatisticsDTO body) {
    this.body = body;
  }
}
