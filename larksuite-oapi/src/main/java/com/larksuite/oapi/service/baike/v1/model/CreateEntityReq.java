// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.baike.v1.model;
import com.larksuite.oapi.service.baike.v1.enums.*;
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
public class CreateEntityReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    @Body
    private Entity body;

    public Entity getEntity() {
        return this.body;
    }

    public void setEntity(Entity body) {
        this.body = body;
    }

// builder 开始
  public CreateEntityReq(){}

  public CreateEntityReq(Builder builder){
       this.userIdType = builder.userIdType;
        this.body = builder.body;
  }

    public static class Builder {
        private String userIdType;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.baike.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private Entity body;
    
        public Entity getEntity() {
            return this.body;
        }
        public Builder entity(Entity body) {
             this.body = body;
             return this;
        }
    public CreateEntityReq build(){
        return new CreateEntityReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
