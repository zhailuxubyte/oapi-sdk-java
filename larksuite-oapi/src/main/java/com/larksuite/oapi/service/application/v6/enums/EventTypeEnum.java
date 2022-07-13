// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.enums;

// 生成枚举值
public enum EventTypeEnum {
    MESSAGE_SEND("message_send"),
    BOT_NOTIFY_GET_MESSAGE("bot_notify_get_message"),
    MESSAGE_READ("message_read"),
    ;
    private String value;

    EventTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}