// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.larksuite.oapi.service.vc.v1.enums.*;
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
public class Reserve {
    @SerializedName("id")
    private Long id;
    @SerializedName("meeting_no")
    private String meetingNo;
    @SerializedName("url")
    private String url;
    @SerializedName("app_link")
    private String appLink;
    @SerializedName("live_link")
    private String liveLink;
    @SerializedName("end_time")
    private Long endTime;
    @SerializedName("expire_status")
    private Integer expireStatus;
    @SerializedName("reserve_user_id")
    private String reserveUserId;
    @SerializedName("meeting_settings")
    private ReserveMeetingSetting meetingSettings;
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeetingNo() {
        return this.meetingNo;
    }

    public void setMeetingNo(String meetingNo) {
        this.meetingNo = meetingNo;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppLink() {
        return this.appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public String getLiveLink() {
        return this.liveLink;
    }

    public void setLiveLink(String liveLink) {
        this.liveLink = liveLink;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getExpireStatus() {
        return this.expireStatus;
    }

    public void setExpireStatus(Integer expireStatus) {
        this.expireStatus = expireStatus;
    }

    public String getReserveUserId() {
        return this.reserveUserId;
    }

    public void setReserveUserId(String reserveUserId) {
        this.reserveUserId = reserveUserId;
    }

    public ReserveMeetingSetting getMeetingSettings() {
        return this.meetingSettings;
    }

    public void setMeetingSettings(ReserveMeetingSetting meetingSettings) {
        this.meetingSettings = meetingSettings;
    }


// builder 开始
  public Reserve(){}

  public Reserve(Builder builder){
      this.id = builder.id;
      this.meetingNo = builder.meetingNo;
      this.url = builder.url;
      this.appLink = builder.appLink;
      this.liveLink = builder.liveLink;
      this.endTime = builder.endTime;
      this.expireStatus = builder.expireStatus;
      this.reserveUserId = builder.reserveUserId;
      this.meetingSettings = builder.meetingSettings;
  }

    public static class Builder {
        private Long id;
        private String meetingNo;
        private String url;
        private String appLink;
        private String liveLink;
        private Long endTime;
        private Integer expireStatus;
        private String reserveUserId;
        private ReserveMeetingSetting meetingSettings;
        public Builder id(Long id) {
             this.id = id;
             return this;
        }
    
        public Builder meetingNo(String meetingNo) {
             this.meetingNo = meetingNo;
             return this;
        }
    
        public Builder url(String url) {
             this.url = url;
             return this;
        }
    
        public Builder appLink(String appLink) {
             this.appLink = appLink;
             return this;
        }
    
        public Builder liveLink(String liveLink) {
             this.liveLink = liveLink;
             return this;
        }
    
        public Builder endTime(Long endTime) {
             this.endTime = endTime;
             return this;
        }
    
        public Builder expireStatus(Integer expireStatus) {
             this.expireStatus = expireStatus;
             return this;
        }
        public Builder expireStatus(com.larksuite.oapi.service.vc.v1.enums.ExpireStatusEnum expireStatus) {
             this.expireStatus = expireStatus.getValue();
             return this;
        }
    
        public Builder reserveUserId(String reserveUserId) {
             this.reserveUserId = reserveUserId;
             return this;
        }
    
        public Builder meetingSettings(ReserveMeetingSetting meetingSettings) {
             this.meetingSettings = meetingSettings;
             return this;
        }
    
    
    public Reserve build(){
        return new Reserve(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
