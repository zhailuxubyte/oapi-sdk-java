// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.enums;

// 生成枚举值
public enum EventVisibilityEnum {
     DEFAULT("default"),
     PUBLIC("public"),
     PRIVATE("private"),
  ;
   private String value;
    EventVisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
}