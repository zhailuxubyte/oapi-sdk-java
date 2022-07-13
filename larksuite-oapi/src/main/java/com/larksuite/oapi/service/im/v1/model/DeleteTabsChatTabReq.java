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
public class DeleteTabsChatTabReq {
    @Path
    @SerializedName("chat_id")
    private String chatId;
    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    @Body
    private DeleteTabsChatTabReqBody body;

    public DeleteTabsChatTabReqBody getDeleteTabsChatTabReqBody() {
        return this.body;
    }

    public void setDeleteTabsChatTabReqBody(DeleteTabsChatTabReqBody body) {
        this.body = body;
    }

// builder 开始
  public DeleteTabsChatTabReq(){}

  public DeleteTabsChatTabReq(Builder builder){
       this.chatId = builder.chatId;
        this.body = builder.body;
  }

    public static class Builder {
    
        private String chatId;
          public Builder chatId(String chatId) {
               this.chatId = chatId;
               return this;
          }
    
        private DeleteTabsChatTabReqBody body;
    
        public DeleteTabsChatTabReqBody getDeleteTabsChatTabReqBody() {
            return this.body;
        }
        public Builder deleteTabsChatTabReqBody(DeleteTabsChatTabReqBody body) {
             this.body = body;
             return this;
        }
    public DeleteTabsChatTabReq build(){
        return new DeleteTabsChatTabReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
