// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class DeleteGridColumnRequest {
    @SerializedName("column_index")
    private Integer columnIndex;

    // builder 开始
    public DeleteGridColumnRequest() {
    }

    public DeleteGridColumnRequest(Builder builder) {
        this.columnIndex = builder.columnIndex;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getColumnIndex() {
        return this.columnIndex;
    }

    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    public static class Builder {
        private Integer columnIndex;

        public Builder columnIndex(Integer columnIndex) {
            this.columnIndex = columnIndex;
            return this;
        }


        public DeleteGridColumnRequest build() {
            return new DeleteGridColumnRequest(this);
        }
    }
}
