// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.admin.v1.model;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class ListAdminDeptStatResp extends BaseResponse{

    @SerializedName("data")
    private ListAdminDeptStatDTO body;
    public ListAdminDeptStatDTO getListAdminDeptStatDTO() {
        return this.body;
    }

    public void setListAdminDeptStatDTO(ListAdminDeptStatDTO body) {
        this.body = body;
    }
}
