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
public class BatchGetIdUserReqBody {
    @SerializedName("emails")
    private String[] emails;
    @SerializedName("mobiles")
    private String[] mobiles;
    public String[] getEmails() {
        return this.emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String[] getMobiles() {
        return this.mobiles;
    }

    public void setMobiles(String[] mobiles) {
        this.mobiles = mobiles;
    }


// builder 开始
  public BatchGetIdUserReqBody(){}

  public BatchGetIdUserReqBody(Builder builder){
      this.emails = builder.emails;
      this.mobiles = builder.mobiles;
  }

    public static class Builder {
        private String[] emails;
        private String[] mobiles;
        public Builder emails(String[] emails) {
             this.emails = emails;
             return this;
        }
    
        public Builder mobiles(String[] mobiles) {
             this.mobiles = mobiles;
             return this;
        }
    
    
    public BatchGetIdUserReqBody build(){
        return new BatchGetIdUserReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
