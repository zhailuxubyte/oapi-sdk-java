// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class Task {

  @SerializedName("topic")
  private Long topic;
  @SerializedName("user_id")
  private Long userId;
  @SerializedName("title")
  private String title;
  @SerializedName("urls")
  private TaskUrls urls;
  @SerializedName("process_external_id")
  private String processExternalId;
  @SerializedName("task_external_id")
  private String taskExternalId;
  @SerializedName("status")
  private String status;
  @SerializedName("process_status")
  private String processStatus;
  @SerializedName("definition_code")
  private String definitionCode;
  @SerializedName("initiators")
  private String[] initiators;
  @SerializedName("initiator_names")
  private String[] initiatorNames;
  @SerializedName("task_id")
  private Long taskId;
  @SerializedName("process_id")
  private Long processId;
  @SerializedName("process_code")
  private String processCode;
  @SerializedName("definition_group_id")
  private Long definitionGroupId;
  @SerializedName("definition_group_name")
  private String definitionGroupName;
  @SerializedName("definition_id")
  private Long definitionId;
  @SerializedName("definition_name")
  private String definitionName;

  // builder 开始
  public Task() {
  }

  public Task(Builder builder) {
    this.topic = builder.topic;
    this.userId = builder.userId;
    this.title = builder.title;
    this.urls = builder.urls;
    this.processExternalId = builder.processExternalId;
    this.taskExternalId = builder.taskExternalId;
    this.status = builder.status;
    this.processStatus = builder.processStatus;
    this.definitionCode = builder.definitionCode;
    this.initiators = builder.initiators;
    this.initiatorNames = builder.initiatorNames;
    this.taskId = builder.taskId;
    this.processId = builder.processId;
    this.processCode = builder.processCode;
    this.definitionGroupId = builder.definitionGroupId;
    this.definitionGroupName = builder.definitionGroupName;
    this.definitionId = builder.definitionId;
    this.definitionName = builder.definitionName;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Long getTopic() {
    return this.topic;
  }

  public void setTopic(Long topic) {
    this.topic = topic;
  }

  public Long getUserId() {
    return this.userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TaskUrls getUrls() {
    return this.urls;
  }

  public void setUrls(TaskUrls urls) {
    this.urls = urls;
  }

  public String getProcessExternalId() {
    return this.processExternalId;
  }

  public void setProcessExternalId(String processExternalId) {
    this.processExternalId = processExternalId;
  }

  public String getTaskExternalId() {
    return this.taskExternalId;
  }

  public void setTaskExternalId(String taskExternalId) {
    this.taskExternalId = taskExternalId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getProcessStatus() {
    return this.processStatus;
  }

  public void setProcessStatus(String processStatus) {
    this.processStatus = processStatus;
  }

  public String getDefinitionCode() {
    return this.definitionCode;
  }

  public void setDefinitionCode(String definitionCode) {
    this.definitionCode = definitionCode;
  }

  public String[] getInitiators() {
    return this.initiators;
  }

  public void setInitiators(String[] initiators) {
    this.initiators = initiators;
  }

  public String[] getInitiatorNames() {
    return this.initiatorNames;
  }

  public void setInitiatorNames(String[] initiatorNames) {
    this.initiatorNames = initiatorNames;
  }

  public Long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  public Long getProcessId() {
    return this.processId;
  }

  public void setProcessId(Long processId) {
    this.processId = processId;
  }

  public String getProcessCode() {
    return this.processCode;
  }

  public void setProcessCode(String processCode) {
    this.processCode = processCode;
  }

  public Long getDefinitionGroupId() {
    return this.definitionGroupId;
  }

  public void setDefinitionGroupId(Long definitionGroupId) {
    this.definitionGroupId = definitionGroupId;
  }

  public String getDefinitionGroupName() {
    return this.definitionGroupName;
  }

  public void setDefinitionGroupName(String definitionGroupName) {
    this.definitionGroupName = definitionGroupName;
  }

  public Long getDefinitionId() {
    return this.definitionId;
  }

  public void setDefinitionId(Long definitionId) {
    this.definitionId = definitionId;
  }

  public String getDefinitionName() {
    return this.definitionName;
  }

  public void setDefinitionName(String definitionName) {
    this.definitionName = definitionName;
  }

  public static class Builder {

    private Long topic;
    private Long userId;
    private String title;
    private TaskUrls urls;
    private String processExternalId;
    private String taskExternalId;
    private String status;
    private String processStatus;
    private String definitionCode;
    private String[] initiators;
    private String[] initiatorNames;
    private Long taskId;
    private Long processId;
    private String processCode;
    private Long definitionGroupId;
    private String definitionGroupName;
    private Long definitionId;
    private String definitionName;

    public Builder topic(Long topic) {
      this.topic = topic;
      return this;
    }

    public Builder topic(com.lark.oapi.service.approval.v4.enums.TopicEnum topic) {
      this.topic = topic.getValue();
      return this;
    }

    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder urls(TaskUrls urls) {
      this.urls = urls;
      return this;
    }

    public Builder processExternalId(String processExternalId) {
      this.processExternalId = processExternalId;
      return this;
    }

    public Builder taskExternalId(String taskExternalId) {
      this.taskExternalId = taskExternalId;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public Builder status(com.lark.oapi.service.approval.v4.enums.TaskStatusEnum status) {
      this.status = status.getValue();
      return this;
    }

    public Builder processStatus(String processStatus) {
      this.processStatus = processStatus;
      return this;
    }

    public Builder processStatus(
        com.lark.oapi.service.approval.v4.enums.ProcessStatusEnum processStatus) {
      this.processStatus = processStatus.getValue();
      return this;
    }

    public Builder definitionCode(String definitionCode) {
      this.definitionCode = definitionCode;
      return this;
    }

    public Builder initiators(String[] initiators) {
      this.initiators = initiators;
      return this;
    }

    public Builder initiatorNames(String[] initiatorNames) {
      this.initiatorNames = initiatorNames;
      return this;
    }

    public Builder taskId(Long taskId) {
      this.taskId = taskId;
      return this;
    }

    public Builder processId(Long processId) {
      this.processId = processId;
      return this;
    }

    public Builder processCode(String processCode) {
      this.processCode = processCode;
      return this;
    }

    public Builder definitionGroupId(Long definitionGroupId) {
      this.definitionGroupId = definitionGroupId;
      return this;
    }

    public Builder definitionGroupName(String definitionGroupName) {
      this.definitionGroupName = definitionGroupName;
      return this;
    }

    public Builder definitionId(Long definitionId) {
      this.definitionId = definitionId;
      return this;
    }

    public Builder definitionName(String definitionName) {
      this.definitionName = definitionName;
      return this;
    }


    public Task build() {
      return new Task(this);
    }
  }
}
