// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;

public class QuerySpreadsheetSheetFilterViewConditionReq {
    @Path
    @SerializedName("spreadsheet_token")
    private String spreadsheetToken;
    @Path
    @SerializedName("sheet_id")
    private String sheetId;
    @Path
    @SerializedName("filter_view_id")
    private String filterViewId;

    // builder 开始
    public QuerySpreadsheetSheetFilterViewConditionReq() {
    }

    public QuerySpreadsheetSheetFilterViewConditionReq(Builder builder) {
        this.spreadsheetToken = builder.spreadsheetToken;
        this.sheetId = builder.sheetId;
        this.filterViewId = builder.filterViewId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSpreadsheetToken() {
        return this.spreadsheetToken;
    }

    public void setSpreadsheetToken(String spreadsheetToken) {
        this.spreadsheetToken = spreadsheetToken;
    }

    public String getSheetId() {
        return this.sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public String getFilterViewId() {
        return this.filterViewId;
    }

    public void setFilterViewId(String filterViewId) {
        this.filterViewId = filterViewId;
    }

    public static class Builder {

        private String spreadsheetToken;
        private String sheetId;
        private String filterViewId;

        public Builder spreadsheetToken(String spreadsheetToken) {
            this.spreadsheetToken = spreadsheetToken;
            return this;
        }

        public Builder sheetId(String sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        public Builder filterViewId(String filterViewId) {
            this.filterViewId = filterViewId;
            return this;
        }

        public QuerySpreadsheetSheetFilterViewConditionReq build() {
            return new QuerySpreadsheetSheetFilterViewConditionReq(this);
        }
    }
}
