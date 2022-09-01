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

package com.lark.oapi.service.bitable.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.bitable.v1.enums.*;
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
public class UpdateAppTableRecordReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    @Path
    @SerializedName("app_token")
    private String appToken;
    @Path
    @SerializedName("table_id")
    private String tableId;
    @Path
    @SerializedName("record_id")
    private String recordId;
    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Body
    private AppTableRecord body;

    public AppTableRecord getAppTableRecord() {
        return this.body;
    }

    public void setAppTableRecord(AppTableRecord body) {
        this.body = body;
    }

// builder 开始
  public UpdateAppTableRecordReq(){}

  public UpdateAppTableRecordReq(Builder builder){
       this.userIdType = builder.userIdType;
       this.appToken = builder.appToken;
       this.tableId = builder.tableId;
       this.recordId = builder.recordId;
        this.body = builder.body;
  }

    public static class Builder {
        private String userIdType;
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.lark.oapi.service.bitable.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private String appToken;
        private String tableId;
        private String recordId;
          public Builder appToken(String appToken) {
               this.appToken = appToken;
               return this;
          }
    
          public Builder tableId(String tableId) {
               this.tableId = tableId;
               return this;
          }
    
          public Builder recordId(String recordId) {
               this.recordId = recordId;
               return this;
          }
    
        private AppTableRecord body;
    
        public AppTableRecord getAppTableRecord() {
            return this.body;
        }
        public Builder appTableRecord(AppTableRecord body) {
             this.body = body;
             return this;
        }
    public UpdateAppTableRecordReq build(){
        return new UpdateAppTableRecordReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
