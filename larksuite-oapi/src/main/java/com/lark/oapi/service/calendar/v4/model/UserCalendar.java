// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class UserCalendar {

  @SerializedName("calendar")
  private Calendar calendar;
  @SerializedName("user_id")
  private String userId;

  // builder 开始
  public UserCalendar() {
  }

  public UserCalendar(Builder builder) {
    this.calendar = builder.calendar;
    this.userId = builder.userId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Calendar getCalendar() {
    return this.calendar;
  }

  public void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public static class Builder {

    private Calendar calendar;
    private String userId;

    public Builder calendar(Calendar calendar) {
      this.calendar = calendar;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    public UserCalendar build() {
      return new UserCalendar(this);
    }
  }
}
