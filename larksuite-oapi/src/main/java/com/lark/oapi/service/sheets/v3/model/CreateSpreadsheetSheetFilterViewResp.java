// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateSpreadsheetSheetFilterViewResp extends BaseResponse {

  @SerializedName("data")
  private CreateSpreadsheetSheetFilterViewDTO body;

  public CreateSpreadsheetSheetFilterViewDTO getCreateSpreadsheetSheetFilterViewDTO() {
    return this.body;
  }

  public void setCreateSpreadsheetSheetFilterViewDTO(CreateSpreadsheetSheetFilterViewDTO body) {
    this.body = body;
  }
}
