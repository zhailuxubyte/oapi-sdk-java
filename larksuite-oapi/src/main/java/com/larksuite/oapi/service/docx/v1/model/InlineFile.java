// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.larksuite.oapi.service.docx.v1.enums.*;
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
public class InlineFile {
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("source_block_id")
    private String sourceBlockId;
    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getSourceBlockId() {
        return this.sourceBlockId;
    }

    public void setSourceBlockId(String sourceBlockId) {
        this.sourceBlockId = sourceBlockId;
    }


// builder 开始
  public InlineFile(){}

  public InlineFile(Builder builder){
      this.fileToken = builder.fileToken;
      this.sourceBlockId = builder.sourceBlockId;
  }

    public static class Builder {
        private String fileToken;
        private String sourceBlockId;
        public Builder fileToken(String fileToken) {
             this.fileToken = fileToken;
             return this;
        }
    
        public Builder sourceBlockId(String sourceBlockId) {
             this.sourceBlockId = sourceBlockId;
             return this;
        }
    
    
    public InlineFile build(){
        return new InlineFile(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
