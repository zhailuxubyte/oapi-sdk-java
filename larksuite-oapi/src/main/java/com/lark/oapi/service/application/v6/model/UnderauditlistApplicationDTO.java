// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class UnderauditlistApplicationDTO {

  @SerializedName("items")
  private Application[] items;
  @SerializedName("has_more")
  private Boolean hasMore;
  @SerializedName("page_token")
  private String pageToken;

  public Application[] getItems() {
    return this.items;
  }

  public void setItems(Application[] items) {
    this.items = items;
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
