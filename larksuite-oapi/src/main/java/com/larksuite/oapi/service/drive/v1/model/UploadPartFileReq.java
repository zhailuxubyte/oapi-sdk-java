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
public class UploadPartFileReq {
    @Body
    private UploadPartFileReqBody body;

    public UploadPartFileReqBody getUploadPartFileReqBody() {
        return this.body;
    }

    public void setUploadPartFileReqBody(UploadPartFileReqBody body) {
        this.body = body;
    }

// builder 开始
  public UploadPartFileReq(){}

  public UploadPartFileReq(Builder builder){
        this.body = builder.body;
  }

    public static class Builder {
    
        private UploadPartFileReqBody body;
    
        public UploadPartFileReqBody getUploadPartFileReqBody() {
            return this.body;
        }
        public Builder uploadPartFileReqBody(UploadPartFileReqBody body) {
             this.body = body;
             return this;
        }
    public UploadPartFileReq build(){
        return new UploadPartFileReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
