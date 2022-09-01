// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.docx.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.docx.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;
public class CreateDocumentBlockChildrenReq {
    @Query
    @SerializedName("document_revision_id")
    private Integer documentRevisionId;
    @Query
    @SerializedName("client_token")
    private String clientToken;
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
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

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    @Path
    @SerializedName("document_id")
    private String documentId;
    @Path
    @SerializedName("block_id")
    private String blockId;
    public String getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    @Body
    private CreateDocumentBlockChildrenReqBody body;

    public CreateDocumentBlockChildrenReqBody getCreateDocumentBlockChildrenReqBody() {
        return this.body;
    }

    public void setCreateDocumentBlockChildrenReqBody(CreateDocumentBlockChildrenReqBody body) {
        this.body = body;
    }

// builder 开始
  public CreateDocumentBlockChildrenReq(){}

  public CreateDocumentBlockChildrenReq(Builder builder){
       this.documentRevisionId = builder.documentRevisionId;
       this.clientToken = builder.clientToken;
       this.userIdType = builder.userIdType;
       this.documentId = builder.documentId;
       this.blockId = builder.blockId;
        this.body = builder.body;
  }

    public static class Builder {
        private Integer documentRevisionId;
        private String clientToken;
        private String userIdType;
    
           public Builder documentRevisionId(Integer documentRevisionId) {
                this.documentRevisionId = documentRevisionId;
                return this;
           }
    
           public Builder clientToken(String clientToken) {
                this.clientToken = clientToken;
                return this;
           }
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.lark.oapi.service.docx.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
        private String documentId;
        private String blockId;
          public Builder documentId(String documentId) {
               this.documentId = documentId;
               return this;
          }
    
          public Builder blockId(String blockId) {
               this.blockId = blockId;
               return this;
          }
    
        private CreateDocumentBlockChildrenReqBody body;
    
        public CreateDocumentBlockChildrenReqBody getCreateDocumentBlockChildrenReqBody() {
            return this.body;
        }
        public Builder createDocumentBlockChildrenReqBody(CreateDocumentBlockChildrenReqBody body) {
             this.body = body;
             return this;
        }
    public CreateDocumentBlockChildrenReq build(){
        return new CreateDocumentBlockChildrenReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
