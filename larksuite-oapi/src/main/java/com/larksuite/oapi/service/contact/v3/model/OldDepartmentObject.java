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
