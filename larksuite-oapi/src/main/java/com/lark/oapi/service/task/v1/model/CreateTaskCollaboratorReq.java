// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class CreateTaskCollaboratorReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("task_id")
  private String taskId;
  @Body
  private Collaborator body;

  // builder 开始
  public CreateTaskCollaboratorReq() {
  }

  public CreateTaskCollaboratorReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.taskId = builder.taskId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public Collaborator getCollaborator() {
    return this.body;
  }

  public void setCollaborator(Collaborator body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private String taskId;
    private Collaborator body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.task.v1.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }

    public Collaborator getCollaborator() {
      return this.body;
    }

    public Builder collaborator(Collaborator body) {
      this.body = body;
      return this;
    }

    public CreateTaskCollaboratorReq build() {
      return new CreateTaskCollaboratorReq(this);
    }
  }
}
