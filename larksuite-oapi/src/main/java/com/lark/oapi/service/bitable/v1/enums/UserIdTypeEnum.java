// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.enums;

// 生成枚举值
public enum UserIdTypeEnum {
  USER_ID("user_id"),
  UNION_ID("union_id"),
  OPEN_ID("open_id"),
  ;
  private String value;

  UserIdTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}