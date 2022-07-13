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
public class GetMailgroupPermissionMemberReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

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
  public GetMailgroupPermissionMemberReq(){}

  public GetMailgroupPermissionMemberReq(Builder builder){
       this.userIdType = builder.userIdType;
       this.departmentIdType = builder.departmentIdType;
       this.mailgroupId = builder.mailgroupId;
       this.permissionMemberId = builder.permissionMemberId;
  }

    public static class Builder {
        private String userIdType;
        private String departmentIdType;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.mail.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
           public Builder departmentIdType(String departmentIdType) {
                this.departmentIdType = departmentIdType;
                return this;
           }
          public Builder departmentIdType(com.larksuite.oapi.service.mail.v1.enums.DepartmentIdTypeEnum departmentIdType) {
               this.departmentIdType = departmentIdType.getValue();
               return this;
          }
    
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
    
    public GetMailgroupPermissionMemberReq build(){
        return new GetMailgroupPermissionMemberReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
