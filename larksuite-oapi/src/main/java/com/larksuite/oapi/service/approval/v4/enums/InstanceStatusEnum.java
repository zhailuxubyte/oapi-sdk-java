// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.approval.v4.enums;

// 生成枚举值
public enum InstanceStatusEnum {
    PENDING("PENDING"),
    RECALL("RECALL"),
    REJECT("REJECT"),
    DELETED("DELETED"),
    APPROVERD("APPROVED"),
    ;
    private String value;

    InstanceStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}