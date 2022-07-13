// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v3.model;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class GetSpreadsheetSheetFilterViewConditionReq {
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


// builder 开始
  public GetSpreadsheetSheetFilterViewConditionReq(){}

  public GetSpreadsheetSheetFilterViewConditionReq(Builder builder){
       this.spreadsheetToken = builder.spreadsheetToken;
       this.sheetId = builder.sheetId;
       this.filterViewId = builder.filterViewId;
       this.conditionId = builder.conditionId;
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
    
    public GetSpreadsheetSheetFilterViewConditionReq build(){
        return new GetSpreadsheetSheetFilterViewConditionReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
