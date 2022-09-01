// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.admin.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.admin.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;
public class ApiAuditDrawerInfo {
    @SerializedName("info_key")
    private String infoKey;
    @SerializedName("info_val")
    private String infoVal;
    @SerializedName("key_i18n_key")
    private String keyI18nKey;
    @SerializedName("val_type")
    private String valType;
    @SerializedName("val_i18n_key")
    private String valI18nKey;
    public String getInfoKey() {
        return this.infoKey;
    }

    public void setInfoKey(String infoKey) {
        this.infoKey = infoKey;
    }

    public String getInfoVal() {
        return this.infoVal;
    }

    public void setInfoVal(String infoVal) {
        this.infoVal = infoVal;
    }

    public String getKeyI18nKey() {
        return this.keyI18nKey;
    }

    public void setKeyI18nKey(String keyI18nKey) {
        this.keyI18nKey = keyI18nKey;
    }

    public String getValType() {
        return this.valType;
    }

    public void setValType(String valType) {
        this.valType = valType;
    }

    public String getValI18nKey() {
        return this.valI18nKey;
    }

    public void setValI18nKey(String valI18nKey) {
        this.valI18nKey = valI18nKey;
    }


// builder 开始
  public ApiAuditDrawerInfo(){}

  public ApiAuditDrawerInfo(Builder builder){
      this.infoKey = builder.infoKey;
      this.infoVal = builder.infoVal;
      this.keyI18nKey = builder.keyI18nKey;
      this.valType = builder.valType;
      this.valI18nKey = builder.valI18nKey;
  }

    public static class Builder {
        private String infoKey;
        private String infoVal;
        private String keyI18nKey;
        private String valType;
        private String valI18nKey;
        public Builder infoKey(String infoKey) {
             this.infoKey = infoKey;
             return this;
        }
    
        public Builder infoVal(String infoVal) {
             this.infoVal = infoVal;
             return this;
        }
    
        public Builder keyI18nKey(String keyI18nKey) {
             this.keyI18nKey = keyI18nKey;
             return this;
        }
    
        public Builder valType(String valType) {
             this.valType = valType;
             return this;
        }
    
        public Builder valI18nKey(String valI18nKey) {
             this.valI18nKey = valI18nKey;
             return this;
        }
    
    
    public ApiAuditDrawerInfo build(){
        return new ApiAuditDrawerInfo(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
