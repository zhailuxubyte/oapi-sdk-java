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
public class EventTime {
    @SerializedName("time_stamp")
    private String timeStamp;
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }


// builder 开始
  public EventTime(){}

  public EventTime(Builder builder){
      this.timeStamp = builder.timeStamp;
  }

    public static class Builder {
        private String timeStamp;
        public Builder timeStamp(String timeStamp) {
             this.timeStamp = timeStamp;
             return this;
        }
    
    
    public EventTime build(){
        return new EventTime(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
