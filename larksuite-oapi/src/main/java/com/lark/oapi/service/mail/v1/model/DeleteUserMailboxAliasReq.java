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

package com.lark.oapi.service.mail.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.mail.v1.enums.*;
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
public class DeleteUserMailboxAliasReq {
    @Path
    @SerializedName("user_mailbox_id")
    private String userMailboxId;
    @Path
    @SerializedName("alias_id")
    private String aliasId;
    public String getUserMailboxId() {
        return this.userMailboxId;
    }

    public void setUserMailboxId(String userMailboxId) {
        this.userMailboxId = userMailboxId;
    }

    public String getAliasId() {
        return this.aliasId;
    }

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }


// builder 开始
  public DeleteUserMailboxAliasReq(){}

  public DeleteUserMailboxAliasReq(Builder builder){
       this.userMailboxId = builder.userMailboxId;
       this.aliasId = builder.aliasId;
  }

    public static class Builder {
    
        private String userMailboxId;
        private String aliasId;
          public Builder userMailboxId(String userMailboxId) {
               this.userMailboxId = userMailboxId;
               return this;
          }
    
          public Builder aliasId(String aliasId) {
               this.aliasId = aliasId;
               return this;
          }
    
    public DeleteUserMailboxAliasReq build(){
        return new DeleteUserMailboxAliasReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
