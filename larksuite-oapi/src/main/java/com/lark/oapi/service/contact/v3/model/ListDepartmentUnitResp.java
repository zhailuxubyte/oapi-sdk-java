// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class ListDepartmentUnitResp extends BaseResponse {

  @SerializedName("data")
  private ListDepartmentUnitDTO body;

  public ListDepartmentUnitDTO getListDepartmentUnitDTO() {
    return this.body;
  }

  public void setListDepartmentUnitDTO(ListDepartmentUnitDTO body) {
    this.body = body;
  }
}
