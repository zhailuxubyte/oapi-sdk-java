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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListByNoMeetingReq {

  @Query
  @SerializedName("meeting_no")
  private String meetingNo;
  @Query
  @SerializedName("start_time")
  private Long startTime;
  @Query
  @SerializedName("end_time")
  private Long endTime;
  @Query
  @SerializedName("page_token")
  private String pageToken;
  @Query
  @SerializedName("page_size")
  private Integer pageSize;

  // builder 开始
  public ListByNoMeetingReq() {
  }

  public ListByNoMeetingReq(Builder builder) {
    this.meetingNo = builder.meetingNo;
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.pageToken = builder.pageToken;
    this.pageSize = builder.pageSize;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMeetingNo() {
    return this.meetingNo;
  }

  public void setMeetingNo(String meetingNo) {
    this.meetingNo = meetingNo;
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

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public static class Builder {

    private String meetingNo;
    private Long startTime;
    private Long endTime;
    private String pageToken;
    private Integer pageSize;

    public Builder meetingNo(String meetingNo) {
      this.meetingNo = meetingNo;
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

    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public ListByNoMeetingReq build() {
      return new ListByNoMeetingReq(this);
    }
  }
}
