// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
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
public class BatchQueryMetaDTO {
    @SerializedName("metas")
    private Meta[] metas;
    @SerializedName("failed_list")
    private MetaFailed[] failedList;
    public Meta[] getMetas() {
        return this.metas;
    }

    public void setMetas(Meta[] metas) {
        this.metas = metas;
    }

    public MetaFailed[] getFailedList() {
        return this.failedList;
    }

    public void setFailedList(MetaFailed[] failedList) {
        this.failedList = failedList;
    }

}
