// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class QueryInstanceResp extends BaseResponse {

  @SerializedName("data")
  private QueryInstanceDTO body;

  public QueryInstanceDTO getQueryInstanceDTO() {
    return this.body;
  }

  public void setQueryInstanceDTO(QueryInstanceDTO body) {
    this.body = body;
  }
}
