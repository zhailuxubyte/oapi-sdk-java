// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class SearchCalendarReqBody {
    @SerializedName("query")
    private String query;

    // builder 开始
    public SearchCalendarReqBody() {
    }

    public SearchCalendarReqBody(Builder builder) {
        this.query = builder.query;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public static class Builder {
        private String query;

        public Builder query(String query) {
            this.query = query;
            return this;
        }


        public SearchCalendarReqBody build() {
            return new SearchCalendarReqBody(this);
        }
    }
}
