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
public class Badge {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("explanation")
    private String explanation;
    @SerializedName("detail_image")
    private String detailImage;
    @SerializedName("show_image")
    private String showImage;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getDetailImage() {
        return this.detailImage;
    }

    public void setDetailImage(String detailImage) {
        this.detailImage = detailImage;
    }

    public String getShowImage() {
        return this.showImage;
    }

    public void setShowImage(String showImage) {
        this.showImage = showImage;
    }


// builder 开始
  public Badge(){}

  public Badge(Builder builder){
      this.id = builder.id;
      this.name = builder.name;
      this.explanation = builder.explanation;
      this.detailImage = builder.detailImage;
      this.showImage = builder.showImage;
  }

    public static class Builder {
        private String id;
        private String name;
        private String explanation;
        private String detailImage;
        private String showImage;
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
        public Builder explanation(String explanation) {
             this.explanation = explanation;
             return this;
        }
    
        public Builder detailImage(String detailImage) {
             this.detailImage = detailImage;
             return this;
        }
    
        public Builder showImage(String showImage) {
             this.showImage = showImage;
             return this;
        }
    
    
    public Badge build(){
        return new Badge(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
