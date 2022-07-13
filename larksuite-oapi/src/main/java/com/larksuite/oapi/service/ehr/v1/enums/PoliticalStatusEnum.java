// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.ehr.v1.enums;

// 生成枚举值
public enum PoliticalStatusEnum {
     CPC(1),
     CPWDP(2),
     RCCK(3),
     CAPD(4),
     CDL(5),
     CDNCA(6),
     CZGD(7),
     JSS(8),
     CYL(9),
     MEMBER_OF_OTHER_PARTY(10),
     DP(11),
     MASSES(12),
  ;
   private Integer value;
    PoliticalStatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return this.value;
    }
}