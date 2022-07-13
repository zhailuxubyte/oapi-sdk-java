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
public class GetUnitReq {
    @Path
    @SerializedName("unit_id")
    private String unitId;
    public String getUnitId() {
        return this.unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }


// builder 开始
  public GetUnitReq(){}

  public GetUnitReq(Builder builder){
       this.unitId = builder.unitId;
  }

    public static class Builder {
    
        private String unitId;
          public Builder unitId(String unitId) {
               this.unitId = unitId;
               return this;
          }
    
    public GetUnitReq build(){
        return new GetUnitReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
