// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.enums;

// 生成枚举值
public enum ReviewResultEnum {
     REVIEWING(1),
     PASS(2),
     FAILED(3),
  ;
   private Integer value;
    ReviewResultEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return this.value;
    }
}