// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateExchangeBindingResp extends BaseResponse {

  @SerializedName("data")
  private CreateExchangeBindingDTO body;

  public CreateExchangeBindingDTO getCreateExchangeBindingDTO() {
    return this.body;
  }

  public void setCreateExchangeBindingDTO(CreateExchangeBindingDTO body) {
    this.body = body;
  }
}
