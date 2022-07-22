// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class NotificationOption {

  @SerializedName("channels")
  private String[] channels;
  @SerializedName("language")
  private String language;

  // builder 开始
  public NotificationOption() {
  }

  public NotificationOption(Builder builder) {
    this.channels = builder.channels;
    this.language = builder.language;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String[] getChannels() {
    return this.channels;
  }

  public void setChannels(String[] channels) {
    this.channels = channels;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public static class Builder {

    private String[] channels;
    private String language;

    public Builder channels(String[] channels) {
      this.channels = channels;
      return this;
    }

    public Builder language(String language) {
      this.language = language;
      return this;
    }

    public Builder language(com.lark.oapi.service.contact.v3.enums.LanguageEnum language) {
      this.language = language.getValue();
      return this;
    }


    public NotificationOption build() {
      return new NotificationOption(this);
    }
  }
}
