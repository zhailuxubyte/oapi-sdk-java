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

package com.lark.oapi.service.drive.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
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
public class ExportTask {
    @SerializedName("file_extension")
    private String fileExtension;
    @SerializedName("token")
    private String token;
    @SerializedName("type")
    private String type;
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("file_size")
    private Integer fileSize;
    @SerializedName("job_error_msg")
    private String jobErrorMsg;
    @SerializedName("job_status")
    private Integer jobStatus;
    public String getFileExtension() {
        return this.fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getJobErrorMsg() {
        return this.jobErrorMsg;
    }

    public void setJobErrorMsg(String jobErrorMsg) {
        this.jobErrorMsg = jobErrorMsg;
    }

    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }


// builder 开始
  public ExportTask(){}

  public ExportTask(Builder builder){
      this.fileExtension = builder.fileExtension;
      this.token = builder.token;
      this.type = builder.type;
      this.fileName = builder.fileName;
      this.fileToken = builder.fileToken;
      this.fileSize = builder.fileSize;
      this.jobErrorMsg = builder.jobErrorMsg;
      this.jobStatus = builder.jobStatus;
  }

    public static class Builder {
        private String fileExtension;
        private String token;
        private String type;
        private String fileName;
        private String fileToken;
        private Integer fileSize;
        private String jobErrorMsg;
        private Integer jobStatus;
        public Builder fileExtension(String fileExtension) {
             this.fileExtension = fileExtension;
             return this;
        }
        public Builder fileExtension(com.lark.oapi.service.drive.v1.enums.FileExtensionEnum fileExtension) {
             this.fileExtension = fileExtension.getValue();
             return this;
        }
    
        public Builder token(String token) {
             this.token = token;
             return this;
        }
    
        public Builder type(String type) {
             this.type = type;
             return this;
        }
        public Builder type(com.lark.oapi.service.drive.v1.enums.TypeEnum type) {
             this.type = type.getValue();
             return this;
        }
    
        public Builder fileName(String fileName) {
             this.fileName = fileName;
             return this;
        }
    
        public Builder fileToken(String fileToken) {
             this.fileToken = fileToken;
             return this;
        }
    
        public Builder fileSize(Integer fileSize) {
             this.fileSize = fileSize;
             return this;
        }
    
        public Builder jobErrorMsg(String jobErrorMsg) {
             this.jobErrorMsg = jobErrorMsg;
             return this;
        }
    
        public Builder jobStatus(Integer jobStatus) {
             this.jobStatus = jobStatus;
             return this;
        }
        public Builder jobStatus(com.lark.oapi.service.drive.v1.enums.JobStatusEnum jobStatus) {
             this.jobStatus = jobStatus.getValue();
             return this;
        }
    
    
    public ExportTask build(){
        return new ExportTask(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
