// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class WifiInfoEvent {

  @SerializedName("ssid")
  private String ssid;
  @SerializedName("bssid")
  private String bssid;
  @SerializedName("lastssid")
  private String lastssid;
  @SerializedName("lastbssid")
  private String lastbssid;

  // builder 开始
  public WifiInfoEvent() {
  }

  public WifiInfoEvent(Builder builder) {
    this.ssid = builder.ssid;
    this.bssid = builder.bssid;
    this.lastssid = builder.lastssid;
    this.lastbssid = builder.lastbssid;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getSsid() {
    return this.ssid;
  }

  public void setSsid(String ssid) {
    this.ssid = ssid;
  }

  public String getBssid() {
    return this.bssid;
  }

  public void setBssid(String bssid) {
    this.bssid = bssid;
  }

  public String getLastssid() {
    return this.lastssid;
  }

  public void setLastssid(String lastssid) {
    this.lastssid = lastssid;
  }

  public String getLastbssid() {
    return this.lastbssid;
  }

  public void setLastbssid(String lastbssid) {
    this.lastbssid = lastbssid;
  }

  public static class Builder {

    private String ssid;
    private String bssid;
    private String lastssid;
    private String lastbssid;

    public Builder ssid(String ssid) {
      this.ssid = ssid;
      return this;
    }

    public Builder bssid(String bssid) {
      this.bssid = bssid;
      return this;
    }

    public Builder lastssid(String lastssid) {
      this.lastssid = lastssid;
      return this;
    }

    public Builder lastbssid(String lastbssid) {
      this.lastbssid = lastbssid;
      return this;
    }


    public WifiInfoEvent build() {
      return new WifiInfoEvent(this);
    }
  }
}
