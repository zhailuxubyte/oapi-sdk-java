// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;

public class UnsubscribeCalendarReq {
    @Path
    @SerializedName("calendar_id")
    private String calendarId;

    // builder 开始
    public UnsubscribeCalendarReq() {
    }

    public UnsubscribeCalendarReq(Builder builder) {
        this.calendarId = builder.calendarId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public static class Builder {

        private String calendarId;

        public Builder calendarId(String calendarId) {
            this.calendarId = calendarId;
            return this;
        }

        public UnsubscribeCalendarReq build() {
            return new UnsubscribeCalendarReq(this);
        }
    }
}
