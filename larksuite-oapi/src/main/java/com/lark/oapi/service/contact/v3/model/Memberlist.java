// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class Memberlist {

  @SerializedName("member_id")
  private String memberId;
  @SerializedName("member_type")
  private String memberType;
  @SerializedName("member_id_type")
  private String memberIdType;

  // builder 开始
  public Memberlist() {
  }

  public Memberlist(Builder builder) {
    this.memberId = builder.memberId;
    this.memberType = builder.memberType;
    this.memberIdType = builder.memberIdType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMemberId() {
    return this.memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getMemberType() {
    return this.memberType;
  }

  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }

  public String getMemberIdType() {
    return this.memberIdType;
  }

  public void setMemberIdType(String memberIdType) {
    this.memberIdType = memberIdType;
  }

  public static class Builder {

    private String memberId;
    private String memberType;
    private String memberIdType;

    public Builder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    public Builder memberType(String memberType) {
      this.memberType = memberType;
      return this;
    }

    public Builder memberIdType(String memberIdType) {
      this.memberIdType = memberIdType;
      return this;
    }


    public Memberlist build() {
      return new Memberlist(this);
    }
  }
}
