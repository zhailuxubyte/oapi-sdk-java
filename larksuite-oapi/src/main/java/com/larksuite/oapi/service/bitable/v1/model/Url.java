// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;
import com.larksuite.oapi.service.bitable.v1.enums.*;
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
public class Url {
    @SerializedName("text")
    private String text;
    @SerializedName("link")
    private String link;
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }


// builder 开始
  public Url(){}

  public Url(Builder builder){
      this.text = builder.text;
      this.link = builder.link;
  }

    public static class Builder {
        private String text;
        private String link;
        public Builder text(String text) {
             this.text = text;
             return this;
        }
    
        public Builder link(String link) {
             this.link = link;
             return this;
        }
    
    
    public Url build(){
        return new Url(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
