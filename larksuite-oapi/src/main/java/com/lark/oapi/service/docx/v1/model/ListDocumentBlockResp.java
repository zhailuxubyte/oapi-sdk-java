// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class ListDocumentBlockResp extends BaseResponse {

  @SerializedName("data")
  private ListDocumentBlockDTO body;

  public ListDocumentBlockDTO getListDocumentBlockDTO() {
    return this.body;
  }

  public void setListDocumentBlockDTO(ListDocumentBlockDTO body) {
    this.body = body;
  }
}
