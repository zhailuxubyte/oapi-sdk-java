// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;
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
public class UrgentAppMessageDTO {
    @SerializedName("invalid_user_id_list")
    private String[] invalidUserIdList;
    public String[] getInvalidUserIdList() {
        return this.invalidUserIdList;
    }

    public void setInvalidUserIdList(String[] invalidUserIdList) {
        this.invalidUserIdList = invalidUserIdList;
    }

}
