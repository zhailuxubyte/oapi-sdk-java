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
public class CreateCalendarEventAttendeeReqBody {
    @SerializedName("attendees")
    private CalendarEventAttendee[] attendees;
    @SerializedName("need_notification")
    private Boolean needNotification;
    @SerializedName("instance_start_time_admin")
    private String instanceStartTimeAdmin;
    @SerializedName("is_enable_admin")
    private Boolean isEnableAdmin;
    public CalendarEventAttendee[] getAttendees() {
        return this.attendees;
    }

    public void setAttendees(CalendarEventAttendee[] attendees) {
        this.attendees = attendees;
    }

    public Boolean getNeedNotification() {
        return this.needNotification;
    }

    public void setNeedNotification(Boolean needNotification) {
        this.needNotification = needNotification;
    }

    public String getInstanceStartTimeAdmin() {
        return this.instanceStartTimeAdmin;
    }

    public void setInstanceStartTimeAdmin(String instanceStartTimeAdmin) {
        this.instanceStartTimeAdmin = instanceStartTimeAdmin;
    }

    public Boolean getIsEnableAdmin() {
        return this.isEnableAdmin;
    }

    public void setIsEnableAdmin(Boolean isEnableAdmin) {
        this.isEnableAdmin = isEnableAdmin;
    }


// builder 开始
  public CreateCalendarEventAttendeeReqBody(){}

  public CreateCalendarEventAttendeeReqBody(Builder builder){
      this.attendees = builder.attendees;
      this.needNotification = builder.needNotification;
      this.instanceStartTimeAdmin = builder.instanceStartTimeAdmin;
      this.isEnableAdmin = builder.isEnableAdmin;
  }

    public static class Builder {
        private CalendarEventAttendee[] attendees;
        private Boolean needNotification;
        private String instanceStartTimeAdmin;
        private Boolean isEnableAdmin;
        public Builder attendees(CalendarEventAttendee[] attendees) {
             this.attendees = attendees;
             return this;
        }
    
        public Builder needNotification(Boolean needNotification) {
             this.needNotification = needNotification;
             return this;
        }
    
        public Builder instanceStartTimeAdmin(String instanceStartTimeAdmin) {
             this.instanceStartTimeAdmin = instanceStartTimeAdmin;
             return this;
        }
    
        public Builder isEnableAdmin(Boolean isEnableAdmin) {
             this.isEnableAdmin = isEnableAdmin;
             return this;
        }
    
    
    public CreateCalendarEventAttendeeReqBody build(){
        return new CreateCalendarEventAttendeeReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
