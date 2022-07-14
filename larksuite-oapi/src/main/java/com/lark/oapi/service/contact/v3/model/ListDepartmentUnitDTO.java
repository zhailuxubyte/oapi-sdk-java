// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class ListDepartmentUnitDTO {

  @SerializedName("departmentlist")
  private UnitDepartment[] departmentlist;
  @SerializedName("has_more")
  private Boolean hasMore;
  @SerializedName("page_token")
  private String pageToken;

  public UnitDepartment[] getDepartmentlist() {
    return this.departmentlist;
  }

  public void setDepartmentlist(UnitDepartment[] departmentlist) {
    this.departmentlist = departmentlist;
  }

  public Boolean getHasMore() {
    return this.hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

}
