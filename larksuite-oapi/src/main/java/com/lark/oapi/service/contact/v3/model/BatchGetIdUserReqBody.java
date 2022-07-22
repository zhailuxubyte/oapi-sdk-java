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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class BatchGetIdUserReqBody {

  @SerializedName("emails")
  private String[] emails;
  @SerializedName("mobiles")
  private String[] mobiles;

  // builder 开始
  public BatchGetIdUserReqBody() {
  }

  public BatchGetIdUserReqBody(Builder builder) {
    this.emails = builder.emails;
    this.mobiles = builder.mobiles;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String[] getEmails() {
    return this.emails;
  }

  public void setEmails(String[] emails) {
    this.emails = emails;
  }

  public String[] getMobiles() {
    return this.mobiles;
  }

  public void setMobiles(String[] mobiles) {
    this.mobiles = mobiles;
  }

  public static class Builder {

    private String[] emails;
    private String[] mobiles;

    public Builder emails(String[] emails) {
      this.emails = emails;
      return this;
    }

    public Builder mobiles(String[] mobiles) {
      this.mobiles = mobiles;
      return this;
    }


    public BatchGetIdUserReqBody build() {
      return new BatchGetIdUserReqBody(this);
    }
  }
}
