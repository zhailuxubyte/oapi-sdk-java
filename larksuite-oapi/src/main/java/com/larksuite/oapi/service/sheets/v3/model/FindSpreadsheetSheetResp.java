// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class FindSpreadsheetSheetResp extends BaseResponse {

    @SerializedName("data")
    private FindSpreadsheetSheetDTO body;

    public FindSpreadsheetSheetDTO getFindSpreadsheetSheetDTO() {
        return this.body;
    }

    public void setFindSpreadsheetSheetDTO(FindSpreadsheetSheetDTO body) {
        this.body = body;
    }
}
