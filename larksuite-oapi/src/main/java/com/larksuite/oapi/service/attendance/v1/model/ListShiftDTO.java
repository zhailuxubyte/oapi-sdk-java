// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;
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
public class ListShiftDTO {
    @SerializedName("shift_list")
    private Shift[] shiftList;
    @SerializedName("page_token")
    private String pageToken;
    @SerializedName("has_more")
    private Boolean hasMore;
    public Shift[] getShiftList() {
        return this.shiftList;
    }

    public void setShiftList(Shift[] shiftList) {
        this.shiftList = shiftList;
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
