// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.enums;

// 生成枚举值
public enum ApprovalStatusEnum {
     TODO(0),
     REJECTED(1),
     APPROVED(2),
     CANCELED(3),
     REVERTED(4),
  ;
   private Integer value;
    ApprovalStatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return this.value;
    }
}