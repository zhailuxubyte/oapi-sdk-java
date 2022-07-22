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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class ReservePermissionChecker {

  @SerializedName("check_field")
  private Integer checkField;
  @SerializedName("check_mode")
  private Integer checkMode;
  @SerializedName("check_list")
  private String[] checkList;

  // builder 开始
  public ReservePermissionChecker() {
  }

  public ReservePermissionChecker(Builder builder) {
    this.checkField = builder.checkField;
    this.checkMode = builder.checkMode;
    this.checkList = builder.checkList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getCheckField() {
    return this.checkField;
  }

  public void setCheckField(Integer checkField) {
    this.checkField = checkField;
  }

  public Integer getCheckMode() {
    return this.checkMode;
  }

  public void setCheckMode(Integer checkMode) {
    this.checkMode = checkMode;
  }

  public String[] getCheckList() {
    return this.checkList;
  }

  public void setCheckList(String[] checkList) {
    this.checkList = checkList;
  }

  public static class Builder {

    private Integer checkField;
    private Integer checkMode;
    private String[] checkList;

    public Builder checkField(Integer checkField) {
      this.checkField = checkField;
      return this;
    }

    public Builder checkField(com.lark.oapi.service.vc.v1.enums.PermCheckFieldEnum checkField) {
      this.checkField = checkField.getValue();
      return this;
    }

    public Builder checkMode(Integer checkMode) {
      this.checkMode = checkMode;
      return this;
    }

    public Builder checkMode(com.lark.oapi.service.vc.v1.enums.PermCheckModeEnum checkMode) {
      this.checkMode = checkMode.getValue();
      return this;
    }

    public Builder checkList(String[] checkList) {
      this.checkList = checkList;
      return this;
    }


    public ReservePermissionChecker build() {
      return new ReservePermissionChecker(this);
    }
  }
}
