// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class BatchRemoveGroupMemberReqBody {

  @SerializedName("members")
  private Memberlist[] members;

  // builder 开始
  public BatchRemoveGroupMemberReqBody() {
  }

  public BatchRemoveGroupMemberReqBody(Builder builder) {
    this.members = builder.members;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Memberlist[] getMembers() {
    return this.members;
  }

  public void setMembers(Memberlist[] members) {
    this.members = members;
  }

  public static class Builder {

    private Memberlist[] members;

    public Builder members(Memberlist[] members) {
      this.members = members;
      return this;
    }


    public BatchRemoveGroupMemberReqBody build() {
      return new BatchRemoveGroupMemberReqBody(this);
    }
  }
}
