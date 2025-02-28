// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.aweme_ecosystem.v1.model;
import com.google.gson.annotations.SerializedName;

public class EventAwemeUser {
    @SerializedName("user_id")
    private UserId userId;
    @SerializedName("aweme_user_id")
    private String awemeUserId;
    @SerializedName("is_binded")
    private Boolean isBinded;

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getAwemeUserId() {
        return this.awemeUserId;
    }

    public void setAwemeUserId(String awemeUserId) {
        this.awemeUserId = awemeUserId;
    }

    public Boolean getIsBinded() {
        return this.isBinded;
    }

    public void setIsBinded(Boolean isBinded) {
        this.isBinded = isBinded;
    }

}
