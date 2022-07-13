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
public class ChatTabContent {
    @SerializedName("url")
    private String url;
    @SerializedName("doc")
    private String doc;
    @SerializedName("meeting_minute")
    private String meetingMinute;
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDoc() {
        return this.doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getMeetingMinute() {
        return this.meetingMinute;
    }

    public void setMeetingMinute(String meetingMinute) {
        this.meetingMinute = meetingMinute;
    }


// builder 开始
  public ChatTabContent(){}

  public ChatTabContent(Builder builder){
      this.url = builder.url;
      this.doc = builder.doc;
      this.meetingMinute = builder.meetingMinute;
  }

    public static class Builder {
        private String url;
        private String doc;
        private String meetingMinute;
        public Builder url(String url) {
             this.url = url;
             return this;
        }
    
        public Builder doc(String doc) {
             this.doc = doc;
             return this;
        }
    
        public Builder meetingMinute(String meetingMinute) {
             this.meetingMinute = meetingMinute;
             return this;
        }
    
    
    public ChatTabContent build(){
        return new ChatTabContent(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
