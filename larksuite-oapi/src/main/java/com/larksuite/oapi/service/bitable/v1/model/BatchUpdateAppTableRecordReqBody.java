// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;
import com.larksuite.oapi.service.bitable.v1.enums.*;
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
public class BatchUpdateAppTableRecordReqBody {
    @SerializedName("records")
    private AppTableRecord[] records;
    public AppTableRecord[] getRecords() {
        return this.records;
    }

    public void setRecords(AppTableRecord[] records) {
        this.records = records;
    }


// builder 开始
  public BatchUpdateAppTableRecordReqBody(){}

  public BatchUpdateAppTableRecordReqBody(Builder builder){
      this.records = builder.records;
  }

    public static class Builder {
        private AppTableRecord[] records;
        public Builder records(AppTableRecord[] records) {
             this.records = records;
             return this;
        }
    
    
    public BatchUpdateAppTableRecordReqBody build(){
        return new BatchUpdateAppTableRecordReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
