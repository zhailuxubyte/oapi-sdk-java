// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class MemberBelongGroupResp extends BaseResponse {

  @SerializedName("data")
  private MemberBelongGroupDTO body;

  public MemberBelongGroupDTO getMemberBelongGroupDTO() {
    return this.body;
  }

  public void setMemberBelongGroupDTO(MemberBelongGroupDTO body) {
    this.body = body;
  }
}
