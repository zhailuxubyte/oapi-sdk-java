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

package com.lark.oapi.service.attendance.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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
public class FreePunchCfg {
    @SerializedName("free_start_time")
    private String freeStartTime;
    @SerializedName("free_end_time")
    private String freeEndTime;
    @SerializedName("punch_day")
    private Integer punchDay;
    @SerializedName("work_day_no_punch_as_lack")
    private Boolean workDayNoPunchAsLack;
    public String getFreeStartTime() {
        return this.freeStartTime;
    }

    public void setFreeStartTime(String freeStartTime) {
        this.freeStartTime = freeStartTime;
    }

    public String getFreeEndTime() {
        return this.freeEndTime;
    }

    public void setFreeEndTime(String freeEndTime) {
        this.freeEndTime = freeEndTime;
    }

    public Integer getPunchDay() {
        return this.punchDay;
    }

    public void setPunchDay(Integer punchDay) {
        this.punchDay = punchDay;
    }

    public Boolean getWorkDayNoPunchAsLack() {
        return this.workDayNoPunchAsLack;
    }

    public void setWorkDayNoPunchAsLack(Boolean workDayNoPunchAsLack) {
        this.workDayNoPunchAsLack = workDayNoPunchAsLack;
    }


// builder 开始
  public FreePunchCfg(){}

  public FreePunchCfg(Builder builder){
      this.freeStartTime = builder.freeStartTime;
      this.freeEndTime = builder.freeEndTime;
      this.punchDay = builder.punchDay;
      this.workDayNoPunchAsLack = builder.workDayNoPunchAsLack;
  }

    public static class Builder {
        private String freeStartTime;
        private String freeEndTime;
        private Integer punchDay;
        private Boolean workDayNoPunchAsLack;
        public Builder freeStartTime(String freeStartTime) {
             this.freeStartTime = freeStartTime;
             return this;
        }
    
        public Builder freeEndTime(String freeEndTime) {
             this.freeEndTime = freeEndTime;
             return this;
        }
    
        public Builder punchDay(Integer punchDay) {
             this.punchDay = punchDay;
             return this;
        }
    
        public Builder workDayNoPunchAsLack(Boolean workDayNoPunchAsLack) {
             this.workDayNoPunchAsLack = workDayNoPunchAsLack;
             return this;
        }
    
    
    public FreePunchCfg build(){
        return new FreePunchCfg(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
