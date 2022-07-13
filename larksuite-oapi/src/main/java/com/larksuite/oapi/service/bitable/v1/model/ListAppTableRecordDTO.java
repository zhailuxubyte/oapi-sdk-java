// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListAppTableRecordDTO {
    @SerializedName("has_more")
    private Boolean hasMore;
    @SerializedName("page_token")
    private String pageToken;
    @SerializedName("total")
    private Integer total;
    @SerializedName("items")
    private AppTableRecord[] items;

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

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public AppTableRecord[] getItems() {
        return this.items;
    }

    public void setItems(AppTableRecord[] items) {
        this.items = items;
    }

}
