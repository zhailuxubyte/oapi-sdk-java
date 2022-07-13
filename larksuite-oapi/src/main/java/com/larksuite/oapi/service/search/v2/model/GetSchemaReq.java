// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Path;

public class GetSchemaReq {
    @Path
    @SerializedName("schema_id")
    private String schemaId;

    // builder 开始
    public GetSchemaReq() {
    }

    public GetSchemaReq(Builder builder) {
        this.schemaId = builder.schemaId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSchemaId() {
        return this.schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public static class Builder {

        private String schemaId;

        public Builder schemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public GetSchemaReq build() {
            return new GetSchemaReq(this);
        }
    }
}
