// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateUserMailboxAliasDTO {
    @SerializedName("user_mailbox_alias")
    private EmailAlias userMailboxAlias;

    public EmailAlias getUserMailboxAlias() {
        return this.userMailboxAlias;
    }

    public void setUserMailboxAlias(EmailAlias userMailboxAlias) {
        this.userMailboxAlias = userMailboxAlias;
    }

}
