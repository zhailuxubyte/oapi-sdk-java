// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.larksuite.oapi.service.im.v1.enums.*;
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
public class EventMessage {
    @SerializedName("message_id")
    private String messageId;
    @SerializedName("root_id")
    private String rootId;
    @SerializedName("parent_id")
    private String parentId;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("chat_type")
    private String chatType;
    @SerializedName("message_type")
    private String messageType;
    @SerializedName("content")
    private String content;
    @SerializedName("mentions")
    private MentionEvent[] mentions;
    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getRootId() {
        return this.rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatType() {
        return this.chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MentionEvent[] getMentions() {
        return this.mentions;
    }

    public void setMentions(MentionEvent[] mentions) {
        this.mentions = mentions;
    }


// builder 开始
  public EventMessage(){}

  public EventMessage(Builder builder){
      this.messageId = builder.messageId;
      this.rootId = builder.rootId;
      this.parentId = builder.parentId;
      this.createTime = builder.createTime;
      this.chatId = builder.chatId;
      this.chatType = builder.chatType;
      this.messageType = builder.messageType;
      this.content = builder.content;
      this.mentions = builder.mentions;
  }

    public static class Builder {
        private String messageId;
        private String rootId;
        private String parentId;
        private Long createTime;
        private String chatId;
        private String chatType;
        private String messageType;
        private String content;
        private MentionEvent[] mentions;
        public Builder messageId(String messageId) {
             this.messageId = messageId;
             return this;
        }
    
        public Builder rootId(String rootId) {
             this.rootId = rootId;
             return this;
        }
    
        public Builder parentId(String parentId) {
             this.parentId = parentId;
             return this;
        }
    
        public Builder createTime(Long createTime) {
             this.createTime = createTime;
             return this;
        }
    
        public Builder chatId(String chatId) {
             this.chatId = chatId;
             return this;
        }
    
        public Builder chatType(String chatType) {
             this.chatType = chatType;
             return this;
        }
    
        public Builder messageType(String messageType) {
             this.messageType = messageType;
             return this;
        }
    
        public Builder content(String content) {
             this.content = content;
             return this;
        }
    
        public Builder mentions(MentionEvent[] mentions) {
             this.mentions = mentions;
             return this;
        }
    
    
    public EventMessage build(){
        return new EventMessage(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
