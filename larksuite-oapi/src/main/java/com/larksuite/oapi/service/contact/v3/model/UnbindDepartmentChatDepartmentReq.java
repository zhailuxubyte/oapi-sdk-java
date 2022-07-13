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
public class UnbindDepartmentChatDepartmentReq {
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    @Body
    private UnbindDepartmentChatDepartmentReqBody body;

    public UnbindDepartmentChatDepartmentReqBody getUnbindDepartmentChatDepartmentReqBody() {
        return this.body;
    }

    public void setUnbindDepartmentChatDepartmentReqBody(UnbindDepartmentChatDepartmentReqBody body) {
        this.body = body;
    }

// builder 开始
  public UnbindDepartmentChatDepartmentReq(){}

  public UnbindDepartmentChatDepartmentReq(Builder builder){
       this.departmentIdType = builder.departmentIdType;
        this.body = builder.body;
  }

    public static class Builder {
        private String departmentIdType;
    
           public Builder departmentIdType(String departmentIdType) {
                this.departmentIdType = departmentIdType;
                return this;
           }
          public Builder departmentIdType(com.larksuite.oapi.service.contact.v3.enums.DepartmentIdTypeEnum departmentIdType) {
               this.departmentIdType = departmentIdType.getValue();
               return this;
          }
    
        private UnbindDepartmentChatDepartmentReqBody body;
    
        public UnbindDepartmentChatDepartmentReqBody getUnbindDepartmentChatDepartmentReqBody() {
            return this.body;
        }
        public Builder unbindDepartmentChatDepartmentReqBody(UnbindDepartmentChatDepartmentReqBody body) {
             this.body = body;
             return this;
        }
    public UnbindDepartmentChatDepartmentReq build(){
        return new UnbindDepartmentChatDepartmentReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
