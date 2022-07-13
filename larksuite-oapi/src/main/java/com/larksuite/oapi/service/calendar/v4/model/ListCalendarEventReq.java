// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;

public class ListCalendarEventReq {
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    @Query
    @SerializedName("anchor_time")
    private String anchorTime;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("sync_token")
    private String syncToken;
    @Query
    @SerializedName("start_time")
    private String startTime;
    @Query
    @SerializedName("end_time")
    private String endTime;
    @Path
    @SerializedName("calendar_id")
    private String calendarId;

    // builder 开始
    public ListCalendarEventReq() {
    }

    public ListCalendarEventReq(Builder builder) {
        this.pageSize = builder.pageSize;
        this.anchorTime = builder.anchorTime;
        this.pageToken = builder.pageToken;
        this.syncToken = builder.syncToken;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.calendarId = builder.calendarId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getAnchorTime() {
        return this.anchorTime;
    }

    public void setAnchorTime(String anchorTime) {
        this.anchorTime = anchorTime;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getSyncToken() {
        return this.syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public static class Builder {
        private Integer pageSize;
        private String anchorTime;
        private String pageToken;
        private String syncToken;
        private String startTime;
        private String endTime;
        private String calendarId;

        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder anchorTime(String anchorTime) {
            this.anchorTime = anchorTime;
            return this;
        }

        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        public Builder syncToken(String syncToken) {
            this.syncToken = syncToken;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder calendarId(String calendarId) {
            this.calendarId = calendarId;
            return this;
        }

        public ListCalendarEventReq build() {
            return new ListCalendarEventReq(this);
        }
    }
}
