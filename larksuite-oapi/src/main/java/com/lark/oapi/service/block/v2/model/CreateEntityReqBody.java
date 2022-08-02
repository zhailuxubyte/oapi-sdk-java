// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.block.v2.model;

import com.google.gson.annotations.SerializedName;

public class CreateEntityReqBody {

  @SerializedName("title")
  private String title;
  @SerializedName("block_type_id")
  private String blockTypeId;
  @SerializedName("source_data")
  private String sourceData;
  @SerializedName("source_meta")
  private String sourceMeta;
  @SerializedName("version")
  private String version;
  @SerializedName("source_link")
  private String sourceLink;
  @SerializedName("owner")
  private String owner;
  @SerializedName("extra")
  private String extra;
  @SerializedName("i18n_summary")
  private String i18nSummary;
  @SerializedName("i18n_preview")
  private String i18nPreview;
  @SerializedName("summary")
  private String summary;
  @SerializedName("preview")
  private String preview;

  // builder 开始
  public CreateEntityReqBody() {
  }

  public CreateEntityReqBody(Builder builder) {
    this.title = builder.title;
    this.blockTypeId = builder.blockTypeId;
    this.sourceData = builder.sourceData;
    this.sourceMeta = builder.sourceMeta;
    this.version = builder.version;
    this.sourceLink = builder.sourceLink;
    this.owner = builder.owner;
    this.extra = builder.extra;
    this.i18nSummary = builder.i18nSummary;
    this.i18nPreview = builder.i18nPreview;
    this.summary = builder.summary;
    this.preview = builder.preview;
  }

  public static Builder newBuilder() {
    return new Builder();
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

  public String getVersion() {
    return this.version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getSourceLink() {
    return this.sourceLink;
  }

  public void setSourceLink(String sourceLink) {
    this.sourceLink = sourceLink;
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

  public String getI18nSummary() {
    return this.i18nSummary;
  }

  public void setI18nSummary(String i18nSummary) {
    this.i18nSummary = i18nSummary;
  }

  public String getI18nPreview() {
    return this.i18nPreview;
  }

  public void setI18nPreview(String i18nPreview) {
    this.i18nPreview = i18nPreview;
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

  public static class Builder {

    private String title;
    private String blockTypeId;
    private String sourceData;
    private String sourceMeta;
    private String version;
    private String sourceLink;
    private String owner;
    private String extra;
    private String i18nSummary;
    private String i18nPreview;
    private String summary;
    private String preview;

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

    public Builder version(String version) {
      this.version = version;
      return this;
    }

    public Builder sourceLink(String sourceLink) {
      this.sourceLink = sourceLink;
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

    public Builder i18nSummary(String i18nSummary) {
      this.i18nSummary = i18nSummary;
      return this;
    }

    public Builder i18nPreview(String i18nPreview) {
      this.i18nPreview = i18nPreview;
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


    public CreateEntityReqBody build() {
      return new CreateEntityReqBody(this);
    }
  }
}
