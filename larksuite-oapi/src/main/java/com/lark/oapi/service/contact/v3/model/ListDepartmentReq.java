// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListDepartmentReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Query
  @SerializedName("department_id_type")
  private String departmentIdType;
  @Query
  @SerializedName("parent_department_id")
  private String parentDepartmentId;
  @Query
  @SerializedName("fetch_child")
  private Boolean fetchChild;
  @Query
  @SerializedName("page_token")
  private String pageToken;
  @Query
  @SerializedName("page_size")
  private Integer pageSize;

  // builder 开始
  public ListDepartmentReq() {
  }

  public ListDepartmentReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.departmentIdType = builder.departmentIdType;
    this.parentDepartmentId = builder.parentDepartmentId;
    this.fetchChild = builder.fetchChild;
    this.pageToken = builder.pageToken;
    this.pageSize = builder.pageSize;
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

  public String getParentDepartmentId() {
    return this.parentDepartmentId;
  }

  public void setParentDepartmentId(String parentDepartmentId) {
    this.parentDepartmentId = parentDepartmentId;
  }

  public Boolean getFetchChild() {
    return this.fetchChild;
  }

  public void setFetchChild(Boolean fetchChild) {
    this.fetchChild = fetchChild;
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

  public static class Builder {

    private String userIdType;
    private String departmentIdType;
    private String parentDepartmentId;
    private Boolean fetchChild;
    private String pageToken;
    private Integer pageSize;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.contact.v3.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder departmentIdType(String departmentIdType) {
      this.departmentIdType = departmentIdType;
      return this;
    }

    public Builder departmentIdType(
        com.lark.oapi.service.contact.v3.enums.DepartmentIdTypeEnum departmentIdType) {
      this.departmentIdType = departmentIdType.getValue();
      return this;
    }

    public Builder parentDepartmentId(String parentDepartmentId) {
      this.parentDepartmentId = parentDepartmentId;
      return this;
    }

    public Builder fetchChild(Boolean fetchChild) {
      this.fetchChild = fetchChild;
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

    public ListDepartmentReq build() {
      return new ListDepartmentReq(this);
    }
  }
}
