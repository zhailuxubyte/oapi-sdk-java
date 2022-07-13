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
public class StartMeetingRecordingReqBody {
    @SerializedName("timezone")
    private Integer timezone;
    public Integer getTimezone() {
        return this.timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }


// builder 开始
  public StartMeetingRecordingReqBody(){}

  public StartMeetingRecordingReqBody(Builder builder){
      this.timezone = builder.timezone;
  }

    public static class Builder {
        private Integer timezone;
        public Builder timezone(Integer timezone) {
             this.timezone = timezone;
             return this;
        }
    
    
    public StartMeetingRecordingReqBody build(){
        return new StartMeetingRecordingReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
