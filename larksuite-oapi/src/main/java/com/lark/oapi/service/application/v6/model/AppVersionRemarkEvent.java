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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class AppVersionRemarkEvent {

  @SerializedName("remark")
  private String remark;
  @SerializedName("update_remark")
  private String updateRemark;
  @SerializedName("visibility")
  private AppVisibilityEvent visibility;

  // builder 开始
  public AppVersionRemarkEvent() {
  }

  public AppVersionRemarkEvent(Builder builder) {
    this.remark = builder.remark;
    this.updateRemark = builder.updateRemark;
    this.visibility = builder.visibility;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getUpdateRemark() {
    return this.updateRemark;
  }

  public void setUpdateRemark(String updateRemark) {
    this.updateRemark = updateRemark;
  }

  public AppVisibilityEvent getVisibility() {
    return this.visibility;
  }

  public void setVisibility(AppVisibilityEvent visibility) {
    this.visibility = visibility;
  }

  public static class Builder {

    private String remark;
    private String updateRemark;
    private AppVisibilityEvent visibility;

    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }

    public Builder updateRemark(String updateRemark) {
      this.updateRemark = updateRemark;
      return this;
    }

    public Builder visibility(AppVisibilityEvent visibility) {
      this.visibility = visibility;
      return this;
    }


    public AppVersionRemarkEvent build() {
      return new AppVersionRemarkEvent(this);
    }
  }
}
