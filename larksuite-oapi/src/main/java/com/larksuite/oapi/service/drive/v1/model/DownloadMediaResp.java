// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
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
public class DownloadMediaResp extends BaseResponse{

    private ByteArrayOutputStream fileStream;
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ByteArrayOutputStream getFileStream() {
        return fileStream;
    }

    public void setFileStream(ByteArrayOutputStream fileStream) {
        this.fileStream = fileStream;
    }

    public void writeFile(String path) throws IOException {
        if (Strings.isEmpty(path)) {
            throw new RuntimeException("path is blank");
        }
        FileOutputStream file = new FileOutputStream(path);
        file.write(getFileStream().toByteArray());
        file.close();
    }}
