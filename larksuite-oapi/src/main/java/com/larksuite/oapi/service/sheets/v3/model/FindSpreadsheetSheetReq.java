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
public class FindSpreadsheetSheetReq {
    @Path
    @SerializedName("spreadsheet_token")
    private String spreadsheetToken;
    @Path
    @SerializedName("sheet_id")
    private String sheetId;
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

    @Body
    private Find body;

    public Find getFind() {
        return this.body;
    }

    public void setFind(Find body) {
        this.body = body;
    }

// builder 开始
  public FindSpreadsheetSheetReq(){}

  public FindSpreadsheetSheetReq(Builder builder){
       this.spreadsheetToken = builder.spreadsheetToken;
       this.sheetId = builder.sheetId;
        this.body = builder.body;
  }

    public static class Builder {
    
        private String spreadsheetToken;
        private String sheetId;
          public Builder spreadsheetToken(String spreadsheetToken) {
               this.spreadsheetToken = spreadsheetToken;
               return this;
          }
    
          public Builder sheetId(String sheetId) {
               this.sheetId = sheetId;
               return this;
          }
    
        private Find body;
    
        public Find getFind() {
            return this.body;
        }
        public Builder find(Find body) {
             this.body = body;
             return this;
        }
    public FindSpreadsheetSheetReq build(){
        return new FindSpreadsheetSheetReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
