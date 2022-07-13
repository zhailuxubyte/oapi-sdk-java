// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.larksuite.oapi.service.im.v1.enums.*;
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
public class CreateMessageReactionReq {
    @Path
    @SerializedName("message_id")
    private String messageId;
    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Body
    private CreateMessageReactionReqBody body;

    public CreateMessageReactionReqBody getCreateMessageReactionReqBody() {
        return this.body;
    }

    public void setCreateMessageReactionReqBody(CreateMessageReactionReqBody body) {
        this.body = body;
    }

// builder 开始
  public CreateMessageReactionReq(){}

  public CreateMessageReactionReq(Builder builder){
       this.messageId = builder.messageId;
        this.body = builder.body;
  }

    public static class Builder {
    
        private String messageId;
          public Builder messageId(String messageId) {
               this.messageId = messageId;
               return this;
          }
    
        private CreateMessageReactionReqBody body;
    
        public CreateMessageReactionReqBody getCreateMessageReactionReqBody() {
            return this.body;
        }
        public Builder createMessageReactionReqBody(CreateMessageReactionReqBody body) {
             this.body = body;
             return this;
        }
    public CreateMessageReactionReq build(){
        return new CreateMessageReactionReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
