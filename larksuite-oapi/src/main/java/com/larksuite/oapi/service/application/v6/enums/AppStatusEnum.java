// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.enums;

// 生成枚举值
public enum AppStatusEnum {
     DISABLE(0),
     ENABLE(1),
     NOT_ENABLED(2),
     UNKNOWN(3),
  ;
   private Integer value;
    AppStatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return this.value;
    }
}