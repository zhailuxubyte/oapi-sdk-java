// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.ehr.v1.enums;

// 生成枚举值
public enum CancelOnboardingReasonEnum {
     PERSONAL_REASON(1),
     STAY(2),
     OTHER_OFFER(3),
     OTHER(4),
  ;
   private Integer value;
    CancelOnboardingReasonEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return this.value;
    }
}