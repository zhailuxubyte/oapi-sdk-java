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
public class AclScope {
    @SerializedName("type")
    private String type;
    @SerializedName("user_id")
    private String userId;
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


// builder 开始
  public AclScope(){}

  public AclScope(Builder builder){
      this.type = builder.type;
      this.userId = builder.userId;
  }

    public static class Builder {
        private String type;
        private String userId;
        public Builder type(String type) {
             this.type = type;
             return this;
        }
        public Builder type(com.larksuite.oapi.service.calendar.v4.enums.AclScopeTypeEnum type) {
             this.type = type.getValue();
             return this;
        }
    
        public Builder userId(String userId) {
             this.userId = userId;
             return this;
        }
    
    
    public AclScope build(){
        return new AclScope(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
