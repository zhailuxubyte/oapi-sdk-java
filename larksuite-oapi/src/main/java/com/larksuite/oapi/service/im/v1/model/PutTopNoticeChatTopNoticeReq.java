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
public class PutTopNoticeChatTopNoticeReq {
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
    private PutTopNoticeChatTopNoticeReqBody body;

    public PutTopNoticeChatTopNoticeReqBody getPutTopNoticeChatTopNoticeReqBody() {
        return this.body;
    }

    public void setPutTopNoticeChatTopNoticeReqBody(PutTopNoticeChatTopNoticeReqBody body) {
        this.body = body;
    }

// builder 开始
  public PutTopNoticeChatTopNoticeReq(){}

  public PutTopNoticeChatTopNoticeReq(Builder builder){
       this.chatId = builder.chatId;
        this.body = builder.body;
  }

    public static class Builder {
    
        private String chatId;
          public Builder chatId(String chatId) {
               this.chatId = chatId;
               return this;
          }
    
        private PutTopNoticeChatTopNoticeReqBody body;
    
        public PutTopNoticeChatTopNoticeReqBody getPutTopNoticeChatTopNoticeReqBody() {
            return this.body;
        }
        public Builder putTopNoticeChatTopNoticeReqBody(PutTopNoticeChatTopNoticeReqBody body) {
             this.body = body;
             return this;
        }
    public PutTopNoticeChatTopNoticeReq build(){
        return new PutTopNoticeChatTopNoticeReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
