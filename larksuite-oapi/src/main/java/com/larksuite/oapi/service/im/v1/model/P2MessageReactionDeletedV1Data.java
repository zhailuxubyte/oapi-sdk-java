// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2MessageReactionDeletedV1Data {
    @SerializedName("message_id")
    private String messageId;
    @SerializedName("reaction_type")
    private Emoji reactionType;
    @SerializedName("operator_type")
    private String operatorType;
    @SerializedName("user_id")
    private UserId userId;
    @SerializedName("app_id")
    private String appId;
    @SerializedName("action_time")
    private String actionTime;

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Emoji getReactionType() {
        return this.reactionType;
    }

    public void setReactionType(Emoji reactionType) {
        this.reactionType = reactionType;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

}
