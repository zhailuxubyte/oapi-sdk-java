// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;
import com.google.gson.annotations.SerializedName;

public class AppTableRecordBatchDeleteReqBody {
    @SerializedName("records")
    private String[] records;

    public String[] getRecords() {
        return this.records;
    }

    public void setRecords(String[] records) {
        this.records = records;
    }

}
