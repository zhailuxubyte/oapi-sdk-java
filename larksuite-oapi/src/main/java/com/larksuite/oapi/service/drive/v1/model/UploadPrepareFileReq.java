// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.larksuite.oapi.service.drive.v1.enums.*;
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
public class UploadPrepareFileReq {
    @Body
    private FileUploadInfo body;

    public FileUploadInfo getFileUploadInfo() {
        return this.body;
    }

    public void setFileUploadInfo(FileUploadInfo body) {
        this.body = body;
    }

// builder 开始
  public UploadPrepareFileReq(){}

  public UploadPrepareFileReq(Builder builder){
        this.body = builder.body;
  }

    public static class Builder {
    
        private FileUploadInfo body;
    
        public FileUploadInfo getFileUploadInfo() {
            return this.body;
        }
        public Builder fileUploadInfo(FileUploadInfo body) {
             this.body = body;
             return this;
        }
    public UploadPrepareFileReq build(){
        return new UploadPrepareFileReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
