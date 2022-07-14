// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class SimplelistGroupReq {

  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  @Query
  @SerializedName("page_token")
  private String pageToken;
  @Query
  @SerializedName("type")
  private Integer type;

  // builder 开始
  public SimplelistGroupReq() {
  }

  public SimplelistGroupReq(Builder builder) {
    this.pageSize = builder.pageSize;
    this.pageToken = builder.pageToken;
    this.type = builder.type;
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

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public static class Builder {

    private Integer pageSize;
    private String pageToken;
    private Integer type;

    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    public Builder type(com.lark.oapi.service.contact.v3.enums.GroupTypeEnum type) {
      this.type = type.getValue();
      return this;
    }

    public SimplelistGroupReq build() {
      return new SimplelistGroupReq(this);
    }
  }
}
