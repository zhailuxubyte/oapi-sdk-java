// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;
import com.larksuite.oapi.service.attendance.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class File {
    @SerializedName("file_id")
    private String fileId;
    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }


// builder 开始
  public File(){}

  public File(Builder builder){
      this.fileId = builder.fileId;
  }

    public static class Builder {
        private String fileId;
        public Builder fileId(String fileId) {
             this.fileId = fileId;
             return this;
        }
    
    
    public File build(){
        return new File(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
