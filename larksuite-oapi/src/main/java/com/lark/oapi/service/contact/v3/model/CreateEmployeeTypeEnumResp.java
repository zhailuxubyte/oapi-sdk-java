// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateEmployeeTypeEnumResp extends BaseResponse {

  @SerializedName("data")
  private CreateEmployeeTypeEnumDTO body;

  public CreateEmployeeTypeEnumDTO getCreateEmployeeTypeEnumDTO() {
    return this.body;
  }

  public void setCreateEmployeeTypeEnumDTO(CreateEmployeeTypeEnumDTO body) {
    this.body = body;
  }
}
