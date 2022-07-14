// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditPcContext {

  @SerializedName("udid")
  private String udid;
  @SerializedName("did")
  private String did;
  @SerializedName("app_ver")
  private String appVer;
  @SerializedName("ver")
  private String ver;
  @SerializedName("os")
  private String os;
  @SerializedName("wifip")
  private String wifip;
  @SerializedName("region")
  private String region;
  @SerializedName("IP")
  private String iP;

  // builder 开始
  public AuditPcContext() {
  }

  public AuditPcContext(Builder builder) {
    this.udid = builder.udid;
    this.did = builder.did;
    this.appVer = builder.appVer;
    this.ver = builder.ver;
    this.os = builder.os;
    this.wifip = builder.wifip;
    this.region = builder.region;
    this.iP = builder.iP;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUdid() {
    return this.udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public String getDid() {
    return this.did;
  }

  public void setDid(String did) {
    this.did = did;
  }

  public String getAppVer() {
    return this.appVer;
  }

  public void setAppVer(String appVer) {
    this.appVer = appVer;
  }

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public String getOs() {
    return this.os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getWifip() {
    return this.wifip;
  }

  public void setWifip(String wifip) {
    this.wifip = wifip;
  }

  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getIP() {
    return this.iP;
  }

  public void setIP(String iP) {
    this.iP = iP;
  }

  public static class Builder {

    private String udid;
    private String did;
    private String appVer;
    private String ver;
    private String os;
    private String wifip;
    private String region;
    private String iP;

    public Builder udid(String udid) {
      this.udid = udid;
      return this;
    }

    public Builder did(String did) {
      this.did = did;
      return this;
    }

    public Builder appVer(String appVer) {
      this.appVer = appVer;
      return this;
    }

    public Builder ver(String ver) {
      this.ver = ver;
      return this;
    }

    public Builder os(String os) {
      this.os = os;
      return this;
    }

    public Builder wifip(String wifip) {
      this.wifip = wifip;
      return this;
    }

    public Builder region(String region) {
      this.region = region;
      return this;
    }

    public Builder iP(String iP) {
      this.iP = iP;
      return this;
    }


    public AuditPcContext build() {
      return new AuditPcContext(this);
    }
  }
}
