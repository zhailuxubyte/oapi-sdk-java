// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.larksuite.oapi.service.contact.v3.enums.*;
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
public class DeleteGroupReq {
    @Path
    @SerializedName("group_id")
    private String groupId;
    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


// builder 开始
  public DeleteGroupReq(){}

  public DeleteGroupReq(Builder builder){
       this.groupId = builder.groupId;
  }

    public static class Builder {
    
        private String groupId;
          public Builder groupId(String groupId) {
               this.groupId = groupId;
               return this;
          }
    
    public DeleteGroupReq build(){
        return new DeleteGroupReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
