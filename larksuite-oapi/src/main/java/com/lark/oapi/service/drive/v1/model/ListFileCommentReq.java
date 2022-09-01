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

package com.lark.oapi.service.drive.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
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
public class ListFileCommentReq {
    @Query
    @SerializedName("file_type")
    private String fileType;
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    @Query
    @SerializedName("is_solved")
    private Boolean isSolved;
    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public Boolean getIsSolved() {
        return this.isSolved;
    }

    public void setIsSolved(Boolean isSolved) {
        this.isSolved = isSolved;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Path
    @SerializedName("file_token")
    private String fileToken;
    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }


// builder 开始
  public ListFileCommentReq(){}

  public ListFileCommentReq(Builder builder){
       this.fileType = builder.fileType;
       this.userIdType = builder.userIdType;
       this.isSolved = builder.isSolved;
       this.pageToken = builder.pageToken;
       this.pageSize = builder.pageSize;
       this.fileToken = builder.fileToken;
  }

    public static class Builder {
        private String fileType;
        private String userIdType;
        private Boolean isSolved;
        private String pageToken;
        private Integer pageSize;
    
           public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
           }
          public Builder fileType(com.lark.oapi.service.drive.v1.enums.FileTypeEnum fileType) {
               this.fileType = fileType.getValue();
               return this;
          }
    
           public Builder userIdType(String userIdType) {
                this.userIdType = userIdType;
                return this;
           }
          public Builder userIdType(com.lark.oapi.service.drive.v1.enums.UserIdTypeEnum userIdType) {
               this.userIdType = userIdType.getValue();
               return this;
          }
    
           public Builder isSolved(Boolean isSolved) {
                this.isSolved = isSolved;
                return this;
           }
    
           public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
           }
    
           public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
           }
    
        private String fileToken;
          public Builder fileToken(String fileToken) {
               this.fileToken = fileToken;
               return this;
          }
    
    public ListFileCommentReq build(){
        return new ListFileCommentReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
