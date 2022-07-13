// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.baike.v1.model;
import com.larksuite.oapi.service.baike.v1.enums.*;
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
public class Abbreviation {
    @SerializedName("id")
    private String id;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


// builder 开始
  public Abbreviation(){}

  public Abbreviation(Builder builder){
      this.id = builder.id;
  }

    public static class Builder {
        private String id;
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
    
    public Abbreviation build(){
        return new Abbreviation(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
