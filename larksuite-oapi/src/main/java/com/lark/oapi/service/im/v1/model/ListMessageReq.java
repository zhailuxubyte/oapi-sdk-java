// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListMessageReq {

  @Query
  @SerializedName("container_id_type")
  private String containerIdType;
  @Query
  @SerializedName("container_id")
  private String containerId;
  @Query
  @SerializedName("start_time")
  private String startTime;
  @Query
  @SerializedName("end_time")
  private String endTime;
  @Query
  @SerializedName("page_token")
  private String pageToken;
  @Query
  @SerializedName("page_size")
  private Integer pageSize;

  // builder 开始
  public ListMessageReq() {
  }

  public ListMessageReq(Builder builder) {
    this.containerIdType = builder.containerIdType;
    this.containerId = builder.containerId;
    this.startTime = builder.startTime;
    this.endTime = builder.endTime;
    this.pageToken = builder.pageToken;
    this.pageSize = builder.pageSize;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getContainerIdType() {
    return this.containerIdType;
  }

  public void setContainerIdType(String containerIdType) {
    this.containerIdType = containerIdType;
  }

  public String getContainerId() {
    return this.containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public static class Builder {

    private String containerIdType;
    private String containerId;
    private String startTime;
    private String endTime;
    private String pageToken;
    private Integer pageSize;

    public Builder containerIdType(String containerIdType) {
      this.containerIdType = containerIdType;
      return this;
    }

    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public ListMessageReq build() {
      return new ListMessageReq(this);
    }
  }
}
