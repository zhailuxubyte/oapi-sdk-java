// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class CreateImportTaskResp extends BaseResponse {

    @SerializedName("data")
    private CreateImportTaskDTO body;

    public CreateImportTaskDTO getCreateImportTaskDTO() {
        return this.body;
    }

    public void setCreateImportTaskDTO(CreateImportTaskDTO body) {
        this.body = body;
    }
}
