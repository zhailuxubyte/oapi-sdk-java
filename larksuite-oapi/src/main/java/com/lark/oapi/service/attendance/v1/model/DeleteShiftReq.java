// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteShiftReq {

  @Path
  @SerializedName("shift_id")
  private String shiftId;

  // builder 开始
  public DeleteShiftReq() {
  }

  public DeleteShiftReq(Builder builder) {
    this.shiftId = builder.shiftId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getShiftId() {
    return this.shiftId;
  }

  public void setShiftId(String shiftId) {
    this.shiftId = shiftId;
  }

  public static class Builder {

    private String shiftId;

    public Builder shiftId(String shiftId) {
      this.shiftId = shiftId;
      return this;
    }

    public DeleteShiftReq build() {
      return new DeleteShiftReq(this);
    }
  }
}
