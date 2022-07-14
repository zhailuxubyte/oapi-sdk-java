// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class UpdateReserveReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("reserve_id")
  private Long reserveId;
  @Body
  private UpdateReserveReqBody body;

  // builder 开始
  public UpdateReserveReq() {
  }

  public UpdateReserveReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.reserveId = builder.reserveId;
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

  public Long getReserveId() {
    return this.reserveId;
  }

  public void setReserveId(Long reserveId) {
    this.reserveId = reserveId;
  }

  public UpdateReserveReqBody getUpdateReserveReqBody() {
    return this.body;
  }

  public void setUpdateReserveReqBody(UpdateReserveReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private Long reserveId;
    private UpdateReserveReqBody body;

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

    public UpdateReserveReqBody getUpdateReserveReqBody() {
      return this.body;
    }

    public Builder updateReserveReqBody(UpdateReserveReqBody body) {
      this.body = body;
      return this;
    }

    public UpdateReserveReq build() {
      return new UpdateReserveReq(this);
    }
  }
}
