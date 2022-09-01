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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;
public class ListCalendarReq {
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("sync_token")
    private String syncToken;
    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getSyncToken() {
        return this.syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }


// builder 开始
  public ListCalendarReq(){}

  public ListCalendarReq(Builder builder){
       this.pageSize = builder.pageSize;
       this.pageToken = builder.pageToken;
       this.syncToken = builder.syncToken;
  }

    public static class Builder {
        private Integer pageSize;
        private String pageToken;
        private String syncToken;
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
           public Builder syncToken(String syncToken) {
                this.syncToken = syncToken;
                return this;
           }
    
    public ListCalendarReq build(){
        return new ListCalendarReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
