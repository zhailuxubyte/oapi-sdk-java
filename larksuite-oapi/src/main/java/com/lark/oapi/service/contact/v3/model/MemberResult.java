// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class MemberResult {

  @SerializedName("member_id")
  private String memberId;
  @SerializedName("code")
  private Integer code;

  // builder 开始
  public MemberResult() {
  }

  public MemberResult(Builder builder) {
    this.memberId = builder.memberId;
    this.code = builder.code;
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

  public Integer getCode() {
    return this.code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public static class Builder {

    private String memberId;
    private Integer code;

    public Builder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    public Builder code(Integer code) {
      this.code = code;
      return this;
    }


    public MemberResult build() {
      return new MemberResult(this);
    }
  }
}
