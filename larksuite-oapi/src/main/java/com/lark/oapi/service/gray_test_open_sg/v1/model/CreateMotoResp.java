// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.gray_test_open_sg.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateMotoResp extends BaseResponse {

  @SerializedName("data")
  private CreateMotoDTO body;

  public CreateMotoDTO getCreateMotoDTO() {
    return this.body;
  }

  public void setCreateMotoDTO(CreateMotoDTO body) {
    this.body = body;
  }
}
