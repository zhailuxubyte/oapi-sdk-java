// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class Find {
    @SerializedName("find_condition")
    private FindCondition findCondition;
    @SerializedName("find")
    private String find;

    // builder 开始
    public Find() {
    }

    public Find(Builder builder) {
        this.findCondition = builder.findCondition;
        this.find = builder.find;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public FindCondition getFindCondition() {
        return this.findCondition;
    }

    public void setFindCondition(FindCondition findCondition) {
        this.findCondition = findCondition;
    }

    public String getFind() {
        return this.find;
    }

    public void setFind(String find) {
        this.find = find;
    }

    public static class Builder {
        private FindCondition findCondition;
        private String find;

        public Builder findCondition(FindCondition findCondition) {
            this.findCondition = findCondition;
            return this;
        }

        public Builder find(String find) {
            this.find = find;
            return this;
        }


        public Find build() {
            return new Find(this);
        }
    }
}
