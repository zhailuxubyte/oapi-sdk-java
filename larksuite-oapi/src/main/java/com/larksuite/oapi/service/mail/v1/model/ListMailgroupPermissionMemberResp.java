// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class ListMailgroupPermissionMemberResp extends BaseResponse {

    @SerializedName("data")
    private ListMailgroupPermissionMemberDTO body;

    public ListMailgroupPermissionMemberDTO getListMailgroupPermissionMemberDTO() {
        return this.body;
    }

    public void setListMailgroupPermissionMemberDTO(ListMailgroupPermissionMemberDTO body) {
        this.body = body;
    }
}
