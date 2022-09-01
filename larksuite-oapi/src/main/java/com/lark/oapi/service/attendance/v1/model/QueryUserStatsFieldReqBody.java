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
public class QueryUserStatsFieldReqBody {
    @SerializedName("locale")
    private String locale;
    @SerializedName("stats_type")
    private String statsType;
    @SerializedName("start_date")
    private Integer startDate;
    @SerializedName("end_date")
    private Integer endDate;
    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getStatsType() {
        return this.statsType;
    }

    public void setStatsType(String statsType) {
        this.statsType = statsType;
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }


// builder 开始
  public QueryUserStatsFieldReqBody(){}

  public QueryUserStatsFieldReqBody(Builder builder){
      this.locale = builder.locale;
      this.statsType = builder.statsType;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
  }

    public static class Builder {
        private String locale;
        private String statsType;
        private Integer startDate;
        private Integer endDate;
        public Builder locale(String locale) {
             this.locale = locale;
             return this;
        }
        public Builder locale(com.lark.oapi.service.attendance.v1.enums.LocaleEnum locale) {
             this.locale = locale.getValue();
             return this;
        }
    
        public Builder statsType(String statsType) {
             this.statsType = statsType;
             return this;
        }
        public Builder statsType(com.lark.oapi.service.attendance.v1.enums.StatsTypeEnum statsType) {
             this.statsType = statsType.getValue();
             return this;
        }
    
        public Builder startDate(Integer startDate) {
             this.startDate = startDate;
             return this;
        }
    
        public Builder endDate(Integer endDate) {
             this.endDate = endDate;
             return this;
        }
    
    
    public QueryUserStatsFieldReqBody build(){
        return new QueryUserStatsFieldReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
