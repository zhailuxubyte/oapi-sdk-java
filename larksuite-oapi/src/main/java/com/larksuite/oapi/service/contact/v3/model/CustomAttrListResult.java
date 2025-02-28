// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.google.gson.annotations.SerializedName;

public class CustomAttrListResult {
    @SerializedName("items")
    private CustomAttr[] items;
    @SerializedName("page_token")
    private String pageToken;
    @SerializedName("has_more")
    private Boolean hasMore;

    public CustomAttr[] getItems() {
        return this.items;
    }

    public void setItems(CustomAttr[] items) {
        this.items = items;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

}
