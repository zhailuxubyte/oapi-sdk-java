// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.passport.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class QuerySessionResp extends BaseResponse {

  @SerializedName("data")
  private QuerySessionDTO body;

  public QuerySessionDTO getQuerySessionDTO() {
    return this.body;
  }

  public void setQuerySessionDTO(QuerySessionDTO body) {
    this.body = body;
  }
}
