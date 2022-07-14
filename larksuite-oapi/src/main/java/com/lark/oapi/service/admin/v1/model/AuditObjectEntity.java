// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditObjectEntity {

  @SerializedName("object_type")
  private String objectType;
  @SerializedName("object_value")
  private String objectValue;
  @SerializedName("object_name")
  private String objectName;
  @SerializedName("object_owner")
  private String objectOwner;
  @SerializedName("object_detail")
  private AuditObjectDetail objectDetail;

  // builder 开始
  public AuditObjectEntity() {
  }

  public AuditObjectEntity(Builder builder) {
    this.objectType = builder.objectType;
    this.objectValue = builder.objectValue;
    this.objectName = builder.objectName;
    this.objectOwner = builder.objectOwner;
    this.objectDetail = builder.objectDetail;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getObjectType() {
    return this.objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public String getObjectValue() {
    return this.objectValue;
  }

  public void setObjectValue(String objectValue) {
    this.objectValue = objectValue;
  }

  public String getObjectName() {
    return this.objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public String getObjectOwner() {
    return this.objectOwner;
  }

  public void setObjectOwner(String objectOwner) {
    this.objectOwner = objectOwner;
  }

  public AuditObjectDetail getObjectDetail() {
    return this.objectDetail;
  }

  public void setObjectDetail(AuditObjectDetail objectDetail) {
    this.objectDetail = objectDetail;
  }

  public static class Builder {

    private String objectType;
    private String objectValue;
    private String objectName;
    private String objectOwner;
    private AuditObjectDetail objectDetail;

    public Builder objectType(String objectType) {
      this.objectType = objectType;
      return this;
    }

    public Builder objectValue(String objectValue) {
      this.objectValue = objectValue;
      return this;
    }

    public Builder objectName(String objectName) {
      this.objectName = objectName;
      return this;
    }

    public Builder objectOwner(String objectOwner) {
      this.objectOwner = objectOwner;
      return this;
    }

    public Builder objectDetail(AuditObjectDetail objectDetail) {
      this.objectDetail = objectDetail;
      return this;
    }


    public AuditObjectEntity build() {
      return new AuditObjectEntity(this);
    }
  }
}
