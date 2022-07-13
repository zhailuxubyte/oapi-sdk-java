// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.approval.v4.model;
import com.larksuite.oapi.service.approval.v4.enums.*;
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
public class QueryInstanceReq {
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    @Body
    private InstanceSearch body;

    public InstanceSearch getInstanceSearch() {
        return this.body;
    }

    public void setInstanceSearch(InstanceSearch body) {
        this.body = body;
    }

// builder 开始
  public QueryInstanceReq(){}

  public QueryInstanceReq(Builder builder){
       this.pageSize = builder.pageSize;
       this.pageToken = builder.pageToken;
       this.userIdType = builder.userIdType;
        this.body = builder.body;
  }

    public static class Builder {
        private Integer pageSize;
        private String pageToken;
        private String userIdType;
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.larksuite.oapi.service.approval.v4.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private InstanceSearch body;
    
        public InstanceSearch getInstanceSearch() {
            return this.body;
        }
        public Builder instanceSearch(InstanceSearch body) {
             this.body = body;
             return this;
        }
    public QueryInstanceReq build(){
        return new QueryInstanceReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
