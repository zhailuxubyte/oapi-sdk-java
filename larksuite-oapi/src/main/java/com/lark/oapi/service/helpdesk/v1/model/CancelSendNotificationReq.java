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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class CancelSendNotificationReq {

  @Path
  @SerializedName("notification_id")
  private String notificationId;
  @Body
  private CancelSendNotificationReqBody body;

  // builder 开始
  public CancelSendNotificationReq() {
  }

  public CancelSendNotificationReq(Builder builder) {
    this.notificationId = builder.notificationId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getNotificationId() {
    return this.notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public CancelSendNotificationReqBody getCancelSendNotificationReqBody() {
    return this.body;
  }

  public void setCancelSendNotificationReqBody(CancelSendNotificationReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String notificationId;
    private CancelSendNotificationReqBody body;

    public Builder notificationId(String notificationId) {
      this.notificationId = notificationId;
      return this;
    }

    public CancelSendNotificationReqBody getCancelSendNotificationReqBody() {
      return this.body;
    }

    public Builder cancelSendNotificationReqBody(CancelSendNotificationReqBody body) {
      this.body = body;
      return this;
    }

    public CancelSendNotificationReq build() {
      return new CancelSendNotificationReq(this);
    }
  }
}
