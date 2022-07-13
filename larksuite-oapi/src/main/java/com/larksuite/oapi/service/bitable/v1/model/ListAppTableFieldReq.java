// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;
import com.larksuite.oapi.service.bitable.v1.enums.*;
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
public class ListAppTableFieldReq {
    @Query
    @SerializedName("view_id")
    private String viewId;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    public String getViewId() {
        return this.viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Path
    @SerializedName("app_token")
    private String appToken;
    @Path
    @SerializedName("table_id")
    private String tableId;
    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }


// builder 开始
  public ListAppTableFieldReq(){}

  public ListAppTableFieldReq(Builder builder){
       this.viewId = builder.viewId;
       this.pageToken = builder.pageToken;
       this.pageSize = builder.pageSize;
       this.appToken = builder.appToken;
       this.tableId = builder.tableId;
  }

    public static class Builder {
        private String viewId;
        private String pageToken;
        private Integer pageSize;
    
           public Builder viewId(String viewId) {
                this.viewId = viewId;
                return this;
           }
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
        private String appToken;
        private String tableId;
          public Builder appToken(String appToken) {
               this.appToken = appToken;
               return this;
          }
    
          public Builder tableId(String tableId) {
               this.tableId = tableId;
               return this;
          }
    
    public ListAppTableFieldReq build(){
        return new ListAppTableFieldReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
