// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class UserStatsField {

  @SerializedName("stats_type")
  private String statsType;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("fields")
  private Field[] fields;

  // builder 开始
  public UserStatsField() {
  }

  public UserStatsField(Builder builder) {
    this.statsType = builder.statsType;
    this.userId = builder.userId;
    this.fields = builder.fields;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getStatsType() {
    return this.statsType;
  }

  public void setStatsType(String statsType) {
    this.statsType = statsType;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Field[] getFields() {
    return this.fields;
  }

  public void setFields(Field[] fields) {
    this.fields = fields;
  }

  public static class Builder {

    private String statsType;
    private String userId;
    private Field[] fields;

    public Builder statsType(String statsType) {
      this.statsType = statsType;
      return this;
    }

    public Builder statsType(com.lark.oapi.service.attendance.v1.enums.StatsTypeEnum statsType) {
      this.statsType = statsType.getValue();
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder fields(Field[] fields) {
      this.fields = fields;
      return this;
    }


    public UserStatsField build() {
      return new UserStatsField(this);
    }
  }
}
