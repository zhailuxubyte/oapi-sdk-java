// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.acs.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListUserReq {

  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  @Query
  @SerializedName("page_token")
  private String pageToken;
  @Query
  @SerializedName("user_id_type")
  private String userIdType;

  // builder 开始
  public ListUserReq() {
  }

  public ListUserReq(Builder builder) {
    this.pageSize = builder.pageSize;
    this.pageToken = builder.pageToken;
    this.userIdType = builder.userIdType;
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

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
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

    public Builder userIdType(com.lark.oapi.service.acs.v1.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public ListUserReq build() {
      return new ListUserReq(this);
    }
  }
}
