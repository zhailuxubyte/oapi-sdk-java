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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class Sheet {

  @SerializedName("token")
  private String token;
  @SerializedName("row_size")
  private Integer rowSize;
  @SerializedName("column_size")
  private Integer columnSize;

  // builder 开始
  public Sheet() {
  }

  public Sheet(Builder builder) {
    this.token = builder.token;
    this.rowSize = builder.rowSize;
    this.columnSize = builder.columnSize;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Integer getRowSize() {
    return this.rowSize;
  }

  public void setRowSize(Integer rowSize) {
    this.rowSize = rowSize;
  }

  public Integer getColumnSize() {
    return this.columnSize;
  }

  public void setColumnSize(Integer columnSize) {
    this.columnSize = columnSize;
  }

  public static class Builder {

    private String token;
    private Integer rowSize;
    private Integer columnSize;

    public Builder token(String token) {
      this.token = token;
      return this;
    }

    public Builder rowSize(Integer rowSize) {
      this.rowSize = rowSize;
      return this;
    }

    public Builder columnSize(Integer columnSize) {
      this.columnSize = columnSize;
      return this;
    }


    public Sheet build() {
      return new Sheet(this);
    }
  }
}
