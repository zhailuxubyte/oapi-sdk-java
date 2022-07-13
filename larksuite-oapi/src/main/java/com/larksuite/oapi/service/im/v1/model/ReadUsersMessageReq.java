// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.larksuite.oapi.service.im.v1.enums.*;
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
public class ReadUsersMessageReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    @Path
    @SerializedName("message_id")
    private String messageId;
    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }


// builder 开始
  public ReadUsersMessageReq(){}

  public ReadUsersMessageReq(Builder builder){
       this.userIdType = builder.userIdType;
       this.pageSize = builder.pageSize;
       this.pageToken = builder.pageToken;
       this.messageId = builder.messageId;
  }

    public static class Builder {
        private String userIdType;
        private Integer pageSize;
        private String pageToken;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.im.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
        private String messageId;
          public Builder messageId(String messageId) {
               this.messageId = messageId;
               return this;
          }
    
    public ReadUsersMessageReq build(){
        return new ReadUsersMessageReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
