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
public class TokenType {
    @SerializedName("token")
    private String token;
    @SerializedName("type")
    private String type;
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


// builder 开始
  public TokenType(){}

  public TokenType(Builder builder){
      this.token = builder.token;
      this.type = builder.type;
  }

    public static class Builder {
        private String token;
        private String type;
        public Builder token(String token) {
             this.token = token;
             return this;
        }
    
        public Builder type(String type) {
             this.type = type;
             return this;
        }
    
    
    public TokenType build(){
        return new TokenType(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
