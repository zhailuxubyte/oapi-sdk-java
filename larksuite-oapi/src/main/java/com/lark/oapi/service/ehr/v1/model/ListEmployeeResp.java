// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.ehr.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class ListEmployeeResp extends BaseResponse {

  @SerializedName("data")
  private ListEmployeeDTO body;

  public ListEmployeeDTO getListEmployeeDTO() {
    return this.body;
  }

  public void setListEmployeeDTO(ListEmployeeDTO body) {
    this.body = body;
  }
}
