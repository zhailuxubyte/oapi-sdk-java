// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.ehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class EmergencyContact {

  @SerializedName("name")
  private String name;
  @SerializedName("relationship")
  private Integer relationship;
  @SerializedName("mobile")
  private String mobile;

  // builder 开始
  public EmergencyContact() {
  }

  public EmergencyContact(Builder builder) {
    this.name = builder.name;
    this.relationship = builder.relationship;
    this.mobile = builder.mobile;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getRelationship() {
    return this.relationship;
  }

  public void setRelationship(Integer relationship) {
    this.relationship = relationship;
  }

  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public static class Builder {

    private String name;
    private Integer relationship;
    private String mobile;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder relationship(Integer relationship) {
      this.relationship = relationship;
      return this;
    }

    public Builder relationship(com.lark.oapi.service.ehr.v1.enums.RelationshipEnum relationship) {
      this.relationship = relationship.getValue();
      return this;
    }

    public Builder mobile(String mobile) {
      this.mobile = mobile;
      return this;
    }


    public EmergencyContact build() {
      return new EmergencyContact(this);
    }
  }
}
