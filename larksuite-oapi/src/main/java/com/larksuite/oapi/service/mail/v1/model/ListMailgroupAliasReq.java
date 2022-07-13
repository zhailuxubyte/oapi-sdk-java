// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;
import com.larksuite.oapi.service.mail.v1.enums.*;
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
public class ListMailgroupAliasReq {
    @Path
    @SerializedName("mailgroup_id")
    private String mailgroupId;
    public String getMailgroupId() {
        return this.mailgroupId;
    }

    public void setMailgroupId(String mailgroupId) {
        this.mailgroupId = mailgroupId;
    }


// builder 开始
  public ListMailgroupAliasReq(){}

  public ListMailgroupAliasReq(Builder builder){
       this.mailgroupId = builder.mailgroupId;
  }

    public static class Builder {
    
        private String mailgroupId;
          public Builder mailgroupId(String mailgroupId) {
               this.mailgroupId = mailgroupId;
               return this;
          }
    
    public ListMailgroupAliasReq build(){
        return new ListMailgroupAliasReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
