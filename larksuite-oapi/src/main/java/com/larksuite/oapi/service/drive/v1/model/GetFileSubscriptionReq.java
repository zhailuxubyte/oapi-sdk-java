// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.larksuite.oapi.service.drive.v1.enums.*;
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
public class GetFileSubscriptionReq {
    @Path
    @SerializedName("file_token")
    private String fileToken;
    @Path
    @SerializedName("subscription_id")
    private String subscriptionId;
    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Body
    private FileSubscription body;

    public FileSubscription getFileSubscription() {
        return this.body;
    }

    public void setFileSubscription(FileSubscription body) {
        this.body = body;
    }

// builder 开始
  public GetFileSubscriptionReq(){}

  public GetFileSubscriptionReq(Builder builder){
       this.fileToken = builder.fileToken;
       this.subscriptionId = builder.subscriptionId;
        this.body = builder.body;
  }

    public static class Builder {
    
        private String fileToken;
        private String subscriptionId;
          public Builder fileToken(String fileToken) {
               this.fileToken = fileToken;
               return this;
          }
    
          public Builder subscriptionId(String subscriptionId) {
               this.subscriptionId = subscriptionId;
               return this;
          }
    
        private FileSubscription body;
    
        public FileSubscription getFileSubscription() {
            return this.body;
        }
        public Builder fileSubscription(FileSubscription body) {
             this.body = body;
             return this;
        }
    public GetFileSubscriptionReq build(){
        return new GetFileSubscriptionReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
