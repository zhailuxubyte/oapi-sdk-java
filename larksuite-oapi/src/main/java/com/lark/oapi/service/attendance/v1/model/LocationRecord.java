// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class LocationRecord {

  @SerializedName("user_id")
  private UserId userId;
  @SerializedName("timestamp")
  private String timestamp;
  @SerializedName("location")
  private LocationInfoEvent location;
  @SerializedName("wifi")
  private WifiInfoEvent wifi;
  @SerializedName("rule_snapshot_id")
  private String ruleSnapshotId;
  @SerializedName("type")
  private String type;
  @SerializedName("scan_wifi_list")
  private ScanWifiInfo[] scanWifiList;
  @SerializedName("device_id")
  private String deviceId;
  @SerializedName("client_info")
  private String clientInfo;

  // builder 开始
  public LocationRecord() {
  }

  public LocationRecord(Builder builder) {
    this.userId = builder.userId;
    this.timestamp = builder.timestamp;
    this.location = builder.location;
    this.wifi = builder.wifi;
    this.ruleSnapshotId = builder.ruleSnapshotId;
    this.type = builder.type;
    this.scanWifiList = builder.scanWifiList;
    this.deviceId = builder.deviceId;
    this.clientInfo = builder.clientInfo;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public UserId getUserId() {
    return this.userId;
  }

  public void setUserId(UserId userId) {
    this.userId = userId;
  }

  public String getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public LocationInfoEvent getLocation() {
    return this.location;
  }

  public void setLocation(LocationInfoEvent location) {
    this.location = location;
  }

  public WifiInfoEvent getWifi() {
    return this.wifi;
  }

  public void setWifi(WifiInfoEvent wifi) {
    this.wifi = wifi;
  }

  public String getRuleSnapshotId() {
    return this.ruleSnapshotId;
  }

  public void setRuleSnapshotId(String ruleSnapshotId) {
    this.ruleSnapshotId = ruleSnapshotId;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ScanWifiInfo[] getScanWifiList() {
    return this.scanWifiList;
  }

  public void setScanWifiList(ScanWifiInfo[] scanWifiList) {
    this.scanWifiList = scanWifiList;
  }

  public String getDeviceId() {
    return this.deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public String getClientInfo() {
    return this.clientInfo;
  }

  public void setClientInfo(String clientInfo) {
    this.clientInfo = clientInfo;
  }

  public static class Builder {

    private UserId userId;
    private String timestamp;
    private LocationInfoEvent location;
    private WifiInfoEvent wifi;
    private String ruleSnapshotId;
    private String type;
    private ScanWifiInfo[] scanWifiList;
    private String deviceId;
    private String clientInfo;

    public Builder userId(UserId userId) {
      this.userId = userId;
      return this;
    }

    public Builder timestamp(String timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder location(LocationInfoEvent location) {
      this.location = location;
      return this;
    }

    public Builder wifi(WifiInfoEvent wifi) {
      this.wifi = wifi;
      return this;
    }

    public Builder ruleSnapshotId(String ruleSnapshotId) {
      this.ruleSnapshotId = ruleSnapshotId;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }

    public Builder scanWifiList(ScanWifiInfo[] scanWifiList) {
      this.scanWifiList = scanWifiList;
      return this;
    }

    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    public Builder clientInfo(String clientInfo) {
      this.clientInfo = clientInfo;
      return this;
    }


    public LocationRecord build() {
      return new LocationRecord(this);
    }
  }
}
