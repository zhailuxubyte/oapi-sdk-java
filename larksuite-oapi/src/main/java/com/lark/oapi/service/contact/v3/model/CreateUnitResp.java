// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateUnitResp extends BaseResponse {

  @SerializedName("data")
  private CreateUnitDTO body;

  public CreateUnitDTO getCreateUnitDTO() {
    return this.body;
  }

  public void setCreateUnitDTO(CreateUnitDTO body) {
    this.body = body;
  }
}
