// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class BatchCreateAppTableResp extends BaseResponse {

  @SerializedName("data")
  private BatchCreateAppTableDTO body;

  public BatchCreateAppTableDTO getBatchCreateAppTableDTO() {
    return this.body;
  }

  public void setBatchCreateAppTableDTO(BatchCreateAppTableDTO body) {
    this.body = body;
  }
}
