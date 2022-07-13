// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;
import com.larksuite.oapi.service.search.v2.enums.*;
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
public class ItemContent {
    @SerializedName("format")
    private String format;
    @SerializedName("content_data")
    private String contentData;
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getContentData() {
        return this.contentData;
    }

    public void setContentData(String contentData) {
        this.contentData = contentData;
    }


// builder 开始
  public ItemContent(){}

  public ItemContent(Builder builder){
      this.format = builder.format;
      this.contentData = builder.contentData;
  }

    public static class Builder {
        private String format;
        private String contentData;
        public Builder format(String format) {
             this.format = format;
             return this;
        }
        public Builder format(com.larksuite.oapi.service.search.v2.enums.FormatEnum format) {
             this.format = format.getValue();
             return this;
        }
    
        public Builder contentData(String contentData) {
             this.contentData = contentData;
             return this;
        }
    
    
    public ItemContent build(){
        return new ItemContent(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
