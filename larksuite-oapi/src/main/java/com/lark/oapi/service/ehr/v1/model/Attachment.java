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

package com.lark.oapi.service.ehr.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.ehr.v1.enums.*;
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
public class Attachment {
    @SerializedName("id")
    private String id;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("name")
    private String name;
    @SerializedName("size")
    private Long size;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }


// builder 开始
  public Attachment(){}

  public Attachment(Builder builder){
      this.id = builder.id;
      this.mimeType = builder.mimeType;
      this.name = builder.name;
      this.size = builder.size;
  }

    public static class Builder {
        private String id;
        private String mimeType;
        private String name;
        private Long size;
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
        public Builder mimeType(String mimeType) {
             this.mimeType = mimeType;
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
        public Builder size(Long size) {
             this.size = size;
             return this;
        }
    
    
    public Attachment build(){
        return new Attachment(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
