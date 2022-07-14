// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class EventTime {

  @SerializedName("time_stamp")
  private String timeStamp;

  // builder 开始
  public EventTime() {
  }

  public EventTime(Builder builder) {
    this.timeStamp = builder.timeStamp;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTimeStamp() {
    return this.timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public static class Builder {

    private String timeStamp;

    public Builder timeStamp(String timeStamp) {
      this.timeStamp = timeStamp;
      return this;
    }


    public EventTime build() {
      return new EventTime(this);
    }
  }
}
