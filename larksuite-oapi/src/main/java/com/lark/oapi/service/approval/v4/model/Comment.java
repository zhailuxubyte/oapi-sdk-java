// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class Comment {

  @SerializedName("id")
  private Long id;
  @SerializedName("content")
  private String content;
  @SerializedName("create_time")
  private Long createTime;
  @SerializedName("update_time")
  private Long updateTime;
  @SerializedName("is_delete")
  private Integer isDelete;
  @SerializedName("replies")
  private CommentReply[] replies;
  @SerializedName("at_info_list")
  private CommentAtInfo[] atInfoList;
  @SerializedName("commentator")
  private String commentator;
  @SerializedName("extra")
  private String extra;

  // builder 开始
  public Comment() {
  }

  public Comment(Builder builder) {
    this.id = builder.id;
    this.content = builder.content;
    this.createTime = builder.createTime;
    this.updateTime = builder.updateTime;
    this.isDelete = builder.isDelete;
    this.replies = builder.replies;
    this.atInfoList = builder.atInfoList;
    this.commentator = builder.commentator;
    this.extra = builder.extra;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Long getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public Long getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }

  public Integer getIsDelete() {
    return this.isDelete;
  }

  public void setIsDelete(Integer isDelete) {
    this.isDelete = isDelete;
  }

  public CommentReply[] getReplies() {
    return this.replies;
  }

  public void setReplies(CommentReply[] replies) {
    this.replies = replies;
  }

  public CommentAtInfo[] getAtInfoList() {
    return this.atInfoList;
  }

  public void setAtInfoList(CommentAtInfo[] atInfoList) {
    this.atInfoList = atInfoList;
  }

  public String getCommentator() {
    return this.commentator;
  }

  public void setCommentator(String commentator) {
    this.commentator = commentator;
  }

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public static class Builder {

    private Long id;
    private String content;
    private Long createTime;
    private Long updateTime;
    private Integer isDelete;
    private CommentReply[] replies;
    private CommentAtInfo[] atInfoList;
    private String commentator;
    private String extra;

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder content(String content) {
      this.content = content;
      return this;
    }

    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    public Builder updateTime(Long updateTime) {
      this.updateTime = updateTime;
      return this;
    }

    public Builder isDelete(Integer isDelete) {
      this.isDelete = isDelete;
      return this;
    }

    public Builder replies(CommentReply[] replies) {
      this.replies = replies;
      return this;
    }

    public Builder atInfoList(CommentAtInfo[] atInfoList) {
      this.atInfoList = atInfoList;
      return this;
    }

    public Builder commentator(String commentator) {
      this.commentator = commentator;
      return this;
    }

    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }


    public Comment build() {
      return new Comment(this);
    }
  }
}
