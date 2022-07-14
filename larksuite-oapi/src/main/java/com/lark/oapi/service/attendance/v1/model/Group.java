// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class Group {

  @SerializedName("group_id")
  private String groupId;
  @SerializedName("group_name")
  private String groupName;
  @SerializedName("time_zone")
  private String timeZone;
  @SerializedName("bind_dept_ids")
  private String[] bindDeptIds;
  @SerializedName("except_dept_ids")
  private String[] exceptDeptIds;
  @SerializedName("bind_user_ids")
  private String[] bindUserIds;
  @SerializedName("except_user_ids")
  private String[] exceptUserIds;
  @SerializedName("group_leader_ids")
  private String[] groupLeaderIds;
  @SerializedName("allow_out_punch")
  private Boolean allowOutPunch;
  @SerializedName("allow_pc_punch")
  private Boolean allowPcPunch;
  @SerializedName("allow_remedy")
  private Boolean allowRemedy;
  @SerializedName("remedy_limit")
  private Boolean remedyLimit;
  @SerializedName("remedy_limit_count")
  private Integer remedyLimitCount;
  @SerializedName("remedy_date_limit")
  private Boolean remedyDateLimit;
  @SerializedName("remedy_date_num")
  private Integer remedyDateNum;
  @SerializedName("show_cumulative_time")
  private Boolean showCumulativeTime;
  @SerializedName("show_over_time")
  private Boolean showOverTime;
  @SerializedName("hide_staff_punch_time")
  private Boolean hideStaffPunchTime;
  @SerializedName("face_punch")
  private Boolean facePunch;
  @SerializedName("face_punch_cfg")
  private Integer facePunchCfg;
  @SerializedName("face_downgrade")
  private Boolean faceDowngrade;
  @SerializedName("replace_basic_pic")
  private Boolean replaceBasicPic;
  @SerializedName("machines")
  private Machine[] machines;
  @SerializedName("gps_range")
  private Integer gpsRange;
  @SerializedName("locations")
  private Location[] locations;
  @SerializedName("group_type")
  private Integer groupType;
  @SerializedName("punch_day_shift_ids")
  private String[] punchDayShiftIds;
  @SerializedName("free_punch_cfg")
  private FreePunchCfg freePunchCfg;
  @SerializedName("calendar_id")
  private Integer calendarId;
  @SerializedName("need_punch_special_days")
  private PunchSpecialDateShift[] needPunchSpecialDays;
  @SerializedName("no_need_punch_special_days")
  private PunchSpecialDateShift[] noNeedPunchSpecialDays;
  @SerializedName("work_day_no_punch_as_lack")
  private Boolean workDayNoPunchAsLack;
  @SerializedName("effect_now")
  private Boolean effectNow;
  @SerializedName("remedy_period_type")
  private Integer remedyPeriodType;
  @SerializedName("remedy_period_custom_date")
  private Integer remedyPeriodCustomDate;
  @SerializedName("punch_type")
  private Integer punchType;

  // builder 开始
  public Group() {
  }

  public Group(Builder builder) {
    this.groupId = builder.groupId;
    this.groupName = builder.groupName;
    this.timeZone = builder.timeZone;
    this.bindDeptIds = builder.bindDeptIds;
    this.exceptDeptIds = builder.exceptDeptIds;
    this.bindUserIds = builder.bindUserIds;
    this.exceptUserIds = builder.exceptUserIds;
    this.groupLeaderIds = builder.groupLeaderIds;
    this.allowOutPunch = builder.allowOutPunch;
    this.allowPcPunch = builder.allowPcPunch;
    this.allowRemedy = builder.allowRemedy;
    this.remedyLimit = builder.remedyLimit;
    this.remedyLimitCount = builder.remedyLimitCount;
    this.remedyDateLimit = builder.remedyDateLimit;
    this.remedyDateNum = builder.remedyDateNum;
    this.showCumulativeTime = builder.showCumulativeTime;
    this.showOverTime = builder.showOverTime;
    this.hideStaffPunchTime = builder.hideStaffPunchTime;
    this.facePunch = builder.facePunch;
    this.facePunchCfg = builder.facePunchCfg;
    this.faceDowngrade = builder.faceDowngrade;
    this.replaceBasicPic = builder.replaceBasicPic;
    this.machines = builder.machines;
    this.gpsRange = builder.gpsRange;
    this.locations = builder.locations;
    this.groupType = builder.groupType;
    this.punchDayShiftIds = builder.punchDayShiftIds;
    this.freePunchCfg = builder.freePunchCfg;
    this.calendarId = builder.calendarId;
    this.needPunchSpecialDays = builder.needPunchSpecialDays;
    this.noNeedPunchSpecialDays = builder.noNeedPunchSpecialDays;
    this.workDayNoPunchAsLack = builder.workDayNoPunchAsLack;
    this.effectNow = builder.effectNow;
    this.remedyPeriodType = builder.remedyPeriodType;
    this.remedyPeriodCustomDate = builder.remedyPeriodCustomDate;
    this.punchType = builder.punchType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getGroupId() {
    return this.groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public String getGroupName() {
    return this.groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String[] getBindDeptIds() {
    return this.bindDeptIds;
  }

  public void setBindDeptIds(String[] bindDeptIds) {
    this.bindDeptIds = bindDeptIds;
  }

  public String[] getExceptDeptIds() {
    return this.exceptDeptIds;
  }

  public void setExceptDeptIds(String[] exceptDeptIds) {
    this.exceptDeptIds = exceptDeptIds;
  }

  public String[] getBindUserIds() {
    return this.bindUserIds;
  }

  public void setBindUserIds(String[] bindUserIds) {
    this.bindUserIds = bindUserIds;
  }

  public String[] getExceptUserIds() {
    return this.exceptUserIds;
  }

  public void setExceptUserIds(String[] exceptUserIds) {
    this.exceptUserIds = exceptUserIds;
  }

  public String[] getGroupLeaderIds() {
    return this.groupLeaderIds;
  }

  public void setGroupLeaderIds(String[] groupLeaderIds) {
    this.groupLeaderIds = groupLeaderIds;
  }

  public Boolean getAllowOutPunch() {
    return this.allowOutPunch;
  }

  public void setAllowOutPunch(Boolean allowOutPunch) {
    this.allowOutPunch = allowOutPunch;
  }

  public Boolean getAllowPcPunch() {
    return this.allowPcPunch;
  }

  public void setAllowPcPunch(Boolean allowPcPunch) {
    this.allowPcPunch = allowPcPunch;
  }

  public Boolean getAllowRemedy() {
    return this.allowRemedy;
  }

  public void setAllowRemedy(Boolean allowRemedy) {
    this.allowRemedy = allowRemedy;
  }

  public Boolean getRemedyLimit() {
    return this.remedyLimit;
  }

  public void setRemedyLimit(Boolean remedyLimit) {
    this.remedyLimit = remedyLimit;
  }

  public Integer getRemedyLimitCount() {
    return this.remedyLimitCount;
  }

  public void setRemedyLimitCount(Integer remedyLimitCount) {
    this.remedyLimitCount = remedyLimitCount;
  }

  public Boolean getRemedyDateLimit() {
    return this.remedyDateLimit;
  }

  public void setRemedyDateLimit(Boolean remedyDateLimit) {
    this.remedyDateLimit = remedyDateLimit;
  }

  public Integer getRemedyDateNum() {
    return this.remedyDateNum;
  }

  public void setRemedyDateNum(Integer remedyDateNum) {
    this.remedyDateNum = remedyDateNum;
  }

  public Boolean getShowCumulativeTime() {
    return this.showCumulativeTime;
  }

  public void setShowCumulativeTime(Boolean showCumulativeTime) {
    this.showCumulativeTime = showCumulativeTime;
  }

  public Boolean getShowOverTime() {
    return this.showOverTime;
  }

  public void setShowOverTime(Boolean showOverTime) {
    this.showOverTime = showOverTime;
  }

  public Boolean getHideStaffPunchTime() {
    return this.hideStaffPunchTime;
  }

  public void setHideStaffPunchTime(Boolean hideStaffPunchTime) {
    this.hideStaffPunchTime = hideStaffPunchTime;
  }

  public Boolean getFacePunch() {
    return this.facePunch;
  }

  public void setFacePunch(Boolean facePunch) {
    this.facePunch = facePunch;
  }

  public Integer getFacePunchCfg() {
    return this.facePunchCfg;
  }

  public void setFacePunchCfg(Integer facePunchCfg) {
    this.facePunchCfg = facePunchCfg;
  }

  public Boolean getFaceDowngrade() {
    return this.faceDowngrade;
  }

  public void setFaceDowngrade(Boolean faceDowngrade) {
    this.faceDowngrade = faceDowngrade;
  }

  public Boolean getReplaceBasicPic() {
    return this.replaceBasicPic;
  }

  public void setReplaceBasicPic(Boolean replaceBasicPic) {
    this.replaceBasicPic = replaceBasicPic;
  }

  public Machine[] getMachines() {
    return this.machines;
  }

  public void setMachines(Machine[] machines) {
    this.machines = machines;
  }

  public Integer getGpsRange() {
    return this.gpsRange;
  }

  public void setGpsRange(Integer gpsRange) {
    this.gpsRange = gpsRange;
  }

  public Location[] getLocations() {
    return this.locations;
  }

  public void setLocations(Location[] locations) {
    this.locations = locations;
  }

  public Integer getGroupType() {
    return this.groupType;
  }

  public void setGroupType(Integer groupType) {
    this.groupType = groupType;
  }

  public String[] getPunchDayShiftIds() {
    return this.punchDayShiftIds;
  }

  public void setPunchDayShiftIds(String[] punchDayShiftIds) {
    this.punchDayShiftIds = punchDayShiftIds;
  }

  public FreePunchCfg getFreePunchCfg() {
    return this.freePunchCfg;
  }

  public void setFreePunchCfg(FreePunchCfg freePunchCfg) {
    this.freePunchCfg = freePunchCfg;
  }

  public Integer getCalendarId() {
    return this.calendarId;
  }

  public void setCalendarId(Integer calendarId) {
    this.calendarId = calendarId;
  }

  public PunchSpecialDateShift[] getNeedPunchSpecialDays() {
    return this.needPunchSpecialDays;
  }

  public void setNeedPunchSpecialDays(PunchSpecialDateShift[] needPunchSpecialDays) {
    this.needPunchSpecialDays = needPunchSpecialDays;
  }

  public PunchSpecialDateShift[] getNoNeedPunchSpecialDays() {
    return this.noNeedPunchSpecialDays;
  }

  public void setNoNeedPunchSpecialDays(PunchSpecialDateShift[] noNeedPunchSpecialDays) {
    this.noNeedPunchSpecialDays = noNeedPunchSpecialDays;
  }

  public Boolean getWorkDayNoPunchAsLack() {
    return this.workDayNoPunchAsLack;
  }

  public void setWorkDayNoPunchAsLack(Boolean workDayNoPunchAsLack) {
    this.workDayNoPunchAsLack = workDayNoPunchAsLack;
  }

  public Boolean getEffectNow() {
    return this.effectNow;
  }

  public void setEffectNow(Boolean effectNow) {
    this.effectNow = effectNow;
  }

  public Integer getRemedyPeriodType() {
    return this.remedyPeriodType;
  }

  public void setRemedyPeriodType(Integer remedyPeriodType) {
    this.remedyPeriodType = remedyPeriodType;
  }

  public Integer getRemedyPeriodCustomDate() {
    return this.remedyPeriodCustomDate;
  }

  public void setRemedyPeriodCustomDate(Integer remedyPeriodCustomDate) {
    this.remedyPeriodCustomDate = remedyPeriodCustomDate;
  }

  public Integer getPunchType() {
    return this.punchType;
  }

  public void setPunchType(Integer punchType) {
    this.punchType = punchType;
  }

  public static class Builder {

    private String groupId;
    private String groupName;
    private String timeZone;
    private String[] bindDeptIds;
    private String[] exceptDeptIds;
    private String[] bindUserIds;
    private String[] exceptUserIds;
    private String[] groupLeaderIds;
    private Boolean allowOutPunch;
    private Boolean allowPcPunch;
    private Boolean allowRemedy;
    private Boolean remedyLimit;
    private Integer remedyLimitCount;
    private Boolean remedyDateLimit;
    private Integer remedyDateNum;
    private Boolean showCumulativeTime;
    private Boolean showOverTime;
    private Boolean hideStaffPunchTime;
    private Boolean facePunch;
    private Integer facePunchCfg;
    private Boolean faceDowngrade;
    private Boolean replaceBasicPic;
    private Machine[] machines;
    private Integer gpsRange;
    private Location[] locations;
    private Integer groupType;
    private String[] punchDayShiftIds;
    private FreePunchCfg freePunchCfg;
    private Integer calendarId;
    private PunchSpecialDateShift[] needPunchSpecialDays;
    private PunchSpecialDateShift[] noNeedPunchSpecialDays;
    private Boolean workDayNoPunchAsLack;
    private Boolean effectNow;
    private Integer remedyPeriodType;
    private Integer remedyPeriodCustomDate;
    private Integer punchType;

    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    public Builder groupName(String groupName) {
      this.groupName = groupName;
      return this;
    }

    public Builder timeZone(String timeZone) {
      this.timeZone = timeZone;
      return this;
    }

    public Builder bindDeptIds(String[] bindDeptIds) {
      this.bindDeptIds = bindDeptIds;
      return this;
    }

    public Builder exceptDeptIds(String[] exceptDeptIds) {
      this.exceptDeptIds = exceptDeptIds;
      return this;
    }

    public Builder bindUserIds(String[] bindUserIds) {
      this.bindUserIds = bindUserIds;
      return this;
    }

    public Builder exceptUserIds(String[] exceptUserIds) {
      this.exceptUserIds = exceptUserIds;
      return this;
    }

    public Builder groupLeaderIds(String[] groupLeaderIds) {
      this.groupLeaderIds = groupLeaderIds;
      return this;
    }

    public Builder allowOutPunch(Boolean allowOutPunch) {
      this.allowOutPunch = allowOutPunch;
      return this;
    }

    public Builder allowPcPunch(Boolean allowPcPunch) {
      this.allowPcPunch = allowPcPunch;
      return this;
    }

    public Builder allowRemedy(Boolean allowRemedy) {
      this.allowRemedy = allowRemedy;
      return this;
    }

    public Builder remedyLimit(Boolean remedyLimit) {
      this.remedyLimit = remedyLimit;
      return this;
    }

    public Builder remedyLimitCount(Integer remedyLimitCount) {
      this.remedyLimitCount = remedyLimitCount;
      return this;
    }

    public Builder remedyDateLimit(Boolean remedyDateLimit) {
      this.remedyDateLimit = remedyDateLimit;
      return this;
    }

    public Builder remedyDateNum(Integer remedyDateNum) {
      this.remedyDateNum = remedyDateNum;
      return this;
    }

    public Builder showCumulativeTime(Boolean showCumulativeTime) {
      this.showCumulativeTime = showCumulativeTime;
      return this;
    }

    public Builder showOverTime(Boolean showOverTime) {
      this.showOverTime = showOverTime;
      return this;
    }

    public Builder hideStaffPunchTime(Boolean hideStaffPunchTime) {
      this.hideStaffPunchTime = hideStaffPunchTime;
      return this;
    }

    public Builder facePunch(Boolean facePunch) {
      this.facePunch = facePunch;
      return this;
    }

    public Builder facePunchCfg(Integer facePunchCfg) {
      this.facePunchCfg = facePunchCfg;
      return this;
    }

    public Builder faceDowngrade(Boolean faceDowngrade) {
      this.faceDowngrade = faceDowngrade;
      return this;
    }

    public Builder replaceBasicPic(Boolean replaceBasicPic) {
      this.replaceBasicPic = replaceBasicPic;
      return this;
    }

    public Builder machines(Machine[] machines) {
      this.machines = machines;
      return this;
    }

    public Builder gpsRange(Integer gpsRange) {
      this.gpsRange = gpsRange;
      return this;
    }

    public Builder locations(Location[] locations) {
      this.locations = locations;
      return this;
    }

    public Builder groupType(Integer groupType) {
      this.groupType = groupType;
      return this;
    }

    public Builder punchDayShiftIds(String[] punchDayShiftIds) {
      this.punchDayShiftIds = punchDayShiftIds;
      return this;
    }

    public Builder freePunchCfg(FreePunchCfg freePunchCfg) {
      this.freePunchCfg = freePunchCfg;
      return this;
    }

    public Builder calendarId(Integer calendarId) {
      this.calendarId = calendarId;
      return this;
    }

    public Builder needPunchSpecialDays(PunchSpecialDateShift[] needPunchSpecialDays) {
      this.needPunchSpecialDays = needPunchSpecialDays;
      return this;
    }

    public Builder noNeedPunchSpecialDays(PunchSpecialDateShift[] noNeedPunchSpecialDays) {
      this.noNeedPunchSpecialDays = noNeedPunchSpecialDays;
      return this;
    }

    public Builder workDayNoPunchAsLack(Boolean workDayNoPunchAsLack) {
      this.workDayNoPunchAsLack = workDayNoPunchAsLack;
      return this;
    }

    public Builder effectNow(Boolean effectNow) {
      this.effectNow = effectNow;
      return this;
    }

    public Builder remedyPeriodType(Integer remedyPeriodType) {
      this.remedyPeriodType = remedyPeriodType;
      return this;
    }

    public Builder remedyPeriodCustomDate(Integer remedyPeriodCustomDate) {
      this.remedyPeriodCustomDate = remedyPeriodCustomDate;
      return this;
    }

    public Builder punchType(Integer punchType) {
      this.punchType = punchType;
      return this;
    }


    public Group build() {
      return new Group(this);
    }
  }
}
