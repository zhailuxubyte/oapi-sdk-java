// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class Count {

  @SerializedName("total")
  private Integer total;
  @SerializedName("has_more")
  private Boolean hasMore;

  // builder 开始
  public Count() {
  }

  public Count(Builder builder) {
    this.total = builder.total;
    this.hasMore = builder.hasMore;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getTotal() {
    return this.total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Boolean getHasMore() {
    return this.hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public static class Builder {

    private Integer total;
    private Boolean hasMore;

    public Builder total(Integer total) {
      this.total = total;
      return this;
    }

    public Builder hasMore(Boolean hasMore) {
      this.hasMore = hasMore;
      return this;
    }


    public Count build() {
      return new Count(this);
    }
  }
}
