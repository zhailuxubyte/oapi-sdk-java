// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateDocumentBlockChildrenResp extends BaseResponse {

  @SerializedName("data")
  private CreateDocumentBlockChildrenDTO body;

  public CreateDocumentBlockChildrenDTO getCreateDocumentBlockChildrenDTO() {
    return this.body;
  }

  public void setCreateDocumentBlockChildrenDTO(CreateDocumentBlockChildrenDTO body) {
    this.body = body;
  }
}
