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
public class UpdateTabsChatTabReqBody {
    @SerializedName("chat_tabs")
    private ChatTab[] chatTabs;
    public ChatTab[] getChatTabs() {
        return this.chatTabs;
    }

    public void setChatTabs(ChatTab[] chatTabs) {
        this.chatTabs = chatTabs;
    }


// builder 开始
  public UpdateTabsChatTabReqBody(){}

  public UpdateTabsChatTabReqBody(Builder builder){
      this.chatTabs = builder.chatTabs;
  }

    public static class Builder {
        private ChatTab[] chatTabs;
        public Builder chatTabs(ChatTab[] chatTabs) {
             this.chatTabs = chatTabs;
             return this;
        }
    
    
    public UpdateTabsChatTabReqBody build(){
        return new UpdateTabsChatTabReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
