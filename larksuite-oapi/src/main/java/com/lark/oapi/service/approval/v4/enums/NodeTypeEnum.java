// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.enums;

// 生成枚举值
public enum NodeTypeEnum {
  AND("AND"),
  OR("OR"),
  SEQUENTAL("SEQUENTIAL"),
  ;
  private String value;

  NodeTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}