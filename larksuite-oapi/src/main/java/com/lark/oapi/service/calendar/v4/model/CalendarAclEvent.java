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

package com.lark.oapi.service.calendar.v4.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.calendar.v4.enums.*;
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
public class CalendarAclEvent {
    @SerializedName("acl_id")
    private String aclId;
    @SerializedName("role")
    private String role;
    @SerializedName("scope")
    private AclScopeEvent scope;
    @SerializedName("user_id_list")
    private UserId[] userIdList;
    public String getAclId() {
        return this.aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AclScopeEvent getScope() {
        return this.scope;
    }

    public void setScope(AclScopeEvent scope) {
        this.scope = scope;
    }

    public UserId[] getUserIdList() {
        return this.userIdList;
    }

    public void setUserIdList(UserId[] userIdList) {
        this.userIdList = userIdList;
    }


// builder 开始
  public CalendarAclEvent(){}

  public CalendarAclEvent(Builder builder){
      this.aclId = builder.aclId;
      this.role = builder.role;
      this.scope = builder.scope;
      this.userIdList = builder.userIdList;
  }

    public static class Builder {
        private String aclId;
        private String role;
        private AclScopeEvent scope;
        private UserId[] userIdList;
        public Builder aclId(String aclId) {
             this.aclId = aclId;
             return this;
        }
    
        public Builder role(String role) {
             this.role = role;
             return this;
        }
        public Builder role(com.lark.oapi.service.calendar.v4.enums.CalendarAccessRoleEnum role) {
             this.role = role.getValue();
             return this;
        }
    
        public Builder scope(AclScopeEvent scope) {
             this.scope = scope;
             return this;
        }
    
        public Builder userIdList(UserId[] userIdList) {
             this.userIdList = userIdList;
             return this;
        }
    
    
    public CalendarAclEvent build(){
        return new CalendarAclEvent(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
