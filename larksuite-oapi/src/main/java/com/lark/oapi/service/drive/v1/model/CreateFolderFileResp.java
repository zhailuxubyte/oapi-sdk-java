// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.response.BaseResponse;

public class CreateFolderFileResp extends BaseResponse {

  @SerializedName("data")
  private CreateFolderFileDTO body;

  public CreateFolderFileDTO getCreateFolderFileDTO() {
    return this.body;
  }

  public void setCreateFolderFileDTO(CreateFolderFileDTO body) {
    this.body = body;
  }
}
