// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class DeleteTableRowsRequest {
    @SerializedName("row_start_index")
    private Integer rowStartIndex;
    @SerializedName("row_end_index")
    private Integer rowEndIndex;

    public Integer getRowStartIndex() {
        return this.rowStartIndex;
    }

    public void setRowStartIndex(Integer rowStartIndex) {
        this.rowStartIndex = rowStartIndex;
    }

    public Integer getRowEndIndex() {
        return this.rowEndIndex;
    }

    public void setRowEndIndex(Integer rowEndIndex) {
        this.rowEndIndex = rowEndIndex;
    }

}
