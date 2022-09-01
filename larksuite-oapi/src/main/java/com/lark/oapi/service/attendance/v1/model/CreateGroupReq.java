// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.attendance.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;
public class CreateGroupReq {
    @Query
    @SerializedName("employee_type")
    private String employeeType;
    @Query
    @SerializedName("dept_type")
    private String deptType;
    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getDeptType() {
        return this.deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    @Body
    private CreateGroupReqBody body;

    public CreateGroupReqBody getCreateGroupReqBody() {
        return this.body;
    }

    public void setCreateGroupReqBody(CreateGroupReqBody body) {
        this.body = body;
    }

// builder 开始
  public CreateGroupReq(){}

  public CreateGroupReq(Builder builder){
       this.employeeType = builder.employeeType;
       this.deptType = builder.deptType;
        this.body = builder.body;
  }

    public static class Builder {
        private String employeeType;
        private String deptType;
    
           public Builder employeeType(String employeeType) {
                this.employeeType = employeeType;
                return this;
           }
          public Builder employeeType(com.lark.oapi.service.attendance.v1.enums.EmployeeTypeEnum employeeType) {
               this.employeeType = employeeType.getValue();
               return this;
          }
    
           public Builder deptType(String deptType) {
                this.deptType = deptType;
                return this;
           }
          public Builder deptType(com.lark.oapi.service.attendance.v1.enums.DeptTypeEnum deptType) {
               this.deptType = deptType.getValue();
               return this;
          }
    
        private CreateGroupReqBody body;
    
        public CreateGroupReqBody getCreateGroupReqBody() {
            return this.body;
        }
        public Builder createGroupReqBody(CreateGroupReqBody body) {
             this.body = body;
             return this;
        }
    public CreateGroupReq build(){
        return new CreateGroupReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
