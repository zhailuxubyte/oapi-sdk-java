// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;
import com.larksuite.oapi.service.mail.v1.enums.*;
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
public class Message {
    @SerializedName("raw")
    private String raw;
    public String getRaw() {
        return this.raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }


// builder 开始
  public Message(){}

  public Message(Builder builder){
      this.raw = builder.raw;
  }

    public static class Builder {
        private String raw;
        public Builder raw(String raw) {
             this.raw = raw;
             return this;
        }
    
    
    public Message build(){
        return new Message(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
