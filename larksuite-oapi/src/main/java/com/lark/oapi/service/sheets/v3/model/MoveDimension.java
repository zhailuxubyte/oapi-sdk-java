// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class MoveDimension {

  @SerializedName("source")
  private Dimension source;
  @SerializedName("destination_index")
  private Integer destinationIndex;

  // builder 开始
  public MoveDimension() {
  }

  public MoveDimension(Builder builder) {
    this.source = builder.source;
    this.destinationIndex = builder.destinationIndex;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Dimension getSource() {
    return this.source;
  }

  public void setSource(Dimension source) {
    this.source = source;
  }

  public Integer getDestinationIndex() {
    return this.destinationIndex;
  }

  public void setDestinationIndex(Integer destinationIndex) {
    this.destinationIndex = destinationIndex;
  }

  public static class Builder {

    private Dimension source;
    private Integer destinationIndex;

    public Builder source(Dimension source) {
      this.source = source;
      return this;
    }

    public Builder destinationIndex(Integer destinationIndex) {
      this.destinationIndex = destinationIndex;
      return this;
    }


    public MoveDimension build() {
      return new MoveDimension(this);
    }
  }
}
