// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class PatchSchemaResp extends BaseResponse {

  @SerializedName("data")
  private PatchSchemaDTO body;

  public PatchSchemaDTO getPatchSchemaDTO() {
    return this.body;
  }

  public void setPatchSchemaDTO(PatchSchemaDTO body) {
    this.body = body;
  }
}
