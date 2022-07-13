// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;
import com.larksuite.oapi.service.calendar.v4.enums.*;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class SearchCalendarReq {
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Body
    private SearchCalendarReqBody body;

    public SearchCalendarReqBody getSearchCalendarReqBody() {
        return this.body;
    }

    public void setSearchCalendarReqBody(SearchCalendarReqBody body) {
        this.body = body;
    }

// builder 开始
  public SearchCalendarReq(){}

  public SearchCalendarReq(Builder builder){
       this.pageToken = builder.pageToken;
       this.pageSize = builder.pageSize;
        this.body = builder.body;
  }

    public static class Builder {
        private String pageToken;
        private Integer pageSize;
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
        private SearchCalendarReqBody body;
    
        public SearchCalendarReqBody getSearchCalendarReqBody() {
            return this.body;
        }
        public Builder searchCalendarReqBody(SearchCalendarReqBody body) {
             this.body = body;
             return this;
        }
    public SearchCalendarReq build(){
        return new SearchCalendarReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
