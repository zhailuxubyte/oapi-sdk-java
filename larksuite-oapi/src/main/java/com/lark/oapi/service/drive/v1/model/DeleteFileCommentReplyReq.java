// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class DeleteFileCommentReplyReq {

  @Query
  @SerializedName("file_type")
  private String fileType;
  @Path
  @SerializedName("file_token")
  private String fileToken;
  @Path
  @SerializedName("comment_id")
  private Long commentId;
  @Path
  @SerializedName("reply_id")
  private Long replyId;

  // builder 开始
  public DeleteFileCommentReplyReq() {
  }

  public DeleteFileCommentReplyReq(Builder builder) {
    this.fileType = builder.fileType;
    this.fileToken = builder.fileToken;
    this.commentId = builder.commentId;
    this.replyId = builder.replyId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFileType() {
    return this.fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getFileToken() {
    return this.fileToken;
  }

  public void setFileToken(String fileToken) {
    this.fileToken = fileToken;
  }

  public Long getCommentId() {
    return this.commentId;
  }

  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }

  public Long getReplyId() {
    return this.replyId;
  }

  public void setReplyId(Long replyId) {
    this.replyId = replyId;
  }

  public static class Builder {

    private String fileType;
    private String fileToken;
    private Long commentId;
    private Long replyId;

    public Builder fileType(String fileType) {
      this.fileType = fileType;
      return this;
    }

    public Builder fileType(com.lark.oapi.service.drive.v1.enums.FileTypeEnum fileType) {
      this.fileType = fileType.getValue();
      return this;
    }

    public Builder fileToken(String fileToken) {
      this.fileToken = fileToken;
      return this;
    }

    public Builder commentId(Long commentId) {
      this.commentId = commentId;
      return this;
    }

    public Builder replyId(Long replyId) {
      this.replyId = replyId;
      return this;
    }

    public DeleteFileCommentReplyReq build() {
      return new DeleteFileCommentReplyReq(this);
    }
  }
}
