// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.enums;

// 生成枚举值
public enum MentionObjTypeEnum {
    DOC(1),
    SHEET(3),
    BITABLE(8),
    MINDNOTE(11),
    FILE(12),
    SLIDE(15),
    WIKI(16),
    DOCX(22),
    ;
    private Integer value;

    MentionObjTypeEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}