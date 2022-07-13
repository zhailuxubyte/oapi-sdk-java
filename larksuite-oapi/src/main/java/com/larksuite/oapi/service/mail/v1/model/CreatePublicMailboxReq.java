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
public class CreatePublicMailboxReq {
    @Body
    private PublicMailbox body;

    public PublicMailbox getPublicMailbox() {
        return this.body;
    }

    public void setPublicMailbox(PublicMailbox body) {
        this.body = body;
    }

// builder 开始
  public CreatePublicMailboxReq(){}

  public CreatePublicMailboxReq(Builder builder){
        this.body = builder.body;
  }

    public static class Builder {
    
        private PublicMailbox body;
    
        public PublicMailbox getPublicMailbox() {
            return this.body;
        }
        public Builder publicMailbox(PublicMailbox body) {
             this.body = body;
             return this;
        }
    public CreatePublicMailboxReq build(){
        return new CreatePublicMailboxReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
