// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateSpaceMemberResp extends BaseResponse {

  @SerializedName("data")
  private CreateSpaceMemberDTO body;

  public CreateSpaceMemberDTO getCreateSpaceMemberDTO() {
    return this.body;
  }

  public void setCreateSpaceMemberDTO(CreateSpaceMemberDTO body) {
    this.body = body;
  }
}
