// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.ehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class ContractCompany {

  @SerializedName("id")
  private Long id;
  @SerializedName("name")
  private String name;

  // builder 开始
  public ContractCompany() {
  }

  public ContractCompany(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static class Builder {

    private Long id;
    private String name;

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }


    public ContractCompany build() {
      return new ContractCompany(this);
    }
  }
}
