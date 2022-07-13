// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;
import com.larksuite.oapi.service.mail.v1.enums.*;
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
public class ListPublicMailboxAliasReq {
    @Path
    @SerializedName("public_mailbox_id")
    private String publicMailboxId;
    public String getPublicMailboxId() {
        return this.publicMailboxId;
    }

    public void setPublicMailboxId(String publicMailboxId) {
        this.publicMailboxId = publicMailboxId;
    }


// builder 开始
  public ListPublicMailboxAliasReq(){}

  public ListPublicMailboxAliasReq(Builder builder){
       this.publicMailboxId = builder.publicMailboxId;
  }

    public static class Builder {
    
        private String publicMailboxId;
          public Builder publicMailboxId(String publicMailboxId) {
               this.publicMailboxId = publicMailboxId;
               return this;
          }
    
    public ListPublicMailboxAliasReq build(){
        return new ListPublicMailboxAliasReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
