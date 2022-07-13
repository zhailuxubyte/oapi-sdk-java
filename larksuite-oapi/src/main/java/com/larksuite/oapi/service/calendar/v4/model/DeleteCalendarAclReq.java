// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;

public class DeleteCalendarAclReq {
    @Path
    @SerializedName("calendar_id")
    private String calendarId;
    @Path
    @SerializedName("acl_id")
    private String aclId;

    // builder 开始
    public DeleteCalendarAclReq() {
    }

    public DeleteCalendarAclReq(Builder builder) {
        this.calendarId = builder.calendarId;
        this.aclId = builder.aclId;
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

    public String getAclId() {
        return this.aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public static class Builder {

        private String calendarId;
        private String aclId;

        public Builder calendarId(String calendarId) {
            this.calendarId = calendarId;
            return this;
        }

        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        public DeleteCalendarAclReq build() {
            return new DeleteCalendarAclReq(this);
        }
    }
}
