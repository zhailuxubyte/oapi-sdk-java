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

package com.lark.oapi.service.bitable.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.bitable.v1.enums.*;
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
public class AppTableFormPatchedField {
    @SerializedName("pre_field_id")
    private String preFieldId;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("required")
    private Boolean required;
    @SerializedName("visible")
    private Boolean visible;
    public String getPreFieldId() {
        return this.preFieldId;
    }

    public void setPreFieldId(String preFieldId) {
        this.preFieldId = preFieldId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }


// builder 开始
  public AppTableFormPatchedField(){}

  public AppTableFormPatchedField(Builder builder){
      this.preFieldId = builder.preFieldId;
      this.title = builder.title;
      this.description = builder.description;
      this.required = builder.required;
      this.visible = builder.visible;
  }

    public static class Builder {
        private String preFieldId;
        private String title;
        private String description;
        private Boolean required;
        private Boolean visible;
        public Builder preFieldId(String preFieldId) {
             this.preFieldId = preFieldId;
             return this;
        }
    
        public Builder title(String title) {
             this.title = title;
             return this;
        }
    
        public Builder description(String description) {
             this.description = description;
             return this;
        }
    
        public Builder required(Boolean required) {
             this.required = required;
             return this;
        }
    
        public Builder visible(Boolean visible) {
             this.visible = visible;
             return this;
        }
    
    
    public AppTableFormPatchedField build(){
        return new AppTableFormPatchedField(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
