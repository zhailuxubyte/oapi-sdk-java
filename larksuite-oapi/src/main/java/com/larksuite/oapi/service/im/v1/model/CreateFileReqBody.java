// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.larksuite.oapi.service.im.v1.enums.*;
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
public class CreateFileReqBody {
    @SerializedName("file_type")
    private String fileType;
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("duration")
    private Integer duration;
    @SerializedName("file")
    private File file;
    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }


// builder 开始
  public CreateFileReqBody(){}

  public CreateFileReqBody(Builder builder){
      this.fileType = builder.fileType;
      this.fileName = builder.fileName;
      this.duration = builder.duration;
      this.file = builder.file;
  }

    public static class Builder {
        private String fileType;
        private String fileName;
        private Integer duration;
        private File file;
        public Builder fileType(String fileType) {
             this.fileType = fileType;
             return this;
        }
        public Builder fileType(com.larksuite.oapi.service.im.v1.enums.FileTypeEnum fileType) {
             this.fileType = fileType.getValue();
             return this;
        }
    
        public Builder fileName(String fileName) {
             this.fileName = fileName;
             return this;
        }
    
        public Builder duration(Integer duration) {
             this.duration = duration;
             return this;
        }
    
        public Builder file(File file) {
             this.file = file;
             return this;
        }
    
    
    public CreateFileReqBody build(){
        return new CreateFileReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
