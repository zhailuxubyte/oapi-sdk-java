// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.acs.v1.model;
import com.larksuite.oapi.service.acs.v1.enums.*;
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
public class PatchUserReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    @Path
    @SerializedName("user_id")
    private String userId;
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Body
    private User body;

    public User getUser() {
        return this.body;
    }

    public void setUser(User body) {
        this.body = body;
    }

// builder 开始
  public PatchUserReq(){}

  public PatchUserReq(Builder builder){
       this.userIdType = builder.userIdType;
       this.userId = builder.userId;
        this.body = builder.body;
  }

    public static class Builder {
        private String userIdType;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.acs.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private String userId;
          public Builder userId(String userId) {
               this.userId = userId;
               return this;
          }
    
        private User body;
    
        public User getUser() {
            return this.body;
        }
        public Builder user(User body) {
             this.body = body;
             return this;
        }
    public PatchUserReq build(){
        return new PatchUserReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
