// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.enums;

// 生成枚举值
public enum CategoryEnum {
  WORKDAY(1),
  WEEKEND(2),
  HOLIDAY(3),
  ;
  private Integer value;

  CategoryEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}