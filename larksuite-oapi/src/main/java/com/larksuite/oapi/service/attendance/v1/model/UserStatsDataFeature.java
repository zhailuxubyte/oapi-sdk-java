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
public class UserStatsDataFeature {
    @SerializedName("key")
    private String key;
    @SerializedName("value")
    private String value;
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }


// builder 开始
  public UserStatsDataFeature(){}

  public UserStatsDataFeature(Builder builder){
      this.key = builder.key;
      this.value = builder.value;
  }

    public static class Builder {
        private String key;
        private String value;
        public Builder key(String key) {
             this.key = key;
             return this;
        }
    
        public Builder value(String value) {
             this.value = value;
             return this;
        }
    
    
    public UserStatsDataFeature build(){
        return new UserStatsDataFeature(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
