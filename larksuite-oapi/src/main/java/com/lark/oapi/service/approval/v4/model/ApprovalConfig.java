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

package com.lark.oapi.service.approval.v4.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
import com.google.gson.annotations.SerializedName;
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
public class ApprovalConfig {
    @SerializedName("can_update_viewer")
    private Boolean canUpdateViewer;
    @SerializedName("can_update_form")
    private Boolean canUpdateForm;
    @SerializedName("can_update_process")
    private Boolean canUpdateProcess;
    @SerializedName("can_update_revert")
    private Boolean canUpdateRevert;
    @SerializedName("help_url")
    private String helpUrl;
    public Boolean getCanUpdateViewer() {
        return this.canUpdateViewer;
    }

    public void setCanUpdateViewer(Boolean canUpdateViewer) {
        this.canUpdateViewer = canUpdateViewer;
    }

    public Boolean getCanUpdateForm() {
        return this.canUpdateForm;
    }

    public void setCanUpdateForm(Boolean canUpdateForm) {
        this.canUpdateForm = canUpdateForm;
    }

    public Boolean getCanUpdateProcess() {
        return this.canUpdateProcess;
    }

    public void setCanUpdateProcess(Boolean canUpdateProcess) {
        this.canUpdateProcess = canUpdateProcess;
    }

    public Boolean getCanUpdateRevert() {
        return this.canUpdateRevert;
    }

    public void setCanUpdateRevert(Boolean canUpdateRevert) {
        this.canUpdateRevert = canUpdateRevert;
    }

    public String getHelpUrl() {
        return this.helpUrl;
    }

    public void setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
    }


// builder 开始
  public ApprovalConfig(){}

  public ApprovalConfig(Builder builder){
      this.canUpdateViewer = builder.canUpdateViewer;
      this.canUpdateForm = builder.canUpdateForm;
      this.canUpdateProcess = builder.canUpdateProcess;
      this.canUpdateRevert = builder.canUpdateRevert;
      this.helpUrl = builder.helpUrl;
  }

    public static class Builder {
        private Boolean canUpdateViewer;
        private Boolean canUpdateForm;
        private Boolean canUpdateProcess;
        private Boolean canUpdateRevert;
        private String helpUrl;
        public Builder canUpdateViewer(Boolean canUpdateViewer) {
             this.canUpdateViewer = canUpdateViewer;
             return this;
        }
    
        public Builder canUpdateForm(Boolean canUpdateForm) {
             this.canUpdateForm = canUpdateForm;
             return this;
        }
    
        public Builder canUpdateProcess(Boolean canUpdateProcess) {
             this.canUpdateProcess = canUpdateProcess;
             return this;
        }
    
        public Builder canUpdateRevert(Boolean canUpdateRevert) {
             this.canUpdateRevert = canUpdateRevert;
             return this;
        }
    
        public Builder helpUrl(String helpUrl) {
             this.helpUrl = helpUrl;
             return this;
        }
    
    
    public ApprovalConfig build(){
        return new ApprovalConfig(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
