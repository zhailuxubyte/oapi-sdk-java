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
public class CreateCalendarAclReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
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
    private CalendarAcl body;

    public CalendarAcl getCalendarAcl() {
        return this.body;
    }

    public void setCalendarAcl(CalendarAcl body) {
        this.body = body;
    }

// builder 开始
  public CreateCalendarAclReq(){}

  public CreateCalendarAclReq(Builder builder){
       this.userIdType = builder.userIdType;
       this.calendarId = builder.calendarId;
        this.body = builder.body;
  }

    public static class Builder {
        private String userIdType;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.calendar.v4.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private String calendarId;
          public Builder calendarId(String calendarId) {
               this.calendarId = calendarId;
               return this;
          }
    
        private CalendarAcl body;
    
        public CalendarAcl getCalendarAcl() {
            return this.body;
        }
        public Builder calendarAcl(CalendarAcl body) {
             this.body = body;
             return this;
        }
    public CreateCalendarAclReq build(){
        return new CreateCalendarAclReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
