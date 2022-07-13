// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.larksuite.oapi.service.application.v6.enums.*;
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
public class AppScopeI18nInfo {
    @SerializedName("i18n_key")
    private String i18nKey;
    @SerializedName("description")
    private String description;
    public String getI18nKey() {
        return this.i18nKey;
    }

    public void setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


// builder 开始
  public AppScopeI18nInfo(){}

  public AppScopeI18nInfo(Builder builder){
      this.i18nKey = builder.i18nKey;
      this.description = builder.description;
  }

    public static class Builder {
        private String i18nKey;
        private String description;
        public Builder i18nKey(String i18nKey) {
             this.i18nKey = i18nKey;
             return this;
        }
        public Builder i18nKey(com.larksuite.oapi.service.application.v6.enums.I18nKeyEnum i18nKey) {
             this.i18nKey = i18nKey.getValue();
             return this;
        }
    
        public Builder description(String description) {
             this.description = description;
             return this;
        }
    
    
    public AppScopeI18nInfo build(){
        return new AppScopeI18nInfo(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
