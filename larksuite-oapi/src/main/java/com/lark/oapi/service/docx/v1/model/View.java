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

public class View {

  @SerializedName("view_type")
  private Integer viewType;

  // builder 开始
  public View() {
  }

  public View(Builder builder) {
    this.viewType = builder.viewType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getViewType() {
    return this.viewType;
  }

  public void setViewType(Integer viewType) {
    this.viewType = viewType;
  }

  public static class Builder {

    private Integer viewType;

    public Builder viewType(Integer viewType) {
      this.viewType = viewType;
      return this;
    }

    public Builder viewType(com.lark.oapi.service.docx.v1.enums.ViewTypeEnum viewType) {
      this.viewType = viewType.getValue();
      return this;
    }


    public View build() {
      return new View(this);
    }
  }
}
