// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateAppTableFieldResp extends BaseResponse {

  @SerializedName("data")
  private CreateAppTableFieldDTO body;

  public CreateAppTableFieldDTO getCreateAppTableFieldDTO() {
    return this.body;
  }

  public void setCreateAppTableFieldDTO(CreateAppTableFieldDTO body) {
    this.body = body;
  }
}
