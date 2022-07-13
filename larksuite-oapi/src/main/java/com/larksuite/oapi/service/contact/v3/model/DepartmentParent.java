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
public class DepartmentParent {
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("parent_ids")
    private String[] parentIds;
    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String[] getParentIds() {
        return this.parentIds;
    }

    public void setParentIds(String[] parentIds) {
        this.parentIds = parentIds;
    }


// builder 开始
  public DepartmentParent(){}

  public DepartmentParent(Builder builder){
      this.departmentId = builder.departmentId;
      this.parentIds = builder.parentIds;
  }

    public static class Builder {
        private String departmentId;
        private String[] parentIds;
        public Builder departmentId(String departmentId) {
             this.departmentId = departmentId;
             return this;
        }
    
        public Builder parentIds(String[] parentIds) {
             this.parentIds = parentIds;
             return this;
        }
    
    
    public DepartmentParent build(){
        return new DepartmentParent(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
