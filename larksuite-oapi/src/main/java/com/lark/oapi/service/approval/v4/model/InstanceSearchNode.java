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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class InstanceSearchNode {

  @SerializedName("code")
  private String code;
  @SerializedName("external_id")
  private String externalId;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("start_time")
  private Long startTime;
  @SerializedName("end_time")
  private Long endTime;
  @SerializedName("status")
  private String status;
  @SerializedName("title")
  private String title;
  @SerializedName("extra")
  private String extra;
  @SerializedName("serial_id")
  private String serialId;
  @SerializedName("link")
  private InstanceSearchLink link;

  // builder 开始
  public InstanceSearchNode() {
  }

  public InstanceSearchNode(Builder builder) {
    this.code = builder.code;
    this.externalId = builder.externalId;
    this.userId = builder.userId;
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.status = builder.status;
    this.title = builder.title;
    this.extra = builder.extra;
    this.serialId = builder.serialId;
    this.link = builder.link;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Long getStartTime() {
    return this.startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public Long getEndTime() {
    return this.endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public String getSerialId() {
    return this.serialId;
  }

  public void setSerialId(String serialId) {
    this.serialId = serialId;
  }

  public InstanceSearchLink getLink() {
    return this.link;
  }

  public void setLink(InstanceSearchLink link) {
    this.link = link;
  }

  public static class Builder {

    private String code;
    private String externalId;
    private String userId;
    private Long startTime;
    private Long endTime;
    private String status;
    private String title;
    private String extra;
    private String serialId;
    private InstanceSearchLink link;

    public Builder code(String code) {
      this.code = code;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder startTime(Long startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(Long endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public Builder status(com.lark.oapi.service.approval.v4.enums.StatusEnum status) {
      this.status = status.getValue();
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }

    public Builder serialId(String serialId) {
      this.serialId = serialId;
      return this;
    }

    public Builder link(InstanceSearchLink link) {
      this.link = link;
      return this;
    }


    public InstanceSearchNode build() {
      return new InstanceSearchNode(this);
    }
  }
}
