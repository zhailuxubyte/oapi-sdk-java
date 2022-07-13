// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateAppTableReqBody {
    @SerializedName("table")
    private ReqTable table;

    // builder 开始
    public CreateAppTableReqBody() {
    }

    public CreateAppTableReqBody(Builder builder) {
        this.table = builder.table;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ReqTable getTable() {
        return this.table;
    }

    public void setTable(ReqTable table) {
        this.table = table;
    }

    public static class Builder {
        private ReqTable table;

        public Builder table(ReqTable table) {
            this.table = table;
            return this;
        }


        public CreateAppTableReqBody build() {
            return new CreateAppTableReqBody(this);
        }
    }
}
