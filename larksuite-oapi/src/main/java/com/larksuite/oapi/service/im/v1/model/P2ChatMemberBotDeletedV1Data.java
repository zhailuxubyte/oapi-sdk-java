// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2ChatMemberBotDeletedV1Data {
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("operator_id")
    private UserId operatorId;
    @SerializedName("external")
    private Boolean external;
    @SerializedName("operator_tenant_key")
    private String operatorTenantKey;

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public UserId getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(UserId operatorId) {
        this.operatorId = operatorId;
    }

    public Boolean getExternal() {
        return this.external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getOperatorTenantKey() {
        return this.operatorTenantKey;
    }

    public void setOperatorTenantKey(String operatorTenantKey) {
        this.operatorTenantKey = operatorTenantKey;
    }

}
