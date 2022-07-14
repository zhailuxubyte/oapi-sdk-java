// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class Replace {

  @SerializedName("find_condition")
  private FindCondition findCondition;
  @SerializedName("find")
  private String find;
  @SerializedName("replacement")
  private String replacement;

  // builder 开始
  public Replace() {
  }

  public Replace(Builder builder) {
    this.findCondition = builder.findCondition;
    this.find = builder.find;
    this.replacement = builder.replacement;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public FindCondition getFindCondition() {
    return this.findCondition;
  }

  public void setFindCondition(FindCondition findCondition) {
    this.findCondition = findCondition;
  }

  public String getFind() {
    return this.find;
  }

  public void setFind(String find) {
    this.find = find;
  }

  public String getReplacement() {
    return this.replacement;
  }

  public void setReplacement(String replacement) {
    this.replacement = replacement;
  }

  public static class Builder {

    private FindCondition findCondition;
    private String find;
    private String replacement;

    public Builder findCondition(FindCondition findCondition) {
      this.findCondition = findCondition;
      return this;
    }

    public Builder find(String find) {
      this.find = find;
      return this;
    }

    public Builder replacement(String replacement) {
      this.replacement = replacement;
      return this;
    }


    public Replace build() {
      return new Replace(this);
    }
  }
}
