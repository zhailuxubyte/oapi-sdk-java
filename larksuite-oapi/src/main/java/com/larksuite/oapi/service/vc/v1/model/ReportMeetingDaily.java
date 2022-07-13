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
public class ReportMeetingDaily {
    @SerializedName("date")
    private Long date;
    @SerializedName("meeting_count")
    private Long meetingCount;
    @SerializedName("meeting_duration")
    private Long meetingDuration;
    @SerializedName("participant_count")
    private Long participantCount;
    public Long getDate() {
        return this.date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getMeetingCount() {
        return this.meetingCount;
    }

    public void setMeetingCount(Long meetingCount) {
        this.meetingCount = meetingCount;
    }

    public Long getMeetingDuration() {
        return this.meetingDuration;
    }

    public void setMeetingDuration(Long meetingDuration) {
        this.meetingDuration = meetingDuration;
    }

    public Long getParticipantCount() {
        return this.participantCount;
    }

    public void setParticipantCount(Long participantCount) {
        this.participantCount = participantCount;
    }


// builder 开始
  public ReportMeetingDaily(){}

  public ReportMeetingDaily(Builder builder){
      this.date = builder.date;
      this.meetingCount = builder.meetingCount;
      this.meetingDuration = builder.meetingDuration;
      this.participantCount = builder.participantCount;
  }

    public static class Builder {
        private Long date;
        private Long meetingCount;
        private Long meetingDuration;
        private Long participantCount;
        public Builder date(Long date) {
             this.date = date;
             return this;
        }
    
        public Builder meetingCount(Long meetingCount) {
             this.meetingCount = meetingCount;
             return this;
        }
    
        public Builder meetingDuration(Long meetingDuration) {
             this.meetingDuration = meetingDuration;
             return this;
        }
    
        public Builder participantCount(Long participantCount) {
             this.participantCount = participantCount;
             return this;
        }
    
    
    public ReportMeetingDaily build(){
        return new ReportMeetingDaily(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
