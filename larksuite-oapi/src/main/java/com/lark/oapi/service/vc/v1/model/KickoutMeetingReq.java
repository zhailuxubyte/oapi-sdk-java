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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class KickoutMeetingReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("meeting_id")
  private String meetingId;
  @Body
  private KickoutMeetingReqBody body;

  // builder 开始
  public KickoutMeetingReq() {
  }

  public KickoutMeetingReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.meetingId = builder.meetingId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getMeetingId() {
    return this.meetingId;
  }

  public void setMeetingId(String meetingId) {
    this.meetingId = meetingId;
  }

  public KickoutMeetingReqBody getKickoutMeetingReqBody() {
    return this.body;
  }

  public void setKickoutMeetingReqBody(KickoutMeetingReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private String meetingId;
    private KickoutMeetingReqBody body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.vc.v1.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder meetingId(String meetingId) {
      this.meetingId = meetingId;
      return this;
    }

    public KickoutMeetingReqBody getKickoutMeetingReqBody() {
      return this.body;
    }

    public Builder kickoutMeetingReqBody(KickoutMeetingReqBody body) {
      this.body = body;
      return this;
    }

    public KickoutMeetingReq build() {
      return new KickoutMeetingReq(this);
    }
  }
}
