// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.application.v6.enums;

// 生成枚举值
public enum GrantStatusEnum {
  GRANTED(1),
  UNDELEGATED(2),
  ;
  private Integer value;

  GrantStatusEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}