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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class BatchGetIdUserReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Body
  private BatchGetIdUserReqBody body;

  // builder 开始
  public BatchGetIdUserReq() {
  }

  public BatchGetIdUserReq(Builder builder) {
    this.userIdType = builder.userIdType;
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

  public BatchGetIdUserReqBody getBatchGetIdUserReqBody() {
    return this.body;
  }

  public void setBatchGetIdUserReqBody(BatchGetIdUserReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private BatchGetIdUserReqBody body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.contact.v3.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public BatchGetIdUserReqBody getBatchGetIdUserReqBody() {
      return this.body;
    }

    public Builder batchGetIdUserReqBody(BatchGetIdUserReqBody body) {
      this.body = body;
      return this;
    }

    public BatchGetIdUserReq build() {
      return new BatchGetIdUserReq(this);
    }
  }
}
