// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.ehr.v1.enums;

// 生成枚举值
public enum IdTypeEnum {
  ID_NUMBER(1),
  MAINLAND_TRAVEL_PERMIT_HKMACAO(2),
  MAINLAND_TRAVEL_PERMIT_TW(3),
  PASSPORT(4),
  OTHER(5),
  ;
  private Integer value;

  IdTypeEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}