// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.enums;

// 生成枚举值
public enum DocsTypeEnum {
    DOC("doc"),
    SHEET("sheet"),
    SLIDE("slide"),
    BITABLE("bitable"),
    MINDNOTE("mindnote"),
    FILE("file"),
    ;
    private String value;

    DocsTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}