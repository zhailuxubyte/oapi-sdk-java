// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class ListSpaceNodeResp extends BaseResponse {

  @SerializedName("data")
  private ListSpaceNodeDTO body;

  public ListSpaceNodeDTO getListSpaceNodeDTO() {
    return this.body;
  }

  public void setListSpaceNodeDTO(ListSpaceNodeDTO body) {
    this.body = body;
  }
}
