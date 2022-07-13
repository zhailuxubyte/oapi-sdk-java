// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;
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
public class GetShiftResp extends BaseResponse{

    @SerializedName("data")
    private GetShiftDTO body;
    public GetShiftDTO getGetShiftDTO() {
        return this.body;
    }

    public void setGetShiftDTO(GetShiftDTO body) {
        this.body = body;
    }
}
