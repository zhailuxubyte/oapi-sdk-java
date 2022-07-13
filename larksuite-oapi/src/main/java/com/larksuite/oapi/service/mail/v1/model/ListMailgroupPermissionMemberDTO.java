// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListMailgroupPermissionMemberDTO {
    @SerializedName("has_more")
    private Boolean hasMore;
    @SerializedName("page_token")
    private String pageToken;
    @SerializedName("items")
    private MailgroupPermissionMember[] items;

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

    public MailgroupPermissionMember[] getItems() {
        return this.items;
    }

    public void setItems(MailgroupPermissionMember[] items) {
        this.items = items;
    }

}
