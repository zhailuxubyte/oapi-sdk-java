// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.attendance.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;
public class Location {
    @SerializedName("location_id")
    private String locationId;
    @SerializedName("location_name")
    private String locationName;
    @SerializedName("location_type")
    private Integer locationType;
    @SerializedName("latitude")
    private Double latitude;
    @SerializedName("longitude")
    private Double longitude;
    @SerializedName("ssid")
    private String ssid;
    @SerializedName("bssid")
    private String bssid;
    @SerializedName("map_type")
    private Integer mapType;
    @SerializedName("address")
    private String address;
    @SerializedName("ip")
    private String ip;
    @SerializedName("feature")
    private String feature;
    @SerializedName("gps_range")
    private Integer gpsRange;
    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Integer getLocationType() {
        return this.locationType;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getBssid() {
        return this.bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public Integer getMapType() {
        return this.mapType;
    }

    public void setMapType(Integer mapType) {
        this.mapType = mapType;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Integer getGpsRange() {
        return this.gpsRange;
    }

    public void setGpsRange(Integer gpsRange) {
        this.gpsRange = gpsRange;
    }


// builder 开始
  public Location(){}

  public Location(Builder builder){
      this.locationId = builder.locationId;
      this.locationName = builder.locationName;
      this.locationType = builder.locationType;
      this.latitude = builder.latitude;
      this.longitude = builder.longitude;
      this.ssid = builder.ssid;
      this.bssid = builder.bssid;
      this.mapType = builder.mapType;
      this.address = builder.address;
      this.ip = builder.ip;
      this.feature = builder.feature;
      this.gpsRange = builder.gpsRange;
  }

    public static class Builder {
        private String locationId;
        private String locationName;
        private Integer locationType;
        private Double latitude;
        private Double longitude;
        private String ssid;
        private String bssid;
        private Integer mapType;
        private String address;
        private String ip;
        private String feature;
        private Integer gpsRange;
        public Builder locationId(String locationId) {
             this.locationId = locationId;
             return this;
        }
    
        public Builder locationName(String locationName) {
             this.locationName = locationName;
             return this;
        }
    
        public Builder locationType(Integer locationType) {
             this.locationType = locationType;
             return this;
        }
    
        public Builder latitude(Double latitude) {
             this.latitude = latitude;
             return this;
        }
    
        public Builder longitude(Double longitude) {
             this.longitude = longitude;
             return this;
        }
    
        public Builder ssid(String ssid) {
             this.ssid = ssid;
             return this;
        }
    
        public Builder bssid(String bssid) {
             this.bssid = bssid;
             return this;
        }
    
        public Builder mapType(Integer mapType) {
             this.mapType = mapType;
             return this;
        }
    
        public Builder address(String address) {
             this.address = address;
             return this;
        }
    
        public Builder ip(String ip) {
             this.ip = ip;
             return this;
        }
    
        public Builder feature(String feature) {
             this.feature = feature;
             return this;
        }
    
        public Builder gpsRange(Integer gpsRange) {
             this.gpsRange = gpsRange;
             return this;
        }
    
    
    public Location build(){
        return new Location(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
