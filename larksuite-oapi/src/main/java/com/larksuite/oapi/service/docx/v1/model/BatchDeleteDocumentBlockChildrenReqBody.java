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
public class BatchDeleteDocumentBlockChildrenReqBody {
    @SerializedName("start_index")
    private Integer startIndex;
    @SerializedName("end_index")
    private Integer endIndex;
    public Integer getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return this.endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }


// builder 开始
  public BatchDeleteDocumentBlockChildrenReqBody(){}

  public BatchDeleteDocumentBlockChildrenReqBody(Builder builder){
      this.startIndex = builder.startIndex;
      this.endIndex = builder.endIndex;
  }

    public static class Builder {
        private Integer startIndex;
        private Integer endIndex;
        public Builder startIndex(Integer startIndex) {
             this.startIndex = startIndex;
             return this;
        }
    
        public Builder endIndex(Integer endIndex) {
             this.endIndex = endIndex;
             return this;
        }
    
    
    public BatchDeleteDocumentBlockChildrenReqBody build(){
        return new BatchDeleteDocumentBlockChildrenReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
