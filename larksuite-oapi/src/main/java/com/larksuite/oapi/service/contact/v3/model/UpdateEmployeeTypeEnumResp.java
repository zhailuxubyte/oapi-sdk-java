// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class UpdateEmployeeTypeEnumResp extends BaseResponse {

    @SerializedName("data")
    private UpdateEmployeeTypeEnumDTO body;

    public UpdateEmployeeTypeEnumDTO getUpdateEmployeeTypeEnumDTO() {
        return this.body;
    }

    public void setUpdateEmployeeTypeEnumDTO(UpdateEmployeeTypeEnumDTO body) {
        this.body = body;
    }
}
