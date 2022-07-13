// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;
import com.larksuite.oapi.service.search.v2.enums.*;
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
public class DeleteSchemaReq {
    @Path
    @SerializedName("schema_id")
    private String schemaId;
    public String getSchemaId() {
        return this.schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }


// builder 开始
  public DeleteSchemaReq(){}

  public DeleteSchemaReq(Builder builder){
       this.schemaId = builder.schemaId;
  }

    public static class Builder {
    
        private String schemaId;
          public Builder schemaId(String schemaId) {
               this.schemaId = schemaId;
               return this;
          }
    
    public DeleteSchemaReq build(){
        return new DeleteSchemaReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
