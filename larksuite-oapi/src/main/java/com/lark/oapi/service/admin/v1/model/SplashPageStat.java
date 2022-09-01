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

package com.lark.oapi.service.admin.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.admin.v1.enums.*;
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
public class SplashPageStat {
    @SerializedName("date")
    private String date;
    @SerializedName("splash_id")
    private String splashId;
    @SerializedName("impression_count")
    private Integer impressionCount;
    @SerializedName("click_count")
    private Integer clickCount;
    @SerializedName("skip_count")
    private Integer skipCount;
    @SerializedName("impression_count_accumulate")
    private Integer impressionCountAccumulate;
    @SerializedName("click_count_accumulate")
    private Integer clickCountAccumulate;
    @SerializedName("skip_count_accumulate")
    private Integer skipCountAccumulate;
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSplashId() {
        return this.splashId;
    }

    public void setSplashId(String splashId) {
        this.splashId = splashId;
    }

    public Integer getImpressionCount() {
        return this.impressionCount;
    }

    public void setImpressionCount(Integer impressionCount) {
        this.impressionCount = impressionCount;
    }

    public Integer getClickCount() {
        return this.clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getSkipCount() {
        return this.skipCount;
    }

    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    public Integer getImpressionCountAccumulate() {
        return this.impressionCountAccumulate;
    }

    public void setImpressionCountAccumulate(Integer impressionCountAccumulate) {
        this.impressionCountAccumulate = impressionCountAccumulate;
    }

    public Integer getClickCountAccumulate() {
        return this.clickCountAccumulate;
    }

    public void setClickCountAccumulate(Integer clickCountAccumulate) {
        this.clickCountAccumulate = clickCountAccumulate;
    }

    public Integer getSkipCountAccumulate() {
        return this.skipCountAccumulate;
    }

    public void setSkipCountAccumulate(Integer skipCountAccumulate) {
        this.skipCountAccumulate = skipCountAccumulate;
    }


// builder 开始
  public SplashPageStat(){}

  public SplashPageStat(Builder builder){
      this.date = builder.date;
      this.splashId = builder.splashId;
      this.impressionCount = builder.impressionCount;
      this.clickCount = builder.clickCount;
      this.skipCount = builder.skipCount;
      this.impressionCountAccumulate = builder.impressionCountAccumulate;
      this.clickCountAccumulate = builder.clickCountAccumulate;
      this.skipCountAccumulate = builder.skipCountAccumulate;
  }

    public static class Builder {
        private String date;
        private String splashId;
        private Integer impressionCount;
        private Integer clickCount;
        private Integer skipCount;
        private Integer impressionCountAccumulate;
        private Integer clickCountAccumulate;
        private Integer skipCountAccumulate;
        public Builder date(String date) {
             this.date = date;
             return this;
        }
    
        public Builder splashId(String splashId) {
             this.splashId = splashId;
             return this;
        }
    
        public Builder impressionCount(Integer impressionCount) {
             this.impressionCount = impressionCount;
             return this;
        }
    
        public Builder clickCount(Integer clickCount) {
             this.clickCount = clickCount;
             return this;
        }
    
        public Builder skipCount(Integer skipCount) {
             this.skipCount = skipCount;
             return this;
        }
    
        public Builder impressionCountAccumulate(Integer impressionCountAccumulate) {
             this.impressionCountAccumulate = impressionCountAccumulate;
             return this;
        }
    
        public Builder clickCountAccumulate(Integer clickCountAccumulate) {
             this.clickCountAccumulate = clickCountAccumulate;
             return this;
        }
    
        public Builder skipCountAccumulate(Integer skipCountAccumulate) {
             this.skipCountAccumulate = skipCountAccumulate;
             return this;
        }
    
    
    public SplashPageStat build(){
        return new SplashPageStat(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
