// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class UsageOverviewItem {

  @SerializedName("page_view")
  private Long pageView;
  @SerializedName("unique_visitor")
  private Long uniqueVisitor;
  @SerializedName("department_id")
  private String departmentId;

  // builder 开始
  public UsageOverviewItem() {
  }

  public UsageOverviewItem(Builder builder) {
    this.pageView = builder.pageView;
    this.uniqueVisitor = builder.uniqueVisitor;
    this.departmentId = builder.departmentId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getPageView() {
    return this.pageView;
  }

  public void setPageView(Long pageView) {
    this.pageView = pageView;
  }

  public Long getUniqueVisitor() {
    return this.uniqueVisitor;
  }

  public void setUniqueVisitor(Long uniqueVisitor) {
    this.uniqueVisitor = uniqueVisitor;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public static class Builder {

    private Long pageView;
    private Long uniqueVisitor;
    private String departmentId;

    public Builder pageView(Long pageView) {
      this.pageView = pageView;
      return this;
    }

    public Builder uniqueVisitor(Long uniqueVisitor) {
      this.uniqueVisitor = uniqueVisitor;
      return this;
    }

    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }


    public UsageOverviewItem build() {
      return new UsageOverviewItem(this);
    }
  }
}
