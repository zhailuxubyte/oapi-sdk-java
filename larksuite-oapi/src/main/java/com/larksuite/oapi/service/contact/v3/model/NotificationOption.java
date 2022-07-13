// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.larksuite.oapi.service.contact.v3.enums.*;
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
public class NotificationOption {
    @SerializedName("channels")
    private String[] channels;
    @SerializedName("language")
    private String language;
    public String[] getChannels() {
        return this.channels;
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


// builder 开始
  public NotificationOption(){}

  public NotificationOption(Builder builder){
      this.channels = builder.channels;
      this.language = builder.language;
  }

    public static class Builder {
        private String[] channels;
        private String language;
        public Builder channels(String[] channels) {
             this.channels = channels;
             return this;
        }
    
        public Builder language(String language) {
             this.language = language;
             return this;
        }
        public Builder language(com.larksuite.oapi.service.contact.v3.enums.LanguageEnum language) {
             this.language = language.getValue();
             return this;
        }
    
    
    public NotificationOption build(){
        return new NotificationOption(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
