// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class P2EmployeeTypeEnumDeactivatedV3Data {

  @SerializedName("old_enum")
  private EmployeeTypeEnum oldEnum;
  @SerializedName("new_enum")
  private EmployeeTypeEnum newEnum;

  public EmployeeTypeEnum getOldEnum() {
    return this.oldEnum;
  }

  public void setOldEnum(EmployeeTypeEnum oldEnum) {
    this.oldEnum = oldEnum;
  }

  public EmployeeTypeEnum getNewEnum() {
    return this.newEnum;
  }

  public void setNewEnum(EmployeeTypeEnum newEnum) {
    this.newEnum = newEnum;
  }

}
