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
public class DeleteDepartmentReq {
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    @Path
    @SerializedName("department_id")
    private String departmentId;
    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }


// builder 开始
  public DeleteDepartmentReq(){}

  public DeleteDepartmentReq(Builder builder){
       this.departmentIdType = builder.departmentIdType;
       this.departmentId = builder.departmentId;
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
    
        private String departmentId;
          public Builder departmentId(String departmentId) {
               this.departmentId = departmentId;
               return this;
          }
    
    public DeleteDepartmentReq build(){
        return new DeleteDepartmentReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
