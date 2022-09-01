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

package com.lark.oapi.service.contact.v3.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.contact.v3.enums.*;
import com.google.gson.annotations.SerializedName;
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
public class OldDepartmentObject {
    @SerializedName("status")
    private DepartmentStatus status;
    @SerializedName("open_department_id")
    private String openDepartmentId;
    public DepartmentStatus getStatus() {
        return this.status;
    }

    public void setStatus(DepartmentStatus status) {
        this.status = status;
    }

    public String getOpenDepartmentId() {
        return this.openDepartmentId;
    }

    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }


// builder 开始
  public OldDepartmentObject(){}

  public OldDepartmentObject(Builder builder){
      this.status = builder.status;
      this.openDepartmentId = builder.openDepartmentId;
  }

    public static class Builder {
        private DepartmentStatus status;
        private String openDepartmentId;
        public Builder status(DepartmentStatus status) {
             this.status = status;
             return this;
        }
    
        public Builder openDepartmentId(String openDepartmentId) {
             this.openDepartmentId = openDepartmentId;
             return this;
        }
    
    
    public OldDepartmentObject build(){
        return new OldDepartmentObject(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
