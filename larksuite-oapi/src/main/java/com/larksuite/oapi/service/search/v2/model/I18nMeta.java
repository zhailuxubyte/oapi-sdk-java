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
public class I18nMeta {
    @SerializedName("zh_cn")
    private String zhCn;
    @SerializedName("en_us")
    private String enUs;
    @SerializedName("ja_jp")
    private String jaJp;
    public String getZhCn() {
        return this.zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public String getEnUs() {
        return this.enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public String getJaJp() {
        return this.jaJp;
    }

    public void setJaJp(String jaJp) {
        this.jaJp = jaJp;
    }


// builder 开始
  public I18nMeta(){}

  public I18nMeta(Builder builder){
      this.zhCn = builder.zhCn;
      this.enUs = builder.enUs;
      this.jaJp = builder.jaJp;
  }

    public static class Builder {
        private String zhCn;
        private String enUs;
        private String jaJp;
        public Builder zhCn(String zhCn) {
             this.zhCn = zhCn;
             return this;
        }
    
        public Builder enUs(String enUs) {
             this.enUs = enUs;
             return this;
        }
    
        public Builder jaJp(String jaJp) {
             this.jaJp = jaJp;
             return this;
        }
    
    
    public I18nMeta build(){
        return new I18nMeta(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
