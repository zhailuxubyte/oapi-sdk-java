// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateUserApprovalDTO {

  @SerializedName("user_approval")
  private UserApproval userApproval;

  public UserApproval getUserApproval() {
    return this.userApproval;
  }

  public void setUserApproval(UserApproval userApproval) {
    this.userApproval = userApproval;
  }

}
