// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class SetPermissionMeetingRecordingReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("meeting_id")
  private Long meetingId;
  @Body
  private SetPermissionMeetingRecordingReqBody body;

  // builder 开始
  public SetPermissionMeetingRecordingReq() {
  }

  public SetPermissionMeetingRecordingReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.meetingId = builder.meetingId;
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

  public Long getMeetingId() {
    return this.meetingId;
  }

  public void setMeetingId(Long meetingId) {
    this.meetingId = meetingId;
  }

  public SetPermissionMeetingRecordingReqBody getSetPermissionMeetingRecordingReqBody() {
    return this.body;
  }

  public void setSetPermissionMeetingRecordingReqBody(SetPermissionMeetingRecordingReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private Long meetingId;
    private SetPermissionMeetingRecordingReqBody body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.vc.v1.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder meetingId(Long meetingId) {
      this.meetingId = meetingId;
      return this;
    }

    public SetPermissionMeetingRecordingReqBody getSetPermissionMeetingRecordingReqBody() {
      return this.body;
    }

    public Builder setPermissionMeetingRecordingReqBody(SetPermissionMeetingRecordingReqBody body) {
      this.body = body;
      return this;
    }

    public SetPermissionMeetingRecordingReq build() {
      return new SetPermissionMeetingRecordingReq(this);
    }
  }
}
