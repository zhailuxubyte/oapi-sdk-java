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
public class Calendar {
    @SerializedName("calendar_id")
    private String calendarId;
    @SerializedName("summary")
    private String summary;
    @SerializedName("description")
    private String description;
    @SerializedName("permissions")
    private String permissions;
    @SerializedName("color")
    private Integer color;
    @SerializedName("type")
    private String type;
    @SerializedName("summary_alias")
    private String summaryAlias;
    @SerializedName("is_deleted")
    private Boolean isDeleted;
    @SerializedName("is_third_party")
    private Boolean isThirdParty;
    @SerializedName("role")
    private String role;
    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Integer getColor() {
        return this.color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSummaryAlias() {
        return this.summaryAlias;
    }

    public void setSummaryAlias(String summaryAlias) {
        this.summaryAlias = summaryAlias;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsThirdParty() {
        return this.isThirdParty;
    }

    public void setIsThirdParty(Boolean isThirdParty) {
        this.isThirdParty = isThirdParty;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }


// builder 开始
  public Calendar(){}

  public Calendar(Builder builder){
      this.calendarId = builder.calendarId;
      this.summary = builder.summary;
      this.description = builder.description;
      this.permissions = builder.permissions;
      this.color = builder.color;
      this.type = builder.type;
      this.summaryAlias = builder.summaryAlias;
      this.isDeleted = builder.isDeleted;
      this.isThirdParty = builder.isThirdParty;
      this.role = builder.role;
  }

    public static class Builder {
        private String calendarId;
        private String summary;
        private String description;
        private String permissions;
        private Integer color;
        private String type;
        private String summaryAlias;
        private Boolean isDeleted;
        private Boolean isThirdParty;
        private String role;
        public Builder calendarId(String calendarId) {
             this.calendarId = calendarId;
             return this;
        }
    
        public Builder summary(String summary) {
             this.summary = summary;
             return this;
        }
    
        public Builder description(String description) {
             this.description = description;
             return this;
        }
    
        public Builder permissions(String permissions) {
             this.permissions = permissions;
             return this;
        }
        public Builder permissions(com.lark.oapi.service.calendar.v4.enums.EventPermissionsEnum permissions) {
             this.permissions = permissions.getValue();
             return this;
        }
    
        public Builder color(Integer color) {
             this.color = color;
             return this;
        }
    
        public Builder type(String type) {
             this.type = type;
             return this;
        }
        public Builder type(com.lark.oapi.service.calendar.v4.enums.CalendarTypeEnum type) {
             this.type = type.getValue();
             return this;
        }
    
        public Builder summaryAlias(String summaryAlias) {
             this.summaryAlias = summaryAlias;
             return this;
        }
    
        public Builder isDeleted(Boolean isDeleted) {
             this.isDeleted = isDeleted;
             return this;
        }
    
        public Builder isThirdParty(Boolean isThirdParty) {
             this.isThirdParty = isThirdParty;
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
    
    
    public Calendar build(){
        return new Calendar(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
