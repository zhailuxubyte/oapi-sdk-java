// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.block.v2.model;

import com.google.gson.annotations.SerializedName;

public class Entity {

  @SerializedName("block_id")
  private String blockId;
  @SerializedName("title")
  private String title;
  @SerializedName("block_type_id")
  private String blockTypeId;
  @SerializedName("source_data")
  private String sourceData;
  @SerializedName("source_meta")
  private String sourceMeta;
  @SerializedName("version")
  private Long version;
  @SerializedName("source_link")
  private String sourceLink;
  @SerializedName("summary")
  private String summary;
  @SerializedName("preview")
  private String preview;
  @SerializedName("i18n_summay")
  private String i18nSummay;
  @SerializedName("i18n_preview")
  private String i18nPreview;
  @SerializedName("owner")
  private String owner;
  @SerializedName("extra")
  private String extra;

  // builder 开始
  public Entity() {
  }

  public Entity(Builder builder) {
    this.blockId = builder.blockId;
    this.title = builder.title;
    this.blockTypeId = builder.blockTypeId;
    this.sourceData = builder.sourceData;
    this.sourceMeta = builder.sourceMeta;
    this.version = builder.version;
    this.sourceLink = builder.sourceLink;
    this.summary = builder.summary;
    this.preview = builder.preview;
    this.i18nSummay = builder.i18nSummay;
    this.i18nPreview = builder.i18nPreview;
    this.owner = builder.owner;
    this.extra = builder.extra;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getBlockId() {
    return this.blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBlockTypeId() {
    return this.blockTypeId;
  }

  public void setBlockTypeId(String blockTypeId) {
    this.blockTypeId = blockTypeId;
  }

  public String getSourceData() {
    return this.sourceData;
  }

  public void setSourceData(String sourceData) {
    this.sourceData = sourceData;
  }

  public String getSourceMeta() {
    return this.sourceMeta;
  }

  public void setSourceMeta(String sourceMeta) {
    this.sourceMeta = sourceMeta;
  }

  public Long getVersion() {
    return this.version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public String getSourceLink() {
    return this.sourceLink;
  }

  public void setSourceLink(String sourceLink) {
    this.sourceLink = sourceLink;
  }

  public String getSummary() {
    return this.summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getPreview() {
    return this.preview;
  }

  public void setPreview(String preview) {
    this.preview = preview;
  }

  public String getI18nSummay() {
    return this.i18nSummay;
  }

  public void setI18nSummay(String i18nSummay) {
    this.i18nSummay = i18nSummay;
  }

  public String getI18nPreview() {
    return this.i18nPreview;
  }

  public void setI18nPreview(String i18nPreview) {
    this.i18nPreview = i18nPreview;
  }

  public String getOwner() {
    return this.owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public static class Builder {

    private String blockId;
    private String title;
    private String blockTypeId;
    private String sourceData;
    private String sourceMeta;
    private Long version;
    private String sourceLink;
    private String summary;
    private String preview;
    private String i18nSummay;
    private String i18nPreview;
    private String owner;
    private String extra;

    public Builder blockId(String blockId) {
      this.blockId = blockId;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder blockTypeId(String blockTypeId) {
      this.blockTypeId = blockTypeId;
      return this;
    }

    public Builder sourceData(String sourceData) {
      this.sourceData = sourceData;
      return this;
    }

    public Builder sourceMeta(String sourceMeta) {
      this.sourceMeta = sourceMeta;
      return this;
    }

    public Builder version(Long version) {
      this.version = version;
      return this;
    }

    public Builder sourceLink(String sourceLink) {
      this.sourceLink = sourceLink;
      return this;
    }

    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    public Builder preview(String preview) {
      this.preview = preview;
      return this;
    }

    public Builder i18nSummay(String i18nSummay) {
      this.i18nSummay = i18nSummay;
      return this;
    }

    public Builder i18nPreview(String i18nPreview) {
      this.i18nPreview = i18nPreview;
      return this;
    }

    public Builder owner(String owner) {
      this.owner = owner;
      return this;
    }

    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }


    public Entity build() {
      return new Entity(this);
    }
  }
}
