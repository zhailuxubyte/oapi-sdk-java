// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.ehr.v1.enums;

// 生成枚举值
public enum DepartureReasonEnum {
    HEALTH_OR_FAMILY_ISSUES(1),
    LACK_OF_CAREER_DEVELOPMENT(2),
    UNSATISFACTORY_COMPENSATION_AND_BENEFITS(3),
    EXCESSIVE_WORKLOAD(4),
    NON_RENEWAL_OF_EMPLOYMENT_CONTRACT(5),
    OTHER(6),
    UNSATISFACTORY_PERFORMANCE(7),
    CORPORATE_RESTRUCTURING_AND_POSITION_OPTIMIZATION(8),
    VIOLATION_OF_COMPANY_REGULATIONS(9),
    VIOLATION_OF_LAWS_AND_DISCIPLINE(10),
    OTHER_OF_INVOLUNTARY(11),
    ;
    private Integer value;

    DepartureReasonEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}