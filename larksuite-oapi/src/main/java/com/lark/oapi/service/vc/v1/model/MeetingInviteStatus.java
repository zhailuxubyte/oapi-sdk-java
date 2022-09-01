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

package com.lark.oapi.service.vc.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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
public class MeetingInviteStatus {
    @SerializedName("id")
    private String id;
    @SerializedName("user_type")
    private Integer userType;
    @SerializedName("status")
    private Integer status;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


// builder 开始
  public MeetingInviteStatus(){}

  public MeetingInviteStatus(Builder builder){
      this.id = builder.id;
      this.userType = builder.userType;
      this.status = builder.status;
  }

    public static class Builder {
        private String id;
        private Integer userType;
        private Integer status;
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
        public Builder userType(Integer userType) {
             this.userType = userType;
             return this;
        }
        public Builder userType(com.lark.oapi.service.vc.v1.enums.UserTypeEnum userType) {
             this.userType = userType.getValue();
             return this;
        }
    
        public Builder status(Integer status) {
             this.status = status;
             return this;
        }
        public Builder status(com.lark.oapi.service.vc.v1.enums.InviteStatusEnum status) {
             this.status = status.getValue();
             return this;
        }
    
    
    public MeetingInviteStatus build(){
        return new MeetingInviteStatus(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
