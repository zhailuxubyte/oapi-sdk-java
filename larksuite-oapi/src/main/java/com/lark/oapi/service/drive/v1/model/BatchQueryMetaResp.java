// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class BatchQueryMetaResp extends BaseResponse {

  @SerializedName("data")
  private BatchQueryMetaDTO body;

  public BatchQueryMetaDTO getBatchQueryMetaDTO() {
    return this.body;
  }

  public void setBatchQueryMetaDTO(BatchQueryMetaDTO body) {
    this.body = body;
  }
}
