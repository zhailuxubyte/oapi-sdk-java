// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class UnmergeTableCellsRequest {

  @SerializedName("row_index")
  private Integer rowIndex;
  @SerializedName("column_index")
  private Integer columnIndex;

  // builder 开始
  public UnmergeTableCellsRequest() {
  }

  public UnmergeTableCellsRequest(Builder builder) {
    this.rowIndex = builder.rowIndex;
    this.columnIndex = builder.columnIndex;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getRowIndex() {
    return this.rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public Integer getColumnIndex() {
    return this.columnIndex;
  }

  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }

  public static class Builder {

    private Integer rowIndex;
    private Integer columnIndex;

    public Builder rowIndex(Integer rowIndex) {
      this.rowIndex = rowIndex;
      return this;
    }

    public Builder columnIndex(Integer columnIndex) {
      this.columnIndex = columnIndex;
      return this;
    }


    public UnmergeTableCellsRequest build() {
      return new UnmergeTableCellsRequest(this);
    }
  }
}
