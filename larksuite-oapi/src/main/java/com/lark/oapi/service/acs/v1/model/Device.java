// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.acs.v1.model;

import com.google.gson.annotations.SerializedName;

public class Device {

  @SerializedName("device_id")
  private Long deviceId;
  @SerializedName("device_name")
  private String deviceName;
  @SerializedName("device_sn")
  private String deviceSn;

  // builder 开始
  public Device() {
  }

  public Device(Builder builder) {
    this.deviceId = builder.deviceId;
    this.deviceName = builder.deviceName;
    this.deviceSn = builder.deviceSn;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getDeviceId() {
    return this.deviceId;
  }

  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }

  public String getDeviceName() {
    return this.deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public String getDeviceSn() {
    return this.deviceSn;
  }

  public void setDeviceSn(String deviceSn) {
    this.deviceSn = deviceSn;
  }

  public static class Builder {

    private Long deviceId;
    private String deviceName;
    private String deviceSn;

    public Builder deviceId(Long deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    public Builder deviceName(String deviceName) {
      this.deviceName = deviceName;
      return this;
    }

    public Builder deviceSn(String deviceSn) {
      this.deviceSn = deviceSn;
      return this;
    }


    public Device build() {
      return new Device(this);
    }
  }
}
