// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.larksuite.oapi.service.drive.v1.enums.*;
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
public class FileUploadInfo {
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("parent_type")
    private String parentType;
    @SerializedName("parent_node")
    private String parentNode;
    @SerializedName("size")
    private Integer size;
    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getParentType() {
        return this.parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getParentNode() {
        return this.parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


// builder 开始
  public FileUploadInfo(){}

  public FileUploadInfo(Builder builder){
      this.fileName = builder.fileName;
      this.parentType = builder.parentType;
      this.parentNode = builder.parentNode;
      this.size = builder.size;
  }

    public static class Builder {
        private String fileName;
        private String parentType;
        private String parentNode;
        private Integer size;
        public Builder fileName(String fileName) {
             this.fileName = fileName;
             return this;
        }
    
        public Builder parentType(String parentType) {
             this.parentType = parentType;
             return this;
        }
        public Builder parentType(com.larksuite.oapi.service.drive.v1.enums.ParentTypeEnum parentType) {
             this.parentType = parentType.getValue();
             return this;
        }
    
        public Builder parentNode(String parentNode) {
             this.parentNode = parentNode;
             return this;
        }
    
        public Builder size(Integer size) {
             this.size = size;
             return this;
        }
    
    
    public FileUploadInfo build(){
        return new FileUploadInfo(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
