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
public class GetMessageResourceReq {
    @Query
    @SerializedName("type")
    private String type;
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Path
    @SerializedName("message_id")
    private String messageId;
    @Path
    @SerializedName("file_key")
    private String fileKey;
    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFileKey() {
        return this.fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }


// builder 开始
  public GetMessageResourceReq(){}

  public GetMessageResourceReq(Builder builder){
       this.type = builder.type;
       this.messageId = builder.messageId;
       this.fileKey = builder.fileKey;
  }

    public static class Builder {
        private String type;
    
           public Builder type(String type) {
                this.type = type;
                return this;
           }
    
        private String messageId;
        private String fileKey;
          public Builder messageId(String messageId) {
               this.messageId = messageId;
               return this;
          }
    
          public Builder fileKey(String fileKey) {
               this.fileKey = fileKey;
               return this;
          }
    
    public GetMessageResourceReq build(){
        return new GetMessageResourceReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
