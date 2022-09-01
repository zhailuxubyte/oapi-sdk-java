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

package com.lark.oapi.service.helpdesk.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.helpdesk.v1.enums.*;
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
public class UserCustomizedField {
    @SerializedName("user_customized_field_id")
    private String userCustomizedFieldId;
    @SerializedName("id")
    private String id;
    @SerializedName("helpdesk_id")
    private String helpdeskId;
    @SerializedName("key_name")
    private String keyName;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("position")
    private String position;
    @SerializedName("field_type")
    private String fieldType;
    @SerializedName("description")
    private String description;
    @SerializedName("visible")
    private Boolean visible;
    @SerializedName("editable")
    private Boolean editable;
    @SerializedName("required")
    private Boolean required;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    public String getUserCustomizedFieldId() {
        return this.userCustomizedFieldId;
    }

    public void setUserCustomizedFieldId(String userCustomizedFieldId) {
        this.userCustomizedFieldId = userCustomizedFieldId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHelpdeskId() {
        return this.helpdeskId;
    }

    public void setHelpdeskId(String helpdeskId) {
        this.helpdeskId = helpdeskId;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getEditable() {
        return this.editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


// builder 开始
  public UserCustomizedField(){}

  public UserCustomizedField(Builder builder){
      this.userCustomizedFieldId = builder.userCustomizedFieldId;
      this.id = builder.id;
      this.helpdeskId = builder.helpdeskId;
      this.keyName = builder.keyName;
      this.displayName = builder.displayName;
      this.position = builder.position;
      this.fieldType = builder.fieldType;
      this.description = builder.description;
      this.visible = builder.visible;
      this.editable = builder.editable;
      this.required = builder.required;
      this.createdAt = builder.createdAt;
      this.updatedAt = builder.updatedAt;
  }

    public static class Builder {
        private String userCustomizedFieldId;
        private String id;
        private String helpdeskId;
        private String keyName;
        private String displayName;
        private String position;
        private String fieldType;
        private String description;
        private Boolean visible;
        private Boolean editable;
        private Boolean required;
        private String createdAt;
        private String updatedAt;
        public Builder userCustomizedFieldId(String userCustomizedFieldId) {
             this.userCustomizedFieldId = userCustomizedFieldId;
             return this;
        }
    
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
        public Builder helpdeskId(String helpdeskId) {
             this.helpdeskId = helpdeskId;
             return this;
        }
    
        public Builder keyName(String keyName) {
             this.keyName = keyName;
             return this;
        }
    
        public Builder displayName(String displayName) {
             this.displayName = displayName;
             return this;
        }
    
        public Builder position(String position) {
             this.position = position;
             return this;
        }
    
        public Builder fieldType(String fieldType) {
             this.fieldType = fieldType;
             return this;
        }
    
        public Builder description(String description) {
             this.description = description;
             return this;
        }
    
        public Builder visible(Boolean visible) {
             this.visible = visible;
             return this;
        }
    
        public Builder editable(Boolean editable) {
             this.editable = editable;
             return this;
        }
    
        public Builder required(Boolean required) {
             this.required = required;
             return this;
        }
    
        public Builder createdAt(String createdAt) {
             this.createdAt = createdAt;
             return this;
        }
    
        public Builder updatedAt(String updatedAt) {
             this.updatedAt = updatedAt;
             return this;
        }
    
    
    public UserCustomizedField build(){
        return new UserCustomizedField(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
