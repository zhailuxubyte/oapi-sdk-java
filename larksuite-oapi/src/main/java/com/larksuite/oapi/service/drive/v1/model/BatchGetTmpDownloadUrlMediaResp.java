// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class BatchGetTmpDownloadUrlMediaResp extends BaseResponse {

    @SerializedName("data")
    private BatchGetTmpDownloadUrlMediaDTO body;

    public BatchGetTmpDownloadUrlMediaDTO getBatchGetTmpDownloadUrlMediaDTO() {
        return this.body;
    }

    public void setBatchGetTmpDownloadUrlMediaDTO(BatchGetTmpDownloadUrlMediaDTO body) {
        this.body = body;
    }
}
