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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class PatchFileSubscriptionReq {

  @Path
  @SerializedName("file_token")
  private String fileToken;
  @Path
  @SerializedName("subscription_id")
  private String subscriptionId;
  @Body
  private PatchFileSubscriptionReqBody body;

  // builder 开始
  public PatchFileSubscriptionReq() {
  }

  public PatchFileSubscriptionReq(Builder builder) {
    this.fileToken = builder.fileToken;
    this.subscriptionId = builder.subscriptionId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFileToken() {
    return this.fileToken;
  }

  public void setFileToken(String fileToken) {
    this.fileToken = fileToken;
  }

  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public PatchFileSubscriptionReqBody getPatchFileSubscriptionReqBody() {
    return this.body;
  }

  public void setPatchFileSubscriptionReqBody(PatchFileSubscriptionReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String fileToken;
    private String subscriptionId;
    private PatchFileSubscriptionReqBody body;

    public Builder fileToken(String fileToken) {
      this.fileToken = fileToken;
      return this;
    }

    public Builder subscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
      return this;
    }

    public PatchFileSubscriptionReqBody getPatchFileSubscriptionReqBody() {
      return this.body;
    }

    public Builder patchFileSubscriptionReqBody(PatchFileSubscriptionReqBody body) {
      this.body = body;
      return this;
    }

    public PatchFileSubscriptionReq build() {
      return new PatchFileSubscriptionReq(this);
    }
  }
}
