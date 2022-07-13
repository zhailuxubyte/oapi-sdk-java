// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.larksuite.oapi.service.contact.v3.enums.*;
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
public class CreateUnitReqBody {
    @SerializedName("unit_id")
    private String unitId;
    @SerializedName("name")
    private String name;
    @SerializedName("unit_type")
    private String unitType;
    public String getUnitId() {
        return this.unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitType() {
        return this.unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }


// builder 开始
  public CreateUnitReqBody(){}

  public CreateUnitReqBody(Builder builder){
      this.unitId = builder.unitId;
      this.name = builder.name;
      this.unitType = builder.unitType;
  }

    public static class Builder {
        private String unitId;
        private String name;
        private String unitType;
        public Builder unitId(String unitId) {
             this.unitId = unitId;
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
        public Builder unitType(String unitType) {
             this.unitType = unitType;
             return this;
        }
    
    
    public CreateUnitReqBody build(){
        return new CreateUnitReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
