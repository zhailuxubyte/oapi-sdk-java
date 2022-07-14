// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class Bot {

  @SerializedName("card_request_url")
  private String cardRequestUrl;

  // builder 开始
  public Bot() {
  }

  public Bot(Builder builder) {
    this.cardRequestUrl = builder.cardRequestUrl;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCardRequestUrl() {
    return this.cardRequestUrl;
  }

  public void setCardRequestUrl(String cardRequestUrl) {
    this.cardRequestUrl = cardRequestUrl;
  }

  public static class Builder {

    private String cardRequestUrl;

    public Builder cardRequestUrl(String cardRequestUrl) {
      this.cardRequestUrl = cardRequestUrl;
      return this;
    }


    public Bot build() {
      return new Bot(this);
    }
  }
}
