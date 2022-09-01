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

package com.lark.oapi.service.application.v6.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.application.v6.enums.*;
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
public class AppCustomCategoryI18nInfo {
    @SerializedName("i18n_key")
    private String i18nKey;
    @SerializedName("name")
    private String name;
    public String getI18nKey() {
        return this.i18nKey;
    }

    public void setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


// builder 开始
  public AppCustomCategoryI18nInfo(){}

  public AppCustomCategoryI18nInfo(Builder builder){
      this.i18nKey = builder.i18nKey;
      this.name = builder.name;
  }

    public static class Builder {
        private String i18nKey;
        private String name;
        public Builder i18nKey(String i18nKey) {
             this.i18nKey = i18nKey;
             return this;
        }
        public Builder i18nKey(com.lark.oapi.service.application.v6.enums.I18nKeyEnum i18nKey) {
             this.i18nKey = i18nKey.getValue();
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
    
    public AppCustomCategoryI18nInfo build(){
        return new AppCustomCategoryI18nInfo(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
