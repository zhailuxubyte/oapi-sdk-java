// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class ListTaskResp extends BaseResponse {

    @SerializedName("data")
    private ListTaskDTO body;

    public ListTaskDTO getListTaskDTO() {
        return this.body;
    }

    public void setListTaskDTO(ListTaskDTO body) {
        this.body = body;
    }
}
