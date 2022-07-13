// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateDocumentReqBody {
    @SerializedName("folder_token")
    private String folderToken;
    @SerializedName("title")
    private String title;

    // builder 开始
    public CreateDocumentReqBody() {
    }

    public CreateDocumentReqBody(Builder builder) {
        this.folderToken = builder.folderToken;
        this.title = builder.title;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFolderToken() {
        return this.folderToken;
    }

    public void setFolderToken(String folderToken) {
        this.folderToken = folderToken;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class Builder {
        private String folderToken;
        private String title;

        public Builder folderToken(String folderToken) {
            this.folderToken = folderToken;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }


        public CreateDocumentReqBody build() {
            return new CreateDocumentReqBody(this);
        }
    }
}
