// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchCreateAppTableDTO {

  @SerializedName("table_ids")
  private String[] tableIds;

  public String[] getTableIds() {
    return this.tableIds;
  }

  public void setTableIds(String[] tableIds) {
    this.tableIds = tableIds;
  }

}
