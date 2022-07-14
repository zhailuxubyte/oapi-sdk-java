// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.annotation.Body;

public class CreateFolderFileReq {

  @Body
  private CreateFolderFileReqBody body;

  // builder 开始
  public CreateFolderFileReq() {
  }

  public CreateFolderFileReq(Builder builder) {
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public CreateFolderFileReqBody getCreateFolderFileReqBody() {
    return this.body;
  }

  public void setCreateFolderFileReqBody(CreateFolderFileReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private CreateFolderFileReqBody body;

    public CreateFolderFileReqBody getCreateFolderFileReqBody() {
      return this.body;
    }

    public Builder createFolderFileReqBody(CreateFolderFileReqBody body) {
      this.body = body;
      return this;
    }

    public CreateFolderFileReq build() {
      return new CreateFolderFileReq(this);
    }
  }
}
