// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class SearchTaskResp extends BaseResponse {

    @SerializedName("data")
    private SearchTaskDTO body;

    public SearchTaskDTO getSearchTaskDTO() {
        return this.body;
    }

    public void setSearchTaskDTO(SearchTaskDTO body) {
        this.body = body;
    }
}
