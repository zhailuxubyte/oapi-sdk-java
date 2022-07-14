// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppTableFormField {

  @SerializedName("field_id")
  private String fieldId;
  @SerializedName("title")
  private String title;
  @SerializedName("description")
  private String description;
  @SerializedName("required")
  private Boolean required;
  @SerializedName("visible")
  private Boolean visible;

  // builder 开始
  public AppTableFormField() {
  }

  public AppTableFormField(Builder builder) {
    this.fieldId = builder.fieldId;
    this.title = builder.title;
    this.description = builder.description;
    this.required = builder.required;
    this.visible = builder.visible;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getRequired() {
    return this.required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public Boolean getVisible() {
    return this.visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public static class Builder {

    private String fieldId;
    private String title;
    private String description;
    private Boolean required;
    private Boolean visible;

    public Builder fieldId(String fieldId) {
      this.fieldId = fieldId;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder required(Boolean required) {
      this.required = required;
      return this;
    }

    public Builder visible(Boolean visible) {
      this.visible = visible;
      return this;
    }


    public AppTableFormField build() {
      return new AppTableFormField(this);
    }
  }
}
