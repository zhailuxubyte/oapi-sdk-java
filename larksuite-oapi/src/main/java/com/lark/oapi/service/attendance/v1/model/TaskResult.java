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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class TaskResult {

  @SerializedName("check_in_record_id")
  private String checkInRecordId;
  @SerializedName("check_in_record")
  private UserFlow checkInRecord;
  @SerializedName("check_out_record_id")
  private String checkOutRecordId;
  @SerializedName("check_out_record")
  private UserFlow checkOutRecord;
  @SerializedName("check_in_result")
  private String checkInResult;
  @SerializedName("check_out_result")
  private String checkOutResult;
  @SerializedName("check_in_result_supplement")
  private String checkInResultSupplement;
  @SerializedName("check_out_result_supplement")
  private String checkOutResultSupplement;
  @SerializedName("check_in_shift_time")
  private String checkInShiftTime;
  @SerializedName("check_out_shift_time")
  private String checkOutShiftTime;

  // builder 开始
  public TaskResult() {
  }

  public TaskResult(Builder builder) {
    this.checkInRecordId = builder.checkInRecordId;
    this.checkInRecord = builder.checkInRecord;
    this.checkOutRecordId = builder.checkOutRecordId;
    this.checkOutRecord = builder.checkOutRecord;
    this.checkInResult = builder.checkInResult;
    this.checkOutResult = builder.checkOutResult;
    this.checkInResultSupplement = builder.checkInResultSupplement;
    this.checkOutResultSupplement = builder.checkOutResultSupplement;
    this.checkInShiftTime = builder.checkInShiftTime;
    this.checkOutShiftTime = builder.checkOutShiftTime;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCheckInRecordId() {
    return this.checkInRecordId;
  }

  public void setCheckInRecordId(String checkInRecordId) {
    this.checkInRecordId = checkInRecordId;
  }

  public UserFlow getCheckInRecord() {
    return this.checkInRecord;
  }

  public void setCheckInRecord(UserFlow checkInRecord) {
    this.checkInRecord = checkInRecord;
  }

  public String getCheckOutRecordId() {
    return this.checkOutRecordId;
  }

  public void setCheckOutRecordId(String checkOutRecordId) {
    this.checkOutRecordId = checkOutRecordId;
  }

  public UserFlow getCheckOutRecord() {
    return this.checkOutRecord;
  }

  public void setCheckOutRecord(UserFlow checkOutRecord) {
    this.checkOutRecord = checkOutRecord;
  }

  public String getCheckInResult() {
    return this.checkInResult;
  }

  public void setCheckInResult(String checkInResult) {
    this.checkInResult = checkInResult;
  }

  public String getCheckOutResult() {
    return this.checkOutResult;
  }

  public void setCheckOutResult(String checkOutResult) {
    this.checkOutResult = checkOutResult;
  }

  public String getCheckInResultSupplement() {
    return this.checkInResultSupplement;
  }

  public void setCheckInResultSupplement(String checkInResultSupplement) {
    this.checkInResultSupplement = checkInResultSupplement;
  }

  public String getCheckOutResultSupplement() {
    return this.checkOutResultSupplement;
  }

  public void setCheckOutResultSupplement(String checkOutResultSupplement) {
    this.checkOutResultSupplement = checkOutResultSupplement;
  }

  public String getCheckInShiftTime() {
    return this.checkInShiftTime;
  }

  public void setCheckInShiftTime(String checkInShiftTime) {
    this.checkInShiftTime = checkInShiftTime;
  }

  public String getCheckOutShiftTime() {
    return this.checkOutShiftTime;
  }

  public void setCheckOutShiftTime(String checkOutShiftTime) {
    this.checkOutShiftTime = checkOutShiftTime;
  }

  public static class Builder {

    private String checkInRecordId;
    private UserFlow checkInRecord;
    private String checkOutRecordId;
    private UserFlow checkOutRecord;
    private String checkInResult;
    private String checkOutResult;
    private String checkInResultSupplement;
    private String checkOutResultSupplement;
    private String checkInShiftTime;
    private String checkOutShiftTime;

    public Builder checkInRecordId(String checkInRecordId) {
      this.checkInRecordId = checkInRecordId;
      return this;
    }

    public Builder checkInRecord(UserFlow checkInRecord) {
      this.checkInRecord = checkInRecord;
      return this;
    }

    public Builder checkOutRecordId(String checkOutRecordId) {
      this.checkOutRecordId = checkOutRecordId;
      return this;
    }

    public Builder checkOutRecord(UserFlow checkOutRecord) {
      this.checkOutRecord = checkOutRecord;
      return this;
    }

    public Builder checkInResult(String checkInResult) {
      this.checkInResult = checkInResult;
      return this;
    }

    public Builder checkInResult(
        com.lark.oapi.service.attendance.v1.enums.CheckInResultEnum checkInResult) {
      this.checkInResult = checkInResult.getValue();
      return this;
    }

    public Builder checkOutResult(String checkOutResult) {
      this.checkOutResult = checkOutResult;
      return this;
    }

    public Builder checkOutResult(
        com.lark.oapi.service.attendance.v1.enums.CheckOutResultEnum checkOutResult) {
      this.checkOutResult = checkOutResult.getValue();
      return this;
    }

    public Builder checkInResultSupplement(String checkInResultSupplement) {
      this.checkInResultSupplement = checkInResultSupplement;
      return this;
    }

    public Builder checkInResultSupplement(
        com.lark.oapi.service.attendance.v1.enums.CheckInResultSupplementEnum checkInResultSupplement) {
      this.checkInResultSupplement = checkInResultSupplement.getValue();
      return this;
    }

    public Builder checkOutResultSupplement(String checkOutResultSupplement) {
      this.checkOutResultSupplement = checkOutResultSupplement;
      return this;
    }

    public Builder checkOutResultSupplement(
        com.lark.oapi.service.attendance.v1.enums.CheckOutResultSupplementEnum checkOutResultSupplement) {
      this.checkOutResultSupplement = checkOutResultSupplement.getValue();
      return this;
    }

    public Builder checkInShiftTime(String checkInShiftTime) {
      this.checkInShiftTime = checkInShiftTime;
      return this;
    }

    public Builder checkOutShiftTime(String checkOutShiftTime) {
      this.checkOutShiftTime = checkOutShiftTime;
      return this;
    }


    public TaskResult build() {
      return new TaskResult(this);
    }
  }
}
