// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.larksuite.oapi.service.vc.v1.enums.*;
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
public class UpdateReserveReq {
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
    @SerializedName("reserve_id")
    private Long reserveId;
    public Long getReserveId() {
        return this.reserveId;
    }

    public void setReserveId(Long reserveId) {
        this.reserveId = reserveId;
    }

    @Body
    private UpdateReserveReqBody body;

    public UpdateReserveReqBody getUpdateReserveReqBody() {
        return this.body;
    }

    public void setUpdateReserveReqBody(UpdateReserveReqBody body) {
        this.body = body;
    }

// builder 开始
  public UpdateReserveReq(){}

  public UpdateReserveReq(Builder builder){
       this.userIdType = builder.userIdType;
       this.reserveId = builder.reserveId;
        this.body = builder.body;
  }

    public static class Builder {
        private String userIdType;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.vc.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private Long reserveId;
          public Builder reserveId(Long reserveId) {
               this.reserveId = reserveId;
               return this;
          }
    
        private UpdateReserveReqBody body;
    
        public UpdateReserveReqBody getUpdateReserveReqBody() {
            return this.body;
        }
        public Builder updateReserveReqBody(UpdateReserveReqBody body) {
             this.body = body;
             return this;
        }
    public UpdateReserveReq build(){
        return new UpdateReserveReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
