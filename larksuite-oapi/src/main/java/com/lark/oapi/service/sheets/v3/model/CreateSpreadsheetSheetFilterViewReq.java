// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class CreateSpreadsheetSheetFilterViewReq {

  @Path
  @SerializedName("spreadsheet_token")
  private String spreadsheetToken;
  @Path
  @SerializedName("sheet_id")
  private String sheetId;
  @Body
  private FilterView body;

  // builder 开始
  public CreateSpreadsheetSheetFilterViewReq() {
  }

  public CreateSpreadsheetSheetFilterViewReq(Builder builder) {
    this.spreadsheetToken = builder.spreadsheetToken;
    this.sheetId = builder.sheetId;
    this.body = builder.body;
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

  public FilterView getFilterView() {
    return this.body;
  }

  public void setFilterView(FilterView body) {
    this.body = body;
  }

  public static class Builder {

    private String spreadsheetToken;
    private String sheetId;
    private FilterView body;

    public Builder spreadsheetToken(String spreadsheetToken) {
      this.spreadsheetToken = spreadsheetToken;
      return this;
    }

    public Builder sheetId(String sheetId) {
      this.sheetId = sheetId;
      return this;
    }

    public FilterView getFilterView() {
      return this.body;
    }

    public Builder filterView(FilterView body) {
      this.body = body;
      return this;
    }

    public CreateSpreadsheetSheetFilterViewReq build() {
      return new CreateSpreadsheetSheetFilterViewReq(this);
    }
  }
}
