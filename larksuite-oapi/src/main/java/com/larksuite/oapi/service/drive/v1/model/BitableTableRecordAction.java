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
public class BitableTableRecordAction {
    @SerializedName("record_id")
    private String recordId;
    @SerializedName("action")
    private String action;
    @SerializedName("before_value")
    private BitableTableRecordActionField[] beforeValue;
    @SerializedName("after_value")
    private BitableTableRecordActionField[] afterValue;
    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BitableTableRecordActionField[] getBeforeValue() {
        return this.beforeValue;
    }

    public void setBeforeValue(BitableTableRecordActionField[] beforeValue) {
        this.beforeValue = beforeValue;
    }

    public BitableTableRecordActionField[] getAfterValue() {
        return this.afterValue;
    }

    public void setAfterValue(BitableTableRecordActionField[] afterValue) {
        this.afterValue = afterValue;
    }


// builder 开始
  public BitableTableRecordAction(){}

  public BitableTableRecordAction(Builder builder){
      this.recordId = builder.recordId;
      this.action = builder.action;
      this.beforeValue = builder.beforeValue;
      this.afterValue = builder.afterValue;
  }

    public static class Builder {
        private String recordId;
        private String action;
        private BitableTableRecordActionField[] beforeValue;
        private BitableTableRecordActionField[] afterValue;
        public Builder recordId(String recordId) {
             this.recordId = recordId;
             return this;
        }
    
        public Builder action(String action) {
             this.action = action;
             return this;
        }
    
        public Builder beforeValue(BitableTableRecordActionField[] beforeValue) {
             this.beforeValue = beforeValue;
             return this;
        }
    
        public Builder afterValue(BitableTableRecordActionField[] afterValue) {
             this.afterValue = afterValue;
             return this;
        }
    
    
    public BitableTableRecordAction build(){
        return new BitableTableRecordAction(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
