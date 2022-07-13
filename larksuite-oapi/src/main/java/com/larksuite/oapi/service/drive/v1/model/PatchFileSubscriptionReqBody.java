// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.larksuite.oapi.service.drive.v1.enums.*;
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
public class PatchFileSubscriptionReqBody {
    @SerializedName("is_subscribe")
    private Boolean isSubscribe;
    @SerializedName("file_type")
    private String fileType;
    public Boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    public void setIsSubscribe(Boolean isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


// builder 开始
  public PatchFileSubscriptionReqBody(){}

  public PatchFileSubscriptionReqBody(Builder builder){
      this.isSubscribe = builder.isSubscribe;
      this.fileType = builder.fileType;
  }

    public static class Builder {
        private Boolean isSubscribe;
        private String fileType;
        public Builder isSubscribe(Boolean isSubscribe) {
             this.isSubscribe = isSubscribe;
             return this;
        }
    
        public Builder fileType(String fileType) {
             this.fileType = fileType;
             return this;
        }
        public Builder fileType(com.larksuite.oapi.service.drive.v1.enums.FileTypeEnum fileType) {
             this.fileType = fileType.getValue();
             return this;
        }
    
    
    public PatchFileSubscriptionReqBody build(){
        return new PatchFileSubscriptionReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
