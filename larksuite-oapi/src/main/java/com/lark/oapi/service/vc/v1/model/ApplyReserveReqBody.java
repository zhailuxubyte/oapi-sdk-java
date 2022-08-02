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

public class ApplyReserveReqBody {

  @SerializedName("end_time")
  private String endTime;
  @SerializedName("meeting_settings")
  private ReserveMeetingSetting meetingSettings;

  // builder 开始
  public ApplyReserveReqBody() {
  }

  public ApplyReserveReqBody(Builder builder) {
    this.endTime = builder.endTime;
    this.meetingSettings = builder.meetingSettings;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ReserveMeetingSetting getMeetingSettings() {
    return this.meetingSettings;
  }

  public void setMeetingSettings(ReserveMeetingSetting meetingSettings) {
    this.meetingSettings = meetingSettings;
  }

  public static class Builder {

    private String endTime;
    private ReserveMeetingSetting meetingSettings;

    public Builder endTime(String endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder meetingSettings(ReserveMeetingSetting meetingSettings) {
      this.meetingSettings = meetingSettings;
      return this;
    }


    public ApplyReserveReqBody build() {
      return new ApplyReserveReqBody(this);
    }
  }
}
