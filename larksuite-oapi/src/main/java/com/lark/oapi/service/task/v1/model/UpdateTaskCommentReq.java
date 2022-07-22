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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class UpdateTaskCommentReq {

  @Path
  @SerializedName("task_id")
  private String taskId;
  @Path
  @SerializedName("comment_id")
  private Long commentId;
  @Body
  private UpdateTaskCommentReqBody body;

  // builder 开始
  public UpdateTaskCommentReq() {
  }

  public UpdateTaskCommentReq(Builder builder) {
    this.taskId = builder.taskId;
    this.commentId = builder.commentId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public Long getCommentId() {
    return this.commentId;
  }

  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }

  public UpdateTaskCommentReqBody getUpdateTaskCommentReqBody() {
    return this.body;
  }

  public void setUpdateTaskCommentReqBody(UpdateTaskCommentReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String taskId;
    private Long commentId;
    private UpdateTaskCommentReqBody body;

    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }

    public Builder commentId(Long commentId) {
      this.commentId = commentId;
      return this;
    }

    public UpdateTaskCommentReqBody getUpdateTaskCommentReqBody() {
      return this.body;
    }

    public Builder updateTaskCommentReqBody(UpdateTaskCommentReqBody body) {
      this.body = body;
      return this;
    }

    public UpdateTaskCommentReq build() {
      return new UpdateTaskCommentReq(this);
    }
  }
}
