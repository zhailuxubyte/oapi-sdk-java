// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class BatchUpdateAppTableRecordResp extends BaseResponse {

  @SerializedName("data")
  private BatchUpdateAppTableRecordDTO body;

  public BatchUpdateAppTableRecordDTO getBatchUpdateAppTableRecordDTO() {
    return this.body;
  }

  public void setBatchUpdateAppTableRecordDTO(BatchUpdateAppTableRecordDTO body) {
    this.body = body;
  }
}
