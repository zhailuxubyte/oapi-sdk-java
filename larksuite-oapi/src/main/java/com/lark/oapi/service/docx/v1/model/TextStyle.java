// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class TextStyle {

  @SerializedName("align")
  private Integer align;
  @SerializedName("done")
  private Boolean done;
  @SerializedName("folded")
  private Boolean folded;
  @SerializedName("language")
  private Integer language;
  @SerializedName("wrap")
  private Boolean wrap;

  // builder 开始
  public TextStyle() {
  }

  public TextStyle(Builder builder) {
    this.align = builder.align;
    this.done = builder.done;
    this.folded = builder.folded;
    this.language = builder.language;
    this.wrap = builder.wrap;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getAlign() {
    return this.align;
  }

  public void setAlign(Integer align) {
    this.align = align;
  }

  public Boolean getDone() {
    return this.done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public Boolean getFolded() {
    return this.folded;
  }

  public void setFolded(Boolean folded) {
    this.folded = folded;
  }

  public Integer getLanguage() {
    return this.language;
  }

  public void setLanguage(Integer language) {
    this.language = language;
  }

  public Boolean getWrap() {
    return this.wrap;
  }

  public void setWrap(Boolean wrap) {
    this.wrap = wrap;
  }

  public static class Builder {

    private Integer align;
    private Boolean done;
    private Boolean folded;
    private Integer language;
    private Boolean wrap;

    public Builder align(Integer align) {
      this.align = align;
      return this;
    }

    public Builder align(com.lark.oapi.service.docx.v1.enums.AlignEnum align) {
      this.align = align.getValue();
      return this;
    }

    public Builder done(Boolean done) {
      this.done = done;
      return this;
    }

    public Builder folded(Boolean folded) {
      this.folded = folded;
      return this;
    }

    public Builder language(Integer language) {
      this.language = language;
      return this;
    }

    public Builder language(com.lark.oapi.service.docx.v1.enums.CodeLanguageEnum language) {
      this.language = language.getValue();
      return this;
    }

    public Builder wrap(Boolean wrap) {
      this.wrap = wrap;
      return this;
    }


    public TextStyle build() {
      return new TextStyle(this);
    }
  }
}
