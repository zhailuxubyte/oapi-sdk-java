// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.enums;

// 生成枚举值
public enum MeetingStatusEnum {
  CALLING(1),
  ON_THE_CALL(2),
  END(3),
  ;
  private Integer value;

  MeetingStatusEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}