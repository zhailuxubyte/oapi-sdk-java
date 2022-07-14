// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class ListCalendarEventAttendeeDTO {

  @SerializedName("items")
  private CalendarEventAttendee[] items;
  @SerializedName("has_more")
  private Boolean hasMore;
  @SerializedName("page_token")
  private String pageToken;

  public CalendarEventAttendee[] getItems() {
    return this.items;
  }

  public void setItems(CalendarEventAttendee[] items) {
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
