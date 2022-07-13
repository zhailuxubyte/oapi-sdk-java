// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.enums;

// 生成枚举值
public enum MemberIdTypeEnum {
    OPENID("open_id"),
    UNIONID("union_id"),
    USERID("user_id"),
    CHATID("chat_id"),
    DEPARTMENTID("department_id"),
    OPENDEPARTMENTID("open_department_id"),
    ;
    private String value;

    MemberIdTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}