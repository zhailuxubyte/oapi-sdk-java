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
public class GetFileStatisticsDTO {
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("file_type")
    private String fileType;
    @SerializedName("statistics")
    private FileStatistics statistics;
    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public FileStatistics getStatistics() {
        return this.statistics;
    }

    public void setStatistics(FileStatistics statistics) {
        this.statistics = statistics;
    }

}
