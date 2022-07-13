// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.acs.v1.model;
import com.larksuite.oapi.service.acs.v1.enums.*;
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
public class Device {
    @SerializedName("device_id")
    private Long deviceId;
    @SerializedName("device_name")
    private String deviceName;
    @SerializedName("device_sn")
    private String deviceSn;
    public Long getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }


// builder 开始
  public Device(){}

  public Device(Builder builder){
      this.deviceId = builder.deviceId;
      this.deviceName = builder.deviceName;
      this.deviceSn = builder.deviceSn;
  }

    public static class Builder {
        private Long deviceId;
        private String deviceName;
        private String deviceSn;
        public Builder deviceId(Long deviceId) {
             this.deviceId = deviceId;
             return this;
        }
    
        public Builder deviceName(String deviceName) {
             this.deviceName = deviceName;
             return this;
        }
    
        public Builder deviceSn(String deviceSn) {
             this.deviceSn = deviceSn;
             return this;
        }
    
    
    public Device build(){
        return new Device(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
