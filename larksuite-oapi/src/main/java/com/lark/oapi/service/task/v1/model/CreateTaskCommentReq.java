// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class CreateTaskCommentReq {

  @Path
  @SerializedName("task_id")
  private String taskId;
  @Body
  private Comment body;

  // builder 开始
  public CreateTaskCommentReq() {
  }

  public CreateTaskCommentReq(Builder builder) {
    this.taskId = builder.taskId;
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

  public Comment getComment() {
    return this.body;
  }

  public void setComment(Comment body) {
    this.body = body;
  }

  public static class Builder {

    private String taskId;
    private Comment body;

    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }

    public Comment getComment() {
      return this.body;
    }

    public Builder comment(Comment body) {
      this.body = body;
      return this;
    }

    public CreateTaskCommentReq build() {
      return new CreateTaskCommentReq(this);
    }
  }
}
