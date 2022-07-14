// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteTimeoffEventReq {

  @Path
  @SerializedName("timeoff_event_id")
  private String timeoffEventId;

  // builder 开始
  public DeleteTimeoffEventReq() {
  }

  public DeleteTimeoffEventReq(Builder builder) {
    this.timeoffEventId = builder.timeoffEventId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTimeoffEventId() {
    return this.timeoffEventId;
  }

  public void setTimeoffEventId(String timeoffEventId) {
    this.timeoffEventId = timeoffEventId;
  }

  public static class Builder {

    private String timeoffEventId;

    public Builder timeoffEventId(String timeoffEventId) {
      this.timeoffEventId = timeoffEventId;
      return this;
    }

    public DeleteTimeoffEventReq build() {
      return new DeleteTimeoffEventReq(this);
    }
  }
}
