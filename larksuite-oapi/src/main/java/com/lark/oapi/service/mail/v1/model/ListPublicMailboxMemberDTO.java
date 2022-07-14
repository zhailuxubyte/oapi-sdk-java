// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListPublicMailboxMemberDTO {

  @SerializedName("has_more")
  private Boolean hasMore;
  @SerializedName("page_token")
  private String pageToken;
  @SerializedName("items")
  private PublicMailboxMember[] items;

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

  public PublicMailboxMember[] getItems() {
    return this.items;
  }

  public void setItems(PublicMailboxMember[] items) {
    this.items = items;
  }

}
