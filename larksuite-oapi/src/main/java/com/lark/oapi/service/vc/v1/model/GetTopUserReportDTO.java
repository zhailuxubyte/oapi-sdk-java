// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class GetTopUserReportDTO {

  @SerializedName("top_user_report")
  private ReportTopUser[] topUserReport;

  public ReportTopUser[] getTopUserReport() {
    return this.topUserReport;
  }

  public void setTopUserReport(ReportTopUser[] topUserReport) {
    this.topUserReport = topUserReport;
  }

}
