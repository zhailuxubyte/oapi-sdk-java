// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.enums;

// 生成枚举值
public enum UnitEnum {
     DAY(1),
     HOUR(2),
     HALFDAY(3),
     HALFHOUR(4),
  ;
   private Integer value;
    UnitEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return this.value;
    }
}