// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class SetHostMeetingDTO {

  @SerializedName("host_user")
  private MeetingUser hostUser;

  public MeetingUser getHostUser() {
    return this.hostUser;
  }

  public void setHostUser(MeetingUser hostUser) {
    this.hostUser = hostUser;
  }

}
