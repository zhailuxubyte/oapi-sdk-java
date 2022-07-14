// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import java.io.File;

public class UploadAllMediaReqBody {

  @SerializedName("file_name")
  private String fileName;
  @SerializedName("parent_type")
  private String parentType;
  @SerializedName("parent_node")
  private String parentNode;
  @SerializedName("size")
  private Integer size;
  @SerializedName("checksum")
  private String checksum;
  @SerializedName("extra")
  private String extra;
  @SerializedName("file")
  private File file;

  // builder 开始
  public UploadAllMediaReqBody() {
  }

  public UploadAllMediaReqBody(Builder builder) {
    this.fileName = builder.fileName;
    this.parentType = builder.parentType;
    this.parentNode = builder.parentNode;
    this.size = builder.size;
    this.checksum = builder.checksum;
    this.extra = builder.extra;
    this.file = builder.file;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getParentType() {
    return this.parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public String getParentNode() {
    return this.parentNode;
  }

  public void setParentNode(String parentNode) {
    this.parentNode = parentNode;
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

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public File getFile() {
    return this.file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public static class Builder {

    private String fileName;
    private String parentType;
    private String parentNode;
    private Integer size;
    private String checksum;
    private String extra;
    private File file;

    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder parentType(String parentType) {
      this.parentType = parentType;
      return this;
    }

    public Builder parentType(com.lark.oapi.service.drive.v1.enums.ParentTypeEnum parentType) {
      this.parentType = parentType.getValue();
      return this;
    }

    public Builder parentNode(String parentNode) {
      this.parentNode = parentNode;
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

    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }

    public Builder file(File file) {
      this.file = file;
      return this;
    }


    public UploadAllMediaReqBody build() {
      return new UploadAllMediaReqBody(this);
    }
  }
}
