// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class ExternalInstanceLink {

  @SerializedName("pc_link")
  private String pcLink;
  @SerializedName("mobile_link")
  private String mobileLink;

  // builder 开始
  public ExternalInstanceLink() {
  }

  public ExternalInstanceLink(Builder builder) {
    this.pcLink = builder.pcLink;
    this.mobileLink = builder.mobileLink;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getPcLink() {
    return this.pcLink;
  }

  public void setPcLink(String pcLink) {
    this.pcLink = pcLink;
  }

  public String getMobileLink() {
    return this.mobileLink;
  }

  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

  public static class Builder {

    private String pcLink;
    private String mobileLink;

    public Builder pcLink(String pcLink) {
      this.pcLink = pcLink;
      return this;
    }

    public Builder mobileLink(String mobileLink) {
      this.mobileLink = mobileLink;
      return this;
    }


    public ExternalInstanceLink build() {
      return new ExternalInstanceLink(this);
    }
  }
}
