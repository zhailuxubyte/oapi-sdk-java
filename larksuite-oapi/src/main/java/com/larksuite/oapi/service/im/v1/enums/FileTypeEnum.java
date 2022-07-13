// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.enums;

// 生成枚举值
public enum FileTypeEnum {
    OPUS("opus"),
    MP4("mp4"),
    PDF("pdf"),
    DOC("doc"),
    XLS("xls"),
    PPT("ppt"),
    STREAM("stream"),
    ;
    private String value;

    FileTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}