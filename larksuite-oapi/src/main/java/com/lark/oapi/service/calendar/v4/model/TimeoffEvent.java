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
public class TimeoffEvent {
    @SerializedName("timeoff_event_id")
    private String timeoffEventId;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("end_time")
    private String endTime;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    public String getTimeoffEventId() {
        return this.timeoffEventId;
    }

    public void setTimeoffEventId(String timeoffEventId) {
        this.timeoffEventId = timeoffEventId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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


// builder 开始
  public TimeoffEvent(){}

  public TimeoffEvent(Builder builder){
      this.timeoffEventId = builder.timeoffEventId;
      this.userId = builder.userId;
      this.timezone = builder.timezone;
      this.startTime = builder.startTime;
      this.endTime = builder.endTime;
      this.title = builder.title;
      this.description = builder.description;
  }

    public static class Builder {
        private String timeoffEventId;
        private String userId;
        private String timezone;
        private String startTime;
        private String endTime;
        private String title;
        private String description;
        public Builder timeoffEventId(String timeoffEventId) {
             this.timeoffEventId = timeoffEventId;
             return this;
        }
    
        public Builder userId(String userId) {
             this.userId = userId;
             return this;
        }
    
        public Builder timezone(String timezone) {
             this.timezone = timezone;
             return this;
        }
    
        public Builder startTime(String startTime) {
             this.startTime = startTime;
             return this;
        }
    
        public Builder endTime(String endTime) {
             this.endTime = endTime;
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
    
    
    public TimeoffEvent build(){
        return new TimeoffEvent(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
