// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateAppRoleResp extends BaseResponse {

  @SerializedName("data")
  private CreateAppRoleDTO body;

  public CreateAppRoleDTO getCreateAppRoleDTO() {
    return this.body;
  }

  public void setCreateAppRoleDTO(CreateAppRoleDTO body) {
    this.body = body;
  }
}
