// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class I18nContent {

  @SerializedName("locale")
  private String locale;
  @SerializedName("value")
  private String value;

  // builder 开始
  public I18nContent() {
  }

  public I18nContent(Builder builder) {
    this.locale = builder.locale;
    this.value = builder.value;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getLocale() {
    return this.locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static class Builder {

    private String locale;
    private String value;

    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    public Builder value(String value) {
      this.value = value;
      return this;
    }


    public I18nContent build() {
      return new I18nContent(this);
    }
  }
}
