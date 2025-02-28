// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class DocumentBlockBatchUpdateResult {
    @SerializedName("blocks")
    private Block[] blocks;
    @SerializedName("document_revision_id")
    private Integer documentRevisionId;
    @SerializedName("client_token")
    private String clientToken;

    public Block[] getBlocks() {
        return this.blocks;
    }

    public void setBlocks(Block[] blocks) {
        this.blocks = blocks;
    }

    public Integer getDocumentRevisionId() {
        return this.documentRevisionId;
    }

    public void setDocumentRevisionId(Integer documentRevisionId) {
        this.documentRevisionId = documentRevisionId;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

}
