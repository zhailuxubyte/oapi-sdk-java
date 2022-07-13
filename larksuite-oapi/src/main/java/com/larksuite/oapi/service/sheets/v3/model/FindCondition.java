// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class FindCondition {
    @SerializedName("range")
    private String range;
    @SerializedName("match_case")
    private Boolean matchCase;
    @SerializedName("match_entire_cell")
    private Boolean matchEntireCell;
    @SerializedName("search_by_regex")
    private Boolean searchByRegex;
    @SerializedName("include_formulas")
    private Boolean includeFormulas;

    // builder 开始
    public FindCondition() {
    }

    public FindCondition(Builder builder) {
        this.range = builder.range;
        this.matchCase = builder.matchCase;
        this.matchEntireCell = builder.matchEntireCell;
        this.searchByRegex = builder.searchByRegex;
        this.includeFormulas = builder.includeFormulas;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Boolean getMatchCase() {
        return this.matchCase;
    }

    public void setMatchCase(Boolean matchCase) {
        this.matchCase = matchCase;
    }

    public Boolean getMatchEntireCell() {
        return this.matchEntireCell;
    }

    public void setMatchEntireCell(Boolean matchEntireCell) {
        this.matchEntireCell = matchEntireCell;
    }

    public Boolean getSearchByRegex() {
        return this.searchByRegex;
    }

    public void setSearchByRegex(Boolean searchByRegex) {
        this.searchByRegex = searchByRegex;
    }

    public Boolean getIncludeFormulas() {
        return this.includeFormulas;
    }

    public void setIncludeFormulas(Boolean includeFormulas) {
        this.includeFormulas = includeFormulas;
    }

    public static class Builder {
        private String range;
        private Boolean matchCase;
        private Boolean matchEntireCell;
        private Boolean searchByRegex;
        private Boolean includeFormulas;

        public Builder range(String range) {
            this.range = range;
            return this;
        }

        public Builder matchCase(Boolean matchCase) {
            this.matchCase = matchCase;
            return this;
        }

        public Builder matchEntireCell(Boolean matchEntireCell) {
            this.matchEntireCell = matchEntireCell;
            return this;
        }

        public Builder searchByRegex(Boolean searchByRegex) {
            this.searchByRegex = searchByRegex;
            return this;
        }

        public Builder includeFormulas(Boolean includeFormulas) {
            this.includeFormulas = includeFormulas;
            return this;
        }


        public FindCondition build() {
            return new FindCondition(this);
        }
    }
}
