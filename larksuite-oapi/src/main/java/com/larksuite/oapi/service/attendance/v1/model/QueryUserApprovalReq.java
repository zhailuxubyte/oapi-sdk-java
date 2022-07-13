// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;
import com.larksuite.oapi.service.attendance.v1.enums.*;
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
public class QueryUserApprovalReq {
    @Query
    @SerializedName("employee_type")
    private String employeeType;
    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Body
    private QueryUserApprovalReqBody body;

    public QueryUserApprovalReqBody getQueryUserApprovalReqBody() {
        return this.body;
    }

    public void setQueryUserApprovalReqBody(QueryUserApprovalReqBody body) {
        this.body = body;
    }

// builder 开始
  public QueryUserApprovalReq(){}

  public QueryUserApprovalReq(Builder builder){
       this.employeeType = builder.employeeType;
        this.body = builder.body;
  }

    public static class Builder {
        private String employeeType;
    
           public Builder employeeType(String employeeType) {
                this.employeeType = employeeType;
                return this;
           }
          public Builder employeeType(com.larksuite.oapi.service.attendance.v1.enums.EmployeeTypeEnum employeeType) {
               this.employeeType = employeeType.getValue();
               return this;
          }
    
        private QueryUserApprovalReqBody body;
    
        public QueryUserApprovalReqBody getQueryUserApprovalReqBody() {
            return this.body;
        }
        public Builder queryUserApprovalReqBody(QueryUserApprovalReqBody body) {
             this.body = body;
             return this;
        }
    public QueryUserApprovalReq build(){
        return new QueryUserApprovalReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
