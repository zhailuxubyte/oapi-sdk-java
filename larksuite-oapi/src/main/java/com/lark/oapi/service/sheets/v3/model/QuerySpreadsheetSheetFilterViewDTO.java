// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class QuerySpreadsheetSheetFilterViewDTO {

  @SerializedName("items")
  private FilterView[] items;

  public FilterView[] getItems() {
    return this.items;
  }

  public void setItems(FilterView[] items) {
    this.items = items;
  }

}
