// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;

public class ListAppRoleReq {
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Path
    @SerializedName("app_token")
    private String appToken;

    // builder 开始
    public ListAppRoleReq() {
    }

    public ListAppRoleReq(Builder builder) {
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.appToken = builder.appToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

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

    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public static class Builder {
        private Integer pageSize;
        private String pageToken;
        private String appToken;

        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        public Builder appToken(String appToken) {
            this.appToken = appToken;
            return this;
        }

        public ListAppRoleReq build() {
            return new ListAppRoleReq(this);
        }
    }
}
