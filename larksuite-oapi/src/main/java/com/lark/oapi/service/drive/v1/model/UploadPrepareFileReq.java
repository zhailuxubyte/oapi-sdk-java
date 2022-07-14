// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.annotation.Body;

public class UploadPrepareFileReq {

  @Body
  private FileUploadInfo body;

  // builder 开始
  public UploadPrepareFileReq() {
  }

  public UploadPrepareFileReq(Builder builder) {
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public FileUploadInfo getFileUploadInfo() {
    return this.body;
  }

  public void setFileUploadInfo(FileUploadInfo body) {
    this.body = body;
  }

  public static class Builder {

    private FileUploadInfo body;

    public FileUploadInfo getFileUploadInfo() {
      return this.body;
    }

    public Builder fileUploadInfo(FileUploadInfo body) {
      this.body = body;
      return this;
    }

    public UploadPrepareFileReq build() {
      return new UploadPrepareFileReq(this);
    }
  }
}
