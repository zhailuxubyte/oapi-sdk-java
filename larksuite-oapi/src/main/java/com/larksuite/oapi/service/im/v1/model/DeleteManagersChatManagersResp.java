// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class DeleteManagersChatManagersResp extends BaseResponse {

    @SerializedName("data")
    private DeleteManagersChatManagersDTO body;

    public DeleteManagersChatManagersDTO getDeleteManagersChatManagersDTO() {
        return this.body;
    }

    public void setDeleteManagersChatManagersDTO(DeleteManagersChatManagersDTO body) {
        this.body = body;
    }
}
