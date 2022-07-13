// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Query;

public class SearchDepartmentReq {
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    @Body
    private SearchDepartmentReqBody body;

    // builder 开始
    public SearchDepartmentReq() {
    }

    public SearchDepartmentReq(Builder builder) {
        this.userIdType = builder.userIdType;
        this.departmentIdType = builder.departmentIdType;
        this.pageToken = builder.pageToken;
        this.pageSize = builder.pageSize;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
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

    public SearchDepartmentReqBody getSearchDepartmentReqBody() {
        return this.body;
    }

    public void setSearchDepartmentReqBody(SearchDepartmentReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType;
        private String departmentIdType;
        private String pageToken;
        private Integer pageSize;
        private SearchDepartmentReqBody body;

        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        public Builder userIdType(com.larksuite.oapi.service.contact.v3.enums.UserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        public Builder departmentIdType(com.larksuite.oapi.service.contact.v3.enums.DepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
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

        public SearchDepartmentReqBody getSearchDepartmentReqBody() {
            return this.body;
        }

        public Builder searchDepartmentReqBody(SearchDepartmentReqBody body) {
            this.body = body;
            return this;
        }

        public SearchDepartmentReq build() {
            return new SearchDepartmentReq(this);
        }
    }
}
