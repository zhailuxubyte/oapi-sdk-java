// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateTaskReminderResp extends BaseResponse {

  @SerializedName("data")
  private CreateTaskReminderDTO body;

  public CreateTaskReminderDTO getCreateTaskReminderDTO() {
    return this.body;
  }

  public void setCreateTaskReminderDTO(CreateTaskReminderDTO body) {
    this.body = body;
  }
}
