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
public class GetEntityReq {
    @Query
    @SerializedName("provider")
    private String provider;
    @Query
    @SerializedName("outer_id")
    private String outerId;
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    @Path
    @SerializedName("entity_id")
    private String entityId;
    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }


// builder 开始
  public GetEntityReq(){}

  public GetEntityReq(Builder builder){
       this.provider = builder.provider;
       this.outerId = builder.outerId;
       this.userIdType = builder.userIdType;
       this.entityId = builder.entityId;
  }

    public static class Builder {
        private String provider;
        private String outerId;
        private String userIdType;
    
           public Builder provider(String provider) {
                this.provider = provider;
                return this;
           }
    
           public Builder outerId(String outerId) {
                this.outerId = outerId;
                return this;
           }
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.baike.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private String entityId;
          public Builder entityId(String entityId) {
               this.entityId = entityId;
               return this;
          }
    
    public GetEntityReq build(){
        return new GetEntityReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
