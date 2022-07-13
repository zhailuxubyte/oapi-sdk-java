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
public class SearchCalendarEventReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

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

    @Path
    @SerializedName("calendar_id")
    private String calendarId;
    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    @Body
    private SearchCalendarEventReqBody body;

    public SearchCalendarEventReqBody getSearchCalendarEventReqBody() {
        return this.body;
    }

    public void setSearchCalendarEventReqBody(SearchCalendarEventReqBody body) {
        this.body = body;
    }

// builder 开始
  public SearchCalendarEventReq(){}

  public SearchCalendarEventReq(Builder builder){
       this.userIdType = builder.userIdType;
       this.pageToken = builder.pageToken;
       this.pageSize = builder.pageSize;
       this.calendarId = builder.calendarId;
        this.body = builder.body;
  }

    public static class Builder {
        private String userIdType;
        private String pageToken;
        private Integer pageSize;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.calendar.v4.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
        private String calendarId;
          public Builder calendarId(String calendarId) {
               this.calendarId = calendarId;
               return this;
          }
    
        private SearchCalendarEventReqBody body;
    
        public SearchCalendarEventReqBody getSearchCalendarEventReqBody() {
            return this.body;
        }
        public Builder searchCalendarEventReqBody(SearchCalendarEventReqBody body) {
             this.body = body;
             return this;
        }
    public SearchCalendarEventReq build(){
        return new SearchCalendarEventReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
