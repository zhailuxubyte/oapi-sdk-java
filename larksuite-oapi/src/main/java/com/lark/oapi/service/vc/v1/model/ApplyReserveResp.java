// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class ApplyReserveResp extends BaseResponse {

  @SerializedName("data")
  private ApplyReserveDTO body;

  public ApplyReserveDTO getApplyReserveDTO() {
    return this.body;
  }

  public void setApplyReserveDTO(ApplyReserveDTO body) {
    this.body = body;
  }
}
