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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetActiveMeetingReserveReq {

  @Query
  @SerializedName("with_participants")
  private Boolean withParticipants;
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("reserve_id")
  private Long reserveId;

  // builder 开始
  public GetActiveMeetingReserveReq() {
  }

  public GetActiveMeetingReserveReq(Builder builder) {
    this.withParticipants = builder.withParticipants;
    this.userIdType = builder.userIdType;
    this.reserveId = builder.reserveId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Boolean getWithParticipants() {
    return this.withParticipants;
  }

  public void setWithParticipants(Boolean withParticipants) {
    this.withParticipants = withParticipants;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public Long getReserveId() {
    return this.reserveId;
  }

  public void setReserveId(Long reserveId) {
    this.reserveId = reserveId;
  }

  public static class Builder {

    private Boolean withParticipants;
    private String userIdType;
    private Long reserveId;

    public Builder withParticipants(Boolean withParticipants) {
      this.withParticipants = withParticipants;
      return this;
    }

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.vc.v1.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder reserveId(Long reserveId) {
      this.reserveId = reserveId;
      return this;
    }

    public GetActiveMeetingReserveReq build() {
      return new GetActiveMeetingReserveReq(this);
    }
  }
}
