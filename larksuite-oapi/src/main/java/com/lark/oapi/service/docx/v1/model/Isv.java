// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class Isv {

  @SerializedName("component_id")
  private String componentId;
  @SerializedName("component_type_id")
  private String componentTypeId;

  // builder 开始
  public Isv() {
  }

  public Isv(Builder builder) {
    this.componentId = builder.componentId;
    this.componentTypeId = builder.componentTypeId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getComponentId() {
    return this.componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public String getComponentTypeId() {
    return this.componentTypeId;
  }

  public void setComponentTypeId(String componentTypeId) {
    this.componentTypeId = componentTypeId;
  }

  public static class Builder {

    private String componentId;
    private String componentTypeId;

    public Builder componentId(String componentId) {
      this.componentId = componentId;
      return this;
    }

    public Builder componentTypeId(String componentTypeId) {
      this.componentTypeId = componentTypeId;
      return this;
    }


    public Isv build() {
      return new Isv(this);
    }
  }
}
