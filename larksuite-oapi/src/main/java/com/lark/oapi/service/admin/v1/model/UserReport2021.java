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

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class UserReport2021 {

  @SerializedName("active_day_count")
  private Integer activeDayCount;
  @SerializedName("busy_week")
  private String busyWeek;
  @SerializedName("p2p_chat_count")
  private String p2pChatCount;
  @SerializedName("talked_chat_count")
  private String talkedChatCount;
  @SerializedName("favorite_emoji")
  private String favoriteEmoji;
  @SerializedName("reaction_count")
  private String reactionCount;
  @SerializedName("conference_create_count")
  private String conferenceCreateCount;
  @SerializedName("total_parti_count")
  private String totalPartiCount;
  @SerializedName("minutes_object_count")
  private String minutesObjectCount;
  @SerializedName("minutes_duration")
  private Double minutesDuration;
  @SerializedName("create_edit_file_count")
  private String createEditFileCount;
  @SerializedName("create_file_count")
  private String createFileCount;
  @SerializedName("cooperate_edit_file_count")
  private String cooperateEditFileCount;
  @SerializedName("like_record_count")
  private String likeRecordCount;
  @SerializedName("okr_cum_o_count")
  private String okrCumOCount;
  @SerializedName("okr_cum_kr_count")
  private String okrCumKrCount;
  @SerializedName("okr_aligned_user_rankfirst")
  private String okrAlignedUserRankfirst;
  @SerializedName("approval_start_count")
  private String approvalStartCount;
  @SerializedName("approval_execute_count")
  private String approvalExecuteCount;
  @SerializedName("approval_relation_user_rankfirst")
  private String approvalRelationUserRankfirst;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("busy_week_sum_duration")
  private String busyWeekSumDuration;
  @SerializedName("busy_week_mdate")
  private String busyWeekMdate;
  @SerializedName("busy_week_act_days")
  private Integer busyWeekActDays;
  @SerializedName("create_read_user_count")
  private String createReadUserCount;

  // builder 开始
  public UserReport2021() {
  }

  public UserReport2021(Builder builder) {
    this.activeDayCount = builder.activeDayCount;
    this.busyWeek = builder.busyWeek;
    this.p2pChatCount = builder.p2pChatCount;
    this.talkedChatCount = builder.talkedChatCount;
    this.favoriteEmoji = builder.favoriteEmoji;
    this.reactionCount = builder.reactionCount;
    this.conferenceCreateCount = builder.conferenceCreateCount;
    this.totalPartiCount = builder.totalPartiCount;
    this.minutesObjectCount = builder.minutesObjectCount;
    this.minutesDuration = builder.minutesDuration;
    this.createEditFileCount = builder.createEditFileCount;
    this.createFileCount = builder.createFileCount;
    this.cooperateEditFileCount = builder.cooperateEditFileCount;
    this.likeRecordCount = builder.likeRecordCount;
    this.okrCumOCount = builder.okrCumOCount;
    this.okrCumKrCount = builder.okrCumKrCount;
    this.okrAlignedUserRankfirst = builder.okrAlignedUserRankfirst;
    this.approvalStartCount = builder.approvalStartCount;
    this.approvalExecuteCount = builder.approvalExecuteCount;
    this.approvalRelationUserRankfirst = builder.approvalRelationUserRankfirst;
    this.userId = builder.userId;
    this.busyWeekSumDuration = builder.busyWeekSumDuration;
    this.busyWeekMdate = builder.busyWeekMdate;
    this.busyWeekActDays = builder.busyWeekActDays;
    this.createReadUserCount = builder.createReadUserCount;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getActiveDayCount() {
    return this.activeDayCount;
  }

  public void setActiveDayCount(Integer activeDayCount) {
    this.activeDayCount = activeDayCount;
  }

  public String getBusyWeek() {
    return this.busyWeek;
  }

  public void setBusyWeek(String busyWeek) {
    this.busyWeek = busyWeek;
  }

  public String getP2pChatCount() {
    return this.p2pChatCount;
  }

  public void setP2pChatCount(String p2pChatCount) {
    this.p2pChatCount = p2pChatCount;
  }

  public String getTalkedChatCount() {
    return this.talkedChatCount;
  }

  public void setTalkedChatCount(String talkedChatCount) {
    this.talkedChatCount = talkedChatCount;
  }

  public String getFavoriteEmoji() {
    return this.favoriteEmoji;
  }

  public void setFavoriteEmoji(String favoriteEmoji) {
    this.favoriteEmoji = favoriteEmoji;
  }

  public String getReactionCount() {
    return this.reactionCount;
  }

  public void setReactionCount(String reactionCount) {
    this.reactionCount = reactionCount;
  }

  public String getConferenceCreateCount() {
    return this.conferenceCreateCount;
  }

  public void setConferenceCreateCount(String conferenceCreateCount) {
    this.conferenceCreateCount = conferenceCreateCount;
  }

  public String getTotalPartiCount() {
    return this.totalPartiCount;
  }

  public void setTotalPartiCount(String totalPartiCount) {
    this.totalPartiCount = totalPartiCount;
  }

  public String getMinutesObjectCount() {
    return this.minutesObjectCount;
  }

  public void setMinutesObjectCount(String minutesObjectCount) {
    this.minutesObjectCount = minutesObjectCount;
  }

  public Double getMinutesDuration() {
    return this.minutesDuration;
  }

  public void setMinutesDuration(Double minutesDuration) {
    this.minutesDuration = minutesDuration;
  }

  public String getCreateEditFileCount() {
    return this.createEditFileCount;
  }

  public void setCreateEditFileCount(String createEditFileCount) {
    this.createEditFileCount = createEditFileCount;
  }

  public String getCreateFileCount() {
    return this.createFileCount;
  }

  public void setCreateFileCount(String createFileCount) {
    this.createFileCount = createFileCount;
  }

  public String getCooperateEditFileCount() {
    return this.cooperateEditFileCount;
  }

  public void setCooperateEditFileCount(String cooperateEditFileCount) {
    this.cooperateEditFileCount = cooperateEditFileCount;
  }

  public String getLikeRecordCount() {
    return this.likeRecordCount;
  }

  public void setLikeRecordCount(String likeRecordCount) {
    this.likeRecordCount = likeRecordCount;
  }

  public String getOkrCumOCount() {
    return this.okrCumOCount;
  }

  public void setOkrCumOCount(String okrCumOCount) {
    this.okrCumOCount = okrCumOCount;
  }

  public String getOkrCumKrCount() {
    return this.okrCumKrCount;
  }

  public void setOkrCumKrCount(String okrCumKrCount) {
    this.okrCumKrCount = okrCumKrCount;
  }

  public String getOkrAlignedUserRankfirst() {
    return this.okrAlignedUserRankfirst;
  }

  public void setOkrAlignedUserRankfirst(String okrAlignedUserRankfirst) {
    this.okrAlignedUserRankfirst = okrAlignedUserRankfirst;
  }

  public String getApprovalStartCount() {
    return this.approvalStartCount;
  }

  public void setApprovalStartCount(String approvalStartCount) {
    this.approvalStartCount = approvalStartCount;
  }

  public String getApprovalExecuteCount() {
    return this.approvalExecuteCount;
  }

  public void setApprovalExecuteCount(String approvalExecuteCount) {
    this.approvalExecuteCount = approvalExecuteCount;
  }

  public String getApprovalRelationUserRankfirst() {
    return this.approvalRelationUserRankfirst;
  }

  public void setApprovalRelationUserRankfirst(String approvalRelationUserRankfirst) {
    this.approvalRelationUserRankfirst = approvalRelationUserRankfirst;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getBusyWeekSumDuration() {
    return this.busyWeekSumDuration;
  }

  public void setBusyWeekSumDuration(String busyWeekSumDuration) {
    this.busyWeekSumDuration = busyWeekSumDuration;
  }

  public String getBusyWeekMdate() {
    return this.busyWeekMdate;
  }

  public void setBusyWeekMdate(String busyWeekMdate) {
    this.busyWeekMdate = busyWeekMdate;
  }

  public Integer getBusyWeekActDays() {
    return this.busyWeekActDays;
  }

  public void setBusyWeekActDays(Integer busyWeekActDays) {
    this.busyWeekActDays = busyWeekActDays;
  }

  public String getCreateReadUserCount() {
    return this.createReadUserCount;
  }

  public void setCreateReadUserCount(String createReadUserCount) {
    this.createReadUserCount = createReadUserCount;
  }

  public static class Builder {

    private Integer activeDayCount;
    private String busyWeek;
    private String p2pChatCount;
    private String talkedChatCount;
    private String favoriteEmoji;
    private String reactionCount;
    private String conferenceCreateCount;
    private String totalPartiCount;
    private String minutesObjectCount;
    private Double minutesDuration;
    private String createEditFileCount;
    private String createFileCount;
    private String cooperateEditFileCount;
    private String likeRecordCount;
    private String okrCumOCount;
    private String okrCumKrCount;
    private String okrAlignedUserRankfirst;
    private String approvalStartCount;
    private String approvalExecuteCount;
    private String approvalRelationUserRankfirst;
    private String userId;
    private String busyWeekSumDuration;
    private String busyWeekMdate;
    private Integer busyWeekActDays;
    private String createReadUserCount;

    public Builder activeDayCount(Integer activeDayCount) {
      this.activeDayCount = activeDayCount;
      return this;
    }

    public Builder busyWeek(String busyWeek) {
      this.busyWeek = busyWeek;
      return this;
    }

    public Builder p2pChatCount(String p2pChatCount) {
      this.p2pChatCount = p2pChatCount;
      return this;
    }

    public Builder talkedChatCount(String talkedChatCount) {
      this.talkedChatCount = talkedChatCount;
      return this;
    }

    public Builder favoriteEmoji(String favoriteEmoji) {
      this.favoriteEmoji = favoriteEmoji;
      return this;
    }

    public Builder reactionCount(String reactionCount) {
      this.reactionCount = reactionCount;
      return this;
    }

    public Builder conferenceCreateCount(String conferenceCreateCount) {
      this.conferenceCreateCount = conferenceCreateCount;
      return this;
    }

    public Builder totalPartiCount(String totalPartiCount) {
      this.totalPartiCount = totalPartiCount;
      return this;
    }

    public Builder minutesObjectCount(String minutesObjectCount) {
      this.minutesObjectCount = minutesObjectCount;
      return this;
    }

    public Builder minutesDuration(Double minutesDuration) {
      this.minutesDuration = minutesDuration;
      return this;
    }

    public Builder createEditFileCount(String createEditFileCount) {
      this.createEditFileCount = createEditFileCount;
      return this;
    }

    public Builder createFileCount(String createFileCount) {
      this.createFileCount = createFileCount;
      return this;
    }

    public Builder cooperateEditFileCount(String cooperateEditFileCount) {
      this.cooperateEditFileCount = cooperateEditFileCount;
      return this;
    }

    public Builder likeRecordCount(String likeRecordCount) {
      this.likeRecordCount = likeRecordCount;
      return this;
    }

    public Builder okrCumOCount(String okrCumOCount) {
      this.okrCumOCount = okrCumOCount;
      return this;
    }

    public Builder okrCumKrCount(String okrCumKrCount) {
      this.okrCumKrCount = okrCumKrCount;
      return this;
    }

    public Builder okrAlignedUserRankfirst(String okrAlignedUserRankfirst) {
      this.okrAlignedUserRankfirst = okrAlignedUserRankfirst;
      return this;
    }

    public Builder approvalStartCount(String approvalStartCount) {
      this.approvalStartCount = approvalStartCount;
      return this;
    }

    public Builder approvalExecuteCount(String approvalExecuteCount) {
      this.approvalExecuteCount = approvalExecuteCount;
      return this;
    }

    public Builder approvalRelationUserRankfirst(String approvalRelationUserRankfirst) {
      this.approvalRelationUserRankfirst = approvalRelationUserRankfirst;
      return this;
    }

    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public Builder busyWeekSumDuration(String busyWeekSumDuration) {
      this.busyWeekSumDuration = busyWeekSumDuration;
      return this;
    }

    public Builder busyWeekMdate(String busyWeekMdate) {
      this.busyWeekMdate = busyWeekMdate;
      return this;
    }

    public Builder busyWeekActDays(Integer busyWeekActDays) {
      this.busyWeekActDays = busyWeekActDays;
      return this;
    }

    public Builder createReadUserCount(String createReadUserCount) {
      this.createReadUserCount = createReadUserCount;
      return this;
    }


    public UserReport2021 build() {
      return new UserReport2021(this);
    }
  }
}
