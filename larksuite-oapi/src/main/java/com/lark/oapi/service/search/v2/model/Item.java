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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class Item {

  @SerializedName("id")
  private String id;
  @SerializedName("acl")
  private Acl[] acl;
  @SerializedName("metadata")
  private ItemMetadata metadata;
  @SerializedName("structured_data")
  private String structuredData;
  @SerializedName("content")
  private ItemContent content;

  // builder 开始
  public Item() {
  }

  public Item(Builder builder) {
    this.id = builder.id;
    this.acl = builder.acl;
    this.metadata = builder.metadata;
    this.structuredData = builder.structuredData;
    this.content = builder.content;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Acl[] getAcl() {
    return this.acl;
  }

  public void setAcl(Acl[] acl) {
    this.acl = acl;
  }

  public ItemMetadata getMetadata() {
    return this.metadata;
  }

  public void setMetadata(ItemMetadata metadata) {
    this.metadata = metadata;
  }

  public String getStructuredData() {
    return this.structuredData;
  }

  public void setStructuredData(String structuredData) {
    this.structuredData = structuredData;
  }

  public ItemContent getContent() {
    return this.content;
  }

  public void setContent(ItemContent content) {
    this.content = content;
  }

  public static class Builder {

    private String id;
    private Acl[] acl;
    private ItemMetadata metadata;
    private String structuredData;
    private ItemContent content;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder acl(Acl[] acl) {
      this.acl = acl;
      return this;
    }

    public Builder metadata(ItemMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    public Builder structuredData(String structuredData) {
      this.structuredData = structuredData;
      return this;
    }

    public Builder content(ItemContent content) {
      this.content = content;
      return this;
    }


    public Item build() {
      return new Item(this);
    }
  }
}
