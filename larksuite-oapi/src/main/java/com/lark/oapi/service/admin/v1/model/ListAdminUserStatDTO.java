// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListAdminUserStatDTO {

  @SerializedName("has_more")
  private Boolean hasMore;
  @SerializedName("page_token")
  private String pageToken;
  @SerializedName("items")
  private AdminUserStat[] items;

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

  public AdminUserStat[] getItems() {
    return this.items;
  }

  public void setItems(AdminUserStat[] items) {
    this.items = items;
  }

}
