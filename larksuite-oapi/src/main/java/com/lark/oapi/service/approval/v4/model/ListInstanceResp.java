// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class ListInstanceResp extends BaseResponse {

  @SerializedName("data")
  private ListInstanceDTO body;

  public ListInstanceDTO getListInstanceDTO() {
    return this.body;
  }

  public void setListInstanceDTO(ListInstanceDTO body) {
    this.body = body;
  }
}
