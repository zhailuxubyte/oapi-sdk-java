// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.larksuite.oapi.service.contact.v3.enums.*;
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
public class BatchAddGroupMemberReqBody {
    @SerializedName("members")
    private Memberlist[] members;
    public Memberlist[] getMembers() {
        return this.members;
    }

    public void setMembers(Memberlist[] members) {
        this.members = members;
    }


// builder 开始
  public BatchAddGroupMemberReqBody(){}

  public BatchAddGroupMemberReqBody(Builder builder){
      this.members = builder.members;
  }

    public static class Builder {
        private Memberlist[] members;
        public Builder members(Memberlist[] members) {
             this.members = members;
             return this;
        }
    
    
    public BatchAddGroupMemberReqBody build(){
        return new BatchAddGroupMemberReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
