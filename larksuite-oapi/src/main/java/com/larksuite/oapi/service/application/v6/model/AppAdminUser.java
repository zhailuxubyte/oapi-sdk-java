// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.larksuite.oapi.service.application.v6.enums.*;
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
public class AppAdminUser {
    @SerializedName("admin_type")
    private String[] adminType;
    @SerializedName("user_id")
    private String userId;
    public String[] getAdminType() {
        return this.adminType;
    }

    public void setAdminType(String[] adminType) {
        this.adminType = adminType;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


// builder 开始
  public AppAdminUser(){}

  public AppAdminUser(Builder builder){
      this.adminType = builder.adminType;
      this.userId = builder.userId;
  }

    public static class Builder {
        private String[] adminType;
        private String userId;
        public Builder adminType(String[] adminType) {
             this.adminType = adminType;
             return this;
        }
    
        public Builder userId(String userId) {
             this.userId = userId;
             return this;
        }
    
    
    public AppAdminUser build(){
        return new AppAdminUser(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
