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
public class AttendeeChatMember {
    @SerializedName("rsvp_status")
    private String rsvpStatus;
    @SerializedName("is_optional")
    private Boolean isOptional;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("is_organizer")
    private Boolean isOrganizer;
    @SerializedName("is_external")
    private Boolean isExternal;
    public String getRsvpStatus() {
        return this.rsvpStatus;
    }

    public void setRsvpStatus(String rsvpStatus) {
        this.rsvpStatus = rsvpStatus;
    }

    public Boolean getIsOptional() {
        return this.isOptional;
    }

    public void setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getIsOrganizer() {
        return this.isOrganizer;
    }

    public void setIsOrganizer(Boolean isOrganizer) {
        this.isOrganizer = isOrganizer;
    }

    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }


// builder 开始
  public AttendeeChatMember(){}

  public AttendeeChatMember(Builder builder){
      this.rsvpStatus = builder.rsvpStatus;
      this.isOptional = builder.isOptional;
      this.displayName = builder.displayName;
      this.isOrganizer = builder.isOrganizer;
      this.isExternal = builder.isExternal;
  }

    public static class Builder {
        private String rsvpStatus;
        private Boolean isOptional;
        private String displayName;
        private Boolean isOrganizer;
        private Boolean isExternal;
        public Builder rsvpStatus(String rsvpStatus) {
             this.rsvpStatus = rsvpStatus;
             return this;
        }
        public Builder rsvpStatus(com.lark.oapi.service.calendar.v4.enums.RsvpStatusEnum rsvpStatus) {
             this.rsvpStatus = rsvpStatus.getValue();
             return this;
        }
    
        public Builder isOptional(Boolean isOptional) {
             this.isOptional = isOptional;
             return this;
        }
    
        public Builder displayName(String displayName) {
             this.displayName = displayName;
             return this;
        }
    
        public Builder isOrganizer(Boolean isOrganizer) {
             this.isOrganizer = isOrganizer;
             return this;
        }
    
        public Builder isExternal(Boolean isExternal) {
             this.isExternal = isExternal;
             return this;
        }
    
    
    public AttendeeChatMember build(){
        return new AttendeeChatMember(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
