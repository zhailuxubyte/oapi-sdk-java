// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class SearchEntityResp extends BaseResponse {

    @SerializedName("data")
    private SearchEntityDTO body;

    public SearchEntityDTO getSearchEntityDTO() {
        return this.body;
    }

    public void setSearchEntityDTO(SearchEntityDTO body) {
        this.body = body;
    }
}
