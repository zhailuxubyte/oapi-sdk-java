// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchCreateAppTableReqBody {
    @SerializedName("tables")
    private ReqTable[] tables;

    // builder 开始
    public BatchCreateAppTableReqBody() {
    }

    public BatchCreateAppTableReqBody(Builder builder) {
        this.tables = builder.tables;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ReqTable[] getTables() {
        return this.tables;
    }

    public void setTables(ReqTable[] tables) {
        this.tables = tables;
    }

    public static class Builder {
        private ReqTable[] tables;

        public Builder tables(ReqTable[] tables) {
            this.tables = tables;
            return this;
        }


        public BatchCreateAppTableReqBody build() {
            return new BatchCreateAppTableReqBody(this);
        }
    }
}
