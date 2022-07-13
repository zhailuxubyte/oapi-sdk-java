// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;
import com.larksuite.oapi.service.search.v2.enums.*;
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
public class SchemaTypeDefinitions {
    @SerializedName("tag")
    private SchemaTagOptions[] tag;
    public SchemaTagOptions[] getTag() {
        return this.tag;
    }

    public void setTag(SchemaTagOptions[] tag) {
        this.tag = tag;
    }


// builder 开始
  public SchemaTypeDefinitions(){}

  public SchemaTypeDefinitions(Builder builder){
      this.tag = builder.tag;
  }

    public static class Builder {
        private SchemaTagOptions[] tag;
        public Builder tag(SchemaTagOptions[] tag) {
             this.tag = tag;
             return this;
        }
    
    
    public SchemaTypeDefinitions build(){
        return new SchemaTypeDefinitions(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
