// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class FindByDepartmentUserResp extends BaseResponse {

  @SerializedName("data")
  private FindByDepartmentUserDTO body;

  public FindByDepartmentUserDTO getFindByDepartmentUserDTO() {
    return this.body;
  }

  public void setFindByDepartmentUserDTO(FindByDepartmentUserDTO body) {
    this.body = body;
  }
}
