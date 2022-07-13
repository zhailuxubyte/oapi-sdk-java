// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.larksuite.oapi.service.contact.v3.enums.*;
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
public class BindDepartmentUnitReq {
    @Body
    private BindDepartmentUnitReqBody body;

    public BindDepartmentUnitReqBody getBindDepartmentUnitReqBody() {
        return this.body;
    }

    public void setBindDepartmentUnitReqBody(BindDepartmentUnitReqBody body) {
        this.body = body;
    }

// builder 开始
  public BindDepartmentUnitReq(){}

  public BindDepartmentUnitReq(Builder builder){
        this.body = builder.body;
  }

    public static class Builder {
    
        private BindDepartmentUnitReqBody body;
    
        public BindDepartmentUnitReqBody getBindDepartmentUnitReqBody() {
            return this.body;
        }
        public Builder bindDepartmentUnitReqBody(BindDepartmentUnitReqBody body) {
             this.body = body;
             return this;
        }
    public BindDepartmentUnitReq build(){
        return new BindDepartmentUnitReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
