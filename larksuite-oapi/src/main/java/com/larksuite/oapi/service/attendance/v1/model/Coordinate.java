// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;
import com.larksuite.oapi.service.attendance.v1.enums.*;
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
public class Coordinate {
    @SerializedName("longitude")
    private Double longitude;
    @SerializedName("latitude")
    private Double latitude;
    @SerializedName("accuracy")
    private Double accuracy;
    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }


// builder 开始
  public Coordinate(){}

  public Coordinate(Builder builder){
      this.longitude = builder.longitude;
      this.latitude = builder.latitude;
      this.accuracy = builder.accuracy;
  }

    public static class Builder {
        private Double longitude;
        private Double latitude;
        private Double accuracy;
        public Builder longitude(Double longitude) {
             this.longitude = longitude;
             return this;
        }
    
        public Builder latitude(Double latitude) {
             this.latitude = latitude;
             return this;
        }
    
        public Builder accuracy(Double accuracy) {
             this.accuracy = accuracy;
             return this;
        }
    
    
    public Coordinate build(){
        return new Coordinate(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
