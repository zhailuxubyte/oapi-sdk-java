// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class GetApplicationAppVersionResp extends BaseResponse {

    @SerializedName("data")
    private GetApplicationAppVersionDTO body;

    public GetApplicationAppVersionDTO getGetApplicationAppVersionDTO() {
        return this.body;
    }

    public void setGetApplicationAppVersionDTO(GetApplicationAppVersionDTO body) {
        this.body = body;
    }
}
