// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.enums;

// 生成枚举值
public enum ModifierIdTypeEnum {
  USER_ID("user_id"),
  UNION_ID("union_id"),
  OPEN_ID("open_id"),
  APP_ID("app_id"),
  ;
  private String value;

  ModifierIdTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}