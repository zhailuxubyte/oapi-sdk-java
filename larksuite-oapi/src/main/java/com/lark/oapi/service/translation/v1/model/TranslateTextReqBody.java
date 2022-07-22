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

package com.lark.oapi.service.translation.v1.model;

import com.google.gson.annotations.SerializedName;

public class TranslateTextReqBody {

  @SerializedName("source_language")
  private String sourceLanguage;
  @SerializedName("text")
  private String text;
  @SerializedName("target_language")
  private String targetLanguage;
  @SerializedName("glossary")
  private Term[] glossary;

  // builder 开始
  public TranslateTextReqBody() {
  }

  public TranslateTextReqBody(Builder builder) {
    this.sourceLanguage = builder.sourceLanguage;
    this.text = builder.text;
    this.targetLanguage = builder.targetLanguage;
    this.glossary = builder.glossary;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getSourceLanguage() {
    return this.sourceLanguage;
  }

  public void setSourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getTargetLanguage() {
    return this.targetLanguage;
  }

  public void setTargetLanguage(String targetLanguage) {
    this.targetLanguage = targetLanguage;
  }

  public Term[] getGlossary() {
    return this.glossary;
  }

  public void setGlossary(Term[] glossary) {
    this.glossary = glossary;
  }

  public static class Builder {

    private String sourceLanguage;
    private String text;
    private String targetLanguage;
    private Term[] glossary;

    public Builder sourceLanguage(String sourceLanguage) {
      this.sourceLanguage = sourceLanguage;
      return this;
    }

    public Builder text(String text) {
      this.text = text;
      return this;
    }

    public Builder targetLanguage(String targetLanguage) {
      this.targetLanguage = targetLanguage;
      return this;
    }

    public Builder glossary(Term[] glossary) {
      this.glossary = glossary;
      return this;
    }


    public TranslateTextReqBody build() {
      return new TranslateTextReqBody(this);
    }
  }
}
