// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.enums;

// 生成枚举值
public enum StatusEnum {
  ACTIVE("ACTIVE"),
  INACTIVE("INACTIVE"),
  DELETED("DELETED"),
  UNKNOWN("UNKNOWN"),
  ;
  private String value;

  StatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}