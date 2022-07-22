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

package com.lark.oapi.service.passport.v1.model;

import com.google.gson.annotations.SerializedName;

public class MaskSession {

  @SerializedName("create_time")
  private Long createTime;
  @SerializedName("terminal_type")
  private Integer terminalType;
  @SerializedName("user_id")
  private String userId;

  // builder 开始
  public MaskSession() {
  }

  public MaskSession(Builder builder) {
    this.createTime = builder.createTime;
    this.terminalType = builder.terminalType;
    this.userId = builder.userId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public Integer getTerminalType() {
    return this.terminalType;
  }

  public void setTerminalType(Integer terminalType) {
    this.terminalType = terminalType;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public static class Builder {

    private Long createTime;
    private Integer terminalType;
    private String userId;

    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    public Builder terminalType(Integer terminalType) {
      this.terminalType = terminalType;
      return this;
    }

    public Builder terminalType(
        com.lark.oapi.service.passport.v1.enums.TerminalTypeEnum terminalType) {
      this.terminalType = terminalType.getValue();
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    public MaskSession build() {
      return new MaskSession(this);
    }
  }
}
