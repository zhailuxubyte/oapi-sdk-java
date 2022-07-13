// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;
import com.larksuite.oapi.service.mail.v1.enums.*;
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
public class DeleteMailgroupPermissionMemberReq {
    @Path
    @SerializedName("mailgroup_id")
    private String mailgroupId;
    @Path
    @SerializedName("permission_member_id")
    private String permissionMemberId;
    public String getMailgroupId() {
        return this.mailgroupId;
    }

    public void setMailgroupId(String mailgroupId) {
        this.mailgroupId = mailgroupId;
    }

    public String getPermissionMemberId() {
        return this.permissionMemberId;
    }

    public void setPermissionMemberId(String permissionMemberId) {
        this.permissionMemberId = permissionMemberId;
    }


// builder 开始
  public DeleteMailgroupPermissionMemberReq(){}

  public DeleteMailgroupPermissionMemberReq(Builder builder){
       this.mailgroupId = builder.mailgroupId;
       this.permissionMemberId = builder.permissionMemberId;
  }

    public static class Builder {
    
        private String mailgroupId;
        private String permissionMemberId;
          public Builder mailgroupId(String mailgroupId) {
               this.mailgroupId = mailgroupId;
               return this;
          }
    
          public Builder permissionMemberId(String permissionMemberId) {
               this.permissionMemberId = permissionMemberId;
               return this;
          }
    
    public DeleteMailgroupPermissionMemberReq build(){
        return new DeleteMailgroupPermissionMemberReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
