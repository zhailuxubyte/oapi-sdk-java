// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class MeetingParticipant {

  @SerializedName("id")
  private String id;
  @SerializedName("first_join_time")
  private Long firstJoinTime;
  @SerializedName("final_leave_time")
  private Long finalLeaveTime;
  @SerializedName("in_meeting_duration")
  private Long inMeetingDuration;
  @SerializedName("user_type")
  private Integer userType;
  @SerializedName("is_host")
  private Boolean isHost;
  @SerializedName("is_cohost")
  private Boolean isCohost;
  @SerializedName("is_external")
  private Boolean isExternal;
  @SerializedName("status")
  private Integer status;

  // builder 开始
  public MeetingParticipant() {
  }

  public MeetingParticipant(Builder builder) {
    this.id = builder.id;
    this.firstJoinTime = builder.firstJoinTime;
    this.finalLeaveTime = builder.finalLeaveTime;
    this.inMeetingDuration = builder.inMeetingDuration;
    this.userType = builder.userType;
    this.isHost = builder.isHost;
    this.isCohost = builder.isCohost;
    this.isExternal = builder.isExternal;
    this.status = builder.status;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getFirstJoinTime() {
    return this.firstJoinTime;
  }

  public void setFirstJoinTime(Long firstJoinTime) {
    this.firstJoinTime = firstJoinTime;
  }

  public Long getFinalLeaveTime() {
    return this.finalLeaveTime;
  }

  public void setFinalLeaveTime(Long finalLeaveTime) {
    this.finalLeaveTime = finalLeaveTime;
  }

  public Long getInMeetingDuration() {
    return this.inMeetingDuration;
  }

  public void setInMeetingDuration(Long inMeetingDuration) {
    this.inMeetingDuration = inMeetingDuration;
  }

  public Integer getUserType() {
    return this.userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  public Boolean getIsHost() {
    return this.isHost;
  }

  public void setIsHost(Boolean isHost) {
    this.isHost = isHost;
  }

  public Boolean getIsCohost() {
    return this.isCohost;
  }

  public void setIsCohost(Boolean isCohost) {
    this.isCohost = isCohost;
  }

  public Boolean getIsExternal() {
    return this.isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public static class Builder {

    private String id;
    private Long firstJoinTime;
    private Long finalLeaveTime;
    private Long inMeetingDuration;
    private Integer userType;
    private Boolean isHost;
    private Boolean isCohost;
    private Boolean isExternal;
    private Integer status;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder firstJoinTime(Long firstJoinTime) {
      this.firstJoinTime = firstJoinTime;
      return this;
    }

    public Builder finalLeaveTime(Long finalLeaveTime) {
      this.finalLeaveTime = finalLeaveTime;
      return this;
    }

    public Builder inMeetingDuration(Long inMeetingDuration) {
      this.inMeetingDuration = inMeetingDuration;
      return this;
    }

    public Builder userType(Integer userType) {
      this.userType = userType;
      return this;
    }

    public Builder userType(com.lark.oapi.service.vc.v1.enums.UserTypeEnum userType) {
      this.userType = userType.getValue();
      return this;
    }

    public Builder isHost(Boolean isHost) {
      this.isHost = isHost;
      return this;
    }

    public Builder isCohost(Boolean isCohost) {
      this.isCohost = isCohost;
      return this;
    }

    public Builder isExternal(Boolean isExternal) {
      this.isExternal = isExternal;
      return this;
    }

    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    public Builder status(com.lark.oapi.service.vc.v1.enums.ParticipantStatusEnum status) {
      this.status = status.getValue();
      return this;
    }


    public MeetingParticipant build() {
      return new MeetingParticipant(this);
    }
  }
}
