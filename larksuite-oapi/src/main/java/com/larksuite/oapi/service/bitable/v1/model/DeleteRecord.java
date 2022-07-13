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
public class DeleteRecord {
    @SerializedName("deleted")
    private Boolean deleted;
    @SerializedName("record_id")
    private String recordId;
    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }


// builder 开始
  public DeleteRecord(){}

  public DeleteRecord(Builder builder){
      this.deleted = builder.deleted;
      this.recordId = builder.recordId;
  }

    public static class Builder {
        private Boolean deleted;
        private String recordId;
        public Builder deleted(Boolean deleted) {
             this.deleted = deleted;
             return this;
        }
    
        public Builder recordId(String recordId) {
             this.recordId = recordId;
             return this;
        }
    
    
    public DeleteRecord build(){
        return new DeleteRecord(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
