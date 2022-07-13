// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
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
public class BatchGetIdUserResp extends BaseResponse{

    @SerializedName("data")
    private BatchGetIdUserDTO body;
    public BatchGetIdUserDTO getBatchGetIdUserDTO() {
        return this.body;
    }

    public void setBatchGetIdUserDTO(BatchGetIdUserDTO body) {
        this.body = body;
    }
}
