// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class ListCalendarEventAttendeeChatMemberDTO {
    @SerializedName("items")
    private CalendarEventAttendeeChatMember[] items;
    @SerializedName("has_more")
    private Boolean hasMore;
    @SerializedName("page_token")
    private String pageToken;
    public CalendarEventAttendeeChatMember[] getItems() {
        return this.items;
    }

    public void setItems(CalendarEventAttendeeChatMember[] items) {
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
