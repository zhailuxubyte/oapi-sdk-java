// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class GetExchangeBindingDTO {
    @SerializedName("admin_account")
    private String adminAccount;
    @SerializedName("exchange_account")
    private String exchangeAccount;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("status")
    private String status;
    @SerializedName("exchange_binding_id")
    private String exchangeBindingId;

    public String getAdminAccount() {
        return this.adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getExchangeAccount() {
        return this.exchangeAccount;
    }

    public void setExchangeAccount(String exchangeAccount) {
        this.exchangeAccount = exchangeAccount;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExchangeBindingId() {
        return this.exchangeBindingId;
    }

    public void setExchangeBindingId(String exchangeBindingId) {
        this.exchangeBindingId = exchangeBindingId;
    }

}
