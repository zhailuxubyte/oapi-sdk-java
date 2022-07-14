// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class DeleteTableRowsRequest {

  @SerializedName("row_start_index")
  private Integer rowStartIndex;
  @SerializedName("row_end_index")
  private Integer rowEndIndex;

  // builder 开始
  public DeleteTableRowsRequest() {
  }

  public DeleteTableRowsRequest(Builder builder) {
    this.rowStartIndex = builder.rowStartIndex;
    this.rowEndIndex = builder.rowEndIndex;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getRowStartIndex() {
    return this.rowStartIndex;
  }

  public void setRowStartIndex(Integer rowStartIndex) {
    this.rowStartIndex = rowStartIndex;
  }

  public Integer getRowEndIndex() {
    return this.rowEndIndex;
  }

  public void setRowEndIndex(Integer rowEndIndex) {
    this.rowEndIndex = rowEndIndex;
  }

  public static class Builder {

    private Integer rowStartIndex;
    private Integer rowEndIndex;

    public Builder rowStartIndex(Integer rowStartIndex) {
      this.rowStartIndex = rowStartIndex;
      return this;
    }

    public Builder rowEndIndex(Integer rowEndIndex) {
      this.rowEndIndex = rowEndIndex;
      return this;
    }


    public DeleteTableRowsRequest build() {
      return new DeleteTableRowsRequest(this);
    }
  }
}
