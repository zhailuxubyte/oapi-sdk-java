// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateChatMembersResp extends BaseResponse {

  @SerializedName("data")
  private CreateChatMembersDTO body;

  public CreateChatMembersDTO getCreateChatMembersDTO() {
    return this.body;
  }

  public void setCreateChatMembersDTO(CreateChatMembersDTO body) {
    this.body = body;
  }
}
