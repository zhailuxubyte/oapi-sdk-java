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
public class CreatePermissionMemberReq {
    @Query
    @SerializedName("type")
    private String type;
    @Query
    @SerializedName("need_notification")
    private Boolean needNotification;
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getNeedNotification() {
        return this.needNotification;
    }

    public void setNeedNotification(Boolean needNotification) {
        this.needNotification = needNotification;
    }

    @Path
    @SerializedName("token")
    private String token;
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Body
    private Member body;

    public Member getMember() {
        return this.body;
    }

    public void setMember(Member body) {
        this.body = body;
    }

// builder 开始
  public CreatePermissionMemberReq(){}

  public CreatePermissionMemberReq(Builder builder){
       this.type = builder.type;
       this.needNotification = builder.needNotification;
       this.token = builder.token;
        this.body = builder.body;
  }

    public static class Builder {
        private String type;
        private Boolean needNotification;
    
           public Builder type(String type) {
                this.type = type;
                return this;
           }
          public Builder type(com.larksuite.oapi.service.drive.v1.enums.TokenTypeV2Enum type) {
               this.type = type.getValue();
               return this;
          }
    
           public Builder needNotification(Boolean needNotification) {
                this.needNotification = needNotification;
                return this;
           }
    
        private String token;
          public Builder token(String token) {
               this.token = token;
               return this;
          }
    
        private Member body;
    
        public Member getMember() {
            return this.body;
        }
        public Builder member(Member body) {
             this.body = body;
             return this;
        }
    public CreatePermissionMemberReq build(){
        return new CreatePermissionMemberReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
