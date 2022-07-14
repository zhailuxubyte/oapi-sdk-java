// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import java.io.File;

public class UploadPartMediaReqBody {

  @SerializedName("upload_id")
  private String uploadId;
  @SerializedName("seq")
  private Integer seq;
  @SerializedName("size")
  private Integer size;
  @SerializedName("checksum")
  private String checksum;
  @SerializedName("file")
  private File file;

  // builder 开始
  public UploadPartMediaReqBody() {
  }

  public UploadPartMediaReqBody(Builder builder) {
    this.uploadId = builder.uploadId;
    this.seq = builder.seq;
    this.size = builder.size;
    this.checksum = builder.checksum;
    this.file = builder.file;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUploadId() {
    return this.uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public Integer getSeq() {
    return this.seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  public Integer getSize() {
    return this.size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getChecksum() {
    return this.checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public File getFile() {
    return this.file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public static class Builder {

    private String uploadId;
    private Integer seq;
    private Integer size;
    private String checksum;
    private File file;

    public Builder uploadId(String uploadId) {
      this.uploadId = uploadId;
      return this;
    }

    public Builder seq(Integer seq) {
      this.seq = seq;
      return this;
    }

    public Builder size(Integer size) {
      this.size = size;
      return this;
    }

    public Builder checksum(String checksum) {
      this.checksum = checksum;
      return this;
    }

    public Builder file(File file) {
      this.file = file;
      return this;
    }


    public UploadPartMediaReqBody build() {
      return new UploadPartMediaReqBody(this);
    }
  }
}
