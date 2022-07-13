// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;
import com.larksuite.oapi.service.calendar.v4.enums.*;
import com.google.gson.annotations.SerializedName;
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
public class CalendarEventAttendeeChatMember {
    @SerializedName("rsvp_status")
    private String rsvpStatus;
    @SerializedName("is_optional")
    private Boolean isOptional;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("open_id")
    private String openId;
    @SerializedName("is_organizer")
    private Boolean isOrganizer;
    @SerializedName("is_external")
    private Boolean isExternal;
    public String getRsvpStatus() {
        return this.rsvpStatus;
    }

    public void setRsvpStatus(String rsvpStatus) {
        this.rsvpStatus = rsvpStatus;
    }

    public Boolean getIsOptional() {
        return this.isOptional;
    }

    public void setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Boolean getIsOrganizer() {
        return this.isOrganizer;
    }

    public void setIsOrganizer(Boolean isOrganizer) {
        this.isOrganizer = isOrganizer;
    }

    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }


// builder 开始
  public CalendarEventAttendeeChatMember(){}

  public CalendarEventAttendeeChatMember(Builder builder){
      this.rsvpStatus = builder.rsvpStatus;
      this.isOptional = builder.isOptional;
      this.displayName = builder.displayName;
      this.openId = builder.openId;
      this.isOrganizer = builder.isOrganizer;
      this.isExternal = builder.isExternal;
  }

    public static class Builder {
        private String rsvpStatus;
        private Boolean isOptional;
        private String displayName;
        private String openId;
        private Boolean isOrganizer;
        private Boolean isExternal;
        public Builder rsvpStatus(String rsvpStatus) {
             this.rsvpStatus = rsvpStatus;
             return this;
        }
        public Builder rsvpStatus(com.larksuite.oapi.service.calendar.v4.enums.RsvpStatusEnum rsvpStatus) {
             this.rsvpStatus = rsvpStatus.getValue();
             return this;
        }
    
        public Builder isOptional(Boolean isOptional) {
             this.isOptional = isOptional;
             return this;
        }
    
        public Builder displayName(String displayName) {
             this.displayName = displayName;
             return this;
        }
    
        public Builder openId(String openId) {
             this.openId = openId;
             return this;
        }
    
        public Builder isOrganizer(Boolean isOrganizer) {
             this.isOrganizer = isOrganizer;
             return this;
        }
    
        public Builder isExternal(Boolean isExternal) {
             this.isExternal = isExternal;
             return this;
        }
    
    
    public CalendarEventAttendeeChatMember build(){
        return new CalendarEventAttendeeChatMember(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
