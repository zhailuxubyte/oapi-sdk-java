// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class UploadFinishMediaResp extends BaseResponse {

  @SerializedName("data")
  private UploadFinishMediaDTO body;

  public UploadFinishMediaDTO getUploadFinishMediaDTO() {
    return this.body;
  }

  public void setUploadFinishMediaDTO(UploadFinishMediaDTO body) {
    this.body = body;
  }
}
