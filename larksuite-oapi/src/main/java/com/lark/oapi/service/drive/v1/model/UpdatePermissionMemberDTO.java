// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdatePermissionMemberDTO {

  @SerializedName("member")
  private Member member;

  public Member getMember() {
    return this.member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

}
