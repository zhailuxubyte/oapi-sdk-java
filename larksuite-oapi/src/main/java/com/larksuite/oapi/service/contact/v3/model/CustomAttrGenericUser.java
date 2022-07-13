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
public class CustomAttrGenericUser {
    @SerializedName("id")
    private String id;
    @SerializedName("type")
    private Integer type;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


// builder 开始
  public CustomAttrGenericUser(){}

  public CustomAttrGenericUser(Builder builder){
      this.id = builder.id;
      this.type = builder.type;
  }

    public static class Builder {
        private String id;
        private Integer type;
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
        public Builder type(Integer type) {
             this.type = type;
             return this;
        }
    
    
    public CustomAttrGenericUser build(){
        return new CustomAttrGenericUser(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
