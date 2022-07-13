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
public class ListCalendarEventAttendeeChatMemberReq {
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
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

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    @Path
    @SerializedName("calendar_id")
    private String calendarId;
    @Path
    @SerializedName("event_id")
    private String eventId;
    @Path
    @SerializedName("attendee_id")
    private String attendeeId;
    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getAttendeeId() {
        return this.attendeeId;
    }

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }


// builder 开始
  public ListCalendarEventAttendeeChatMemberReq(){}

  public ListCalendarEventAttendeeChatMemberReq(Builder builder){
       this.pageToken = builder.pageToken;
       this.pageSize = builder.pageSize;
       this.userIdType = builder.userIdType;
       this.calendarId = builder.calendarId;
       this.eventId = builder.eventId;
       this.attendeeId = builder.attendeeId;
  }

    public static class Builder {
        private String pageToken;
        private Integer pageSize;
        private String userIdType;
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.calendar.v4.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private String calendarId;
        private String eventId;
        private String attendeeId;
          public Builder calendarId(String calendarId) {
               this.calendarId = calendarId;
               return this;
          }
    
          public Builder eventId(String eventId) {
               this.eventId = eventId;
               return this;
          }
    
          public Builder attendeeId(String attendeeId) {
               this.attendeeId = attendeeId;
               return this;
          }
    
    public ListCalendarEventAttendeeChatMemberReq build(){
        return new ListCalendarEventAttendeeChatMemberReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
