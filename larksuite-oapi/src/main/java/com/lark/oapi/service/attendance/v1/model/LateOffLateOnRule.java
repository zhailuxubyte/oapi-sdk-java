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
public class LateOffLateOnRule {
    @SerializedName("late_off_minutes")
    private Integer lateOffMinutes;
    @SerializedName("late_on_minutes")
    private Integer lateOnMinutes;
    public Integer getLateOffMinutes() {
        return this.lateOffMinutes;
    }

    public void setLateOffMinutes(Integer lateOffMinutes) {
        this.lateOffMinutes = lateOffMinutes;
    }

    public Integer getLateOnMinutes() {
        return this.lateOnMinutes;
    }

    public void setLateOnMinutes(Integer lateOnMinutes) {
        this.lateOnMinutes = lateOnMinutes;
    }


// builder 开始
  public LateOffLateOnRule(){}

  public LateOffLateOnRule(Builder builder){
      this.lateOffMinutes = builder.lateOffMinutes;
      this.lateOnMinutes = builder.lateOnMinutes;
  }

    public static class Builder {
        private Integer lateOffMinutes;
        private Integer lateOnMinutes;
        public Builder lateOffMinutes(Integer lateOffMinutes) {
             this.lateOffMinutes = lateOffMinutes;
             return this;
        }
    
        public Builder lateOnMinutes(Integer lateOnMinutes) {
             this.lateOnMinutes = lateOnMinutes;
             return this;
        }
    
    
    public LateOffLateOnRule build(){
        return new LateOffLateOnRule(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
