// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.enums;

// 生成枚举值
public enum StatusEnum {
     UNKNOWN(0),
     COMPLETED(1),
     COMPLETING(2),
     FAILURE(3),
  ;
   private Integer value;
    StatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return this.value;
    }
}