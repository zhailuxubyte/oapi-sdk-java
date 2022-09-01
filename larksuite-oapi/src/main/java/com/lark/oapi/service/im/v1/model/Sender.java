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

package com.lark.oapi.service.im.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
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
public class Sender {
    @SerializedName("id")
    private String id;
    @SerializedName("id_type")
    private String idType;
    @SerializedName("sender_type")
    private String senderType;
    @SerializedName("tenant_key")
    private String tenantKey;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdType() {
        return this.idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getSenderType() {
        return this.senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }


// builder 开始
  public Sender(){}

  public Sender(Builder builder){
      this.id = builder.id;
      this.idType = builder.idType;
      this.senderType = builder.senderType;
      this.tenantKey = builder.tenantKey;
  }

    public static class Builder {
        private String id;
        private String idType;
        private String senderType;
        private String tenantKey;
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
        public Builder idType(String idType) {
             this.idType = idType;
             return this;
        }
    
        public Builder senderType(String senderType) {
             this.senderType = senderType;
             return this;
        }
    
        public Builder tenantKey(String tenantKey) {
             this.tenantKey = tenantKey;
             return this;
        }
    
    
    public Sender build(){
        return new Sender(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
