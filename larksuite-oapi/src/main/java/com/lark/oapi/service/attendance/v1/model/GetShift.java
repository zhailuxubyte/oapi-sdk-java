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

public class GetShift {

  @SerializedName("shift_id")
  private String shiftId;
  @SerializedName("shift_name")
  private String shiftName;
  @SerializedName("punch_times")
  private Integer punchTimes;
  @SerializedName("is_flexible")
  private Boolean isFlexible;
  @SerializedName("flexible_minutes")
  private Integer flexibleMinutes;
  @SerializedName("no_need_off")
  private Boolean noNeedOff;
  @SerializedName("punch_time_rule")
  private PunchTimeRule[] punchTimeRule;
  @SerializedName("late_off_late_on_rule")
  private LateOffLateOnRule[] lateOffLateOnRule;
  @SerializedName("rest_time_rule")
  private RestRule[] restTimeRule;

  public String getShiftId() {
    return this.shiftId;
  }

  public void setShiftId(String shiftId) {
    this.shiftId = shiftId;
  }

  public String getShiftName() {
    return this.shiftName;
  }

  public void setShiftName(String shiftName) {
    this.shiftName = shiftName;
  }

  public Integer getPunchTimes() {
    return this.punchTimes;
  }

  public void setPunchTimes(Integer punchTimes) {
    this.punchTimes = punchTimes;
  }

  public Boolean getIsFlexible() {
    return this.isFlexible;
  }

  public void setIsFlexible(Boolean isFlexible) {
    this.isFlexible = isFlexible;
  }

  public Integer getFlexibleMinutes() {
    return this.flexibleMinutes;
  }

  public void setFlexibleMinutes(Integer flexibleMinutes) {
    this.flexibleMinutes = flexibleMinutes;
  }

  public Boolean getNoNeedOff() {
    return this.noNeedOff;
  }

  public void setNoNeedOff(Boolean noNeedOff) {
    this.noNeedOff = noNeedOff;
  }

  public PunchTimeRule[] getPunchTimeRule() {
    return this.punchTimeRule;
  }

  public void setPunchTimeRule(PunchTimeRule[] punchTimeRule) {
    this.punchTimeRule = punchTimeRule;
  }

  public LateOffLateOnRule[] getLateOffLateOnRule() {
    return this.lateOffLateOnRule;
  }

  public void setLateOffLateOnRule(LateOffLateOnRule[] lateOffLateOnRule) {
    this.lateOffLateOnRule = lateOffLateOnRule;
  }

  public RestRule[] getRestTimeRule() {
    return this.restTimeRule;
  }

  public void setRestTimeRule(RestRule[] restTimeRule) {
    this.restTimeRule = restTimeRule;
  }

}
