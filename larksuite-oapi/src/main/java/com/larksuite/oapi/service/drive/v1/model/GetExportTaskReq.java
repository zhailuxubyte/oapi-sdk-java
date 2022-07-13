// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.larksuite.oapi.service.drive.v1.enums.*;
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
public class GetExportTaskReq {
    @Query
    @SerializedName("token")
    private String token;
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Path
    @SerializedName("ticket")
    private String ticket;
    public String getTicket() {
        return this.ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }


// builder 开始
  public GetExportTaskReq(){}

  public GetExportTaskReq(Builder builder){
       this.token = builder.token;
       this.ticket = builder.ticket;
  }

    public static class Builder {
        private String token;
    
           public Builder token(String token) {
                this.token = token;
                return this;
           }
    
        private String ticket;
          public Builder ticket(String ticket) {
               this.ticket = ticket;
               return this;
          }
    
    public GetExportTaskReq build(){
        return new GetExportTaskReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
