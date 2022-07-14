// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class ItemRecord {

  @SerializedName("item_id")
  private String itemId;
  @SerializedName("data_source_id")
  private String dataSourceId;
  @SerializedName("version")
  private String version;
  @SerializedName("created_at")
  private String createdAt;
  @SerializedName("updated_at")
  private String updatedAt;

  // builder 开始
  public ItemRecord() {
  }

  public ItemRecord(Builder builder) {
    this.itemId = builder.itemId;
    this.dataSourceId = builder.dataSourceId;
    this.version = builder.version;
    this.createdAt = builder.createdAt;
    this.updatedAt = builder.updatedAt;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getItemId() {
    return this.itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getDataSourceId() {
    return this.dataSourceId;
  }

  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }

  public String getVersion() {
    return this.version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public static class Builder {

    private String itemId;
    private String dataSourceId;
    private String version;
    private String createdAt;
    private String updatedAt;

    public Builder itemId(String itemId) {
      this.itemId = itemId;
      return this;
    }

    public Builder dataSourceId(String dataSourceId) {
      this.dataSourceId = dataSourceId;
      return this;
    }

    public Builder version(String version) {
      this.version = version;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder updatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }


    public ItemRecord build() {
      return new ItemRecord(this);
    }
  }
}
