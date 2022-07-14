// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteSchemaReq {

  @Path
  @SerializedName("schema_id")
  private String schemaId;

  // builder 开始
  public DeleteSchemaReq() {
  }

  public DeleteSchemaReq(Builder builder) {
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

    public DeleteSchemaReq build() {
      return new DeleteSchemaReq(this);
    }
  }
}
