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
public class Vchat {
    @SerializedName("vc_type")
    private String vcType;
    @SerializedName("icon_type")
    private String iconType;
    @SerializedName("description")
    private String description;
    @SerializedName("meeting_url")
    private String meetingUrl;
    public String getVcType() {
        return this.vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType;
    }

    public String getIconType() {
        return this.iconType;
    }

    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMeetingUrl() {
        return this.meetingUrl;
    }

    public void setMeetingUrl(String meetingUrl) {
        this.meetingUrl = meetingUrl;
    }


// builder 开始
  public Vchat(){}

  public Vchat(Builder builder){
      this.vcType = builder.vcType;
      this.iconType = builder.iconType;
      this.description = builder.description;
      this.meetingUrl = builder.meetingUrl;
  }

    public static class Builder {
        private String vcType;
        private String iconType;
        private String description;
        private String meetingUrl;
        public Builder vcType(String vcType) {
             this.vcType = vcType;
             return this;
        }
        public Builder vcType(com.larksuite.oapi.service.calendar.v4.enums.VcTypeEnum vcType) {
             this.vcType = vcType.getValue();
             return this;
        }
    
        public Builder iconType(String iconType) {
             this.iconType = iconType;
             return this;
        }
        public Builder iconType(com.larksuite.oapi.service.calendar.v4.enums.IconTypeEnum iconType) {
             this.iconType = iconType.getValue();
             return this;
        }
    
        public Builder description(String description) {
             this.description = description;
             return this;
        }
    
        public Builder meetingUrl(String meetingUrl) {
             this.meetingUrl = meetingUrl;
             return this;
        }
    
    
    public Vchat build(){
        return new Vchat(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
