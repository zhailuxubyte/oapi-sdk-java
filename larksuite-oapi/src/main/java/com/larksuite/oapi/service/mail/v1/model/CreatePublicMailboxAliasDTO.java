// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class CreatePublicMailboxAliasDTO {
    @SerializedName("public_mailbox_alias")
    private EmailAlias publicMailboxAlias;
    public EmailAlias getPublicMailboxAlias() {
        return this.publicMailboxAlias;
    }

    public void setPublicMailboxAlias(EmailAlias publicMailboxAlias) {
        this.publicMailboxAlias = publicMailboxAlias;
    }

}
