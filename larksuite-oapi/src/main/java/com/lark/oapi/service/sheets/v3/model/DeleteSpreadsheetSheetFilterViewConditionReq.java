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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteSpreadsheetSheetFilterViewConditionReq {

  @Path
  @SerializedName("spreadsheet_token")
  private String spreadsheetToken;
  @Path
  @SerializedName("sheet_id")
  private String sheetId;
  @Path
  @SerializedName("filter_view_id")
  private String filterViewId;
  @Path
  @SerializedName("condition_id")
  private String conditionId;

  // builder 开始
  public DeleteSpreadsheetSheetFilterViewConditionReq() {
  }

  public DeleteSpreadsheetSheetFilterViewConditionReq(Builder builder) {
    this.spreadsheetToken = builder.spreadsheetToken;
    this.sheetId = builder.sheetId;
    this.filterViewId = builder.filterViewId;
    this.conditionId = builder.conditionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getSpreadsheetToken() {
    return this.spreadsheetToken;
  }

  public void setSpreadsheetToken(String spreadsheetToken) {
    this.spreadsheetToken = spreadsheetToken;
  }

  public String getSheetId() {
    return this.sheetId;
  }

  public void setSheetId(String sheetId) {
    this.sheetId = sheetId;
  }

  public String getFilterViewId() {
    return this.filterViewId;
  }

  public void setFilterViewId(String filterViewId) {
    this.filterViewId = filterViewId;
  }

  public String getConditionId() {
    return this.conditionId;
  }

  public void setConditionId(String conditionId) {
    this.conditionId = conditionId;
  }

  public static class Builder {

    private String spreadsheetToken;
    private String sheetId;
    private String filterViewId;
    private String conditionId;

    public Builder spreadsheetToken(String spreadsheetToken) {
      this.spreadsheetToken = spreadsheetToken;
      return this;
    }

    public Builder sheetId(String sheetId) {
      this.sheetId = sheetId;
      return this;
    }

    public Builder filterViewId(String filterViewId) {
      this.filterViewId = filterViewId;
      return this;
    }

    public Builder conditionId(String conditionId) {
      this.conditionId = conditionId;
      return this;
    }

    public DeleteSpreadsheetSheetFilterViewConditionReq build() {
      return new DeleteSpreadsheetSheetFilterViewConditionReq(this);
    }
  }
}
