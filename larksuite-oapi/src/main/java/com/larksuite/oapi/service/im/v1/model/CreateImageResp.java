// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class CreateImageResp extends BaseResponse {

    @SerializedName("data")
    private CreateImageDTO body;

    public CreateImageDTO getCreateImageDTO() {
        return this.body;
    }

    public void setCreateImageDTO(CreateImageDTO body) {
        this.body = body;
    }
}
