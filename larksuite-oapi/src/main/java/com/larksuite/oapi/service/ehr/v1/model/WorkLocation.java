// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.ehr.v1.model;
import com.larksuite.oapi.service.ehr.v1.enums.*;
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
public class WorkLocation {
    @SerializedName("id")
    private Long id;
    @SerializedName("name")
    private String name;
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


// builder 开始
  public WorkLocation(){}

  public WorkLocation(Builder builder){
      this.id = builder.id;
      this.name = builder.name;
  }

    public static class Builder {
        private Long id;
        private String name;
        public Builder id(Long id) {
             this.id = id;
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
    
    public WorkLocation build(){
        return new WorkLocation(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
