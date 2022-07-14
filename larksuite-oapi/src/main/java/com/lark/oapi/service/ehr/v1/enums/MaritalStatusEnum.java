// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.ehr.v1.enums;

// 生成枚举值
public enum MaritalStatusEnum {
  SINGLE(1),
  MARRIED(2),
  DIVORCED(3),
  OTHER(4),
  ;
  private Integer value;

  MaritalStatusEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}