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
public class InstanceCreate {
    @SerializedName("approval_code")
    private String approvalCode;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("open_id")
    private String openId;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("form")
    private String form;
    @SerializedName("node_approver_user_id_list")
    private NodeApprover[] nodeApproverUserIdList;
    @SerializedName("node_approver_open_id_list")
    private NodeApprover[] nodeApproverOpenIdList;
    @SerializedName("node_cc_user_id_list")
    private NodeCc[] nodeCcUserIdList;
    @SerializedName("node_cc_open_id_list")
    private NodeCc[] nodeCcOpenIdList;
    @SerializedName("uuid")
    private String uuid;
    public String getApprovalCode() {
        return this.approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getForm() {
        return this.form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public NodeApprover[] getNodeApproverUserIdList() {
        return this.nodeApproverUserIdList;
    }

    public void setNodeApproverUserIdList(NodeApprover[] nodeApproverUserIdList) {
        this.nodeApproverUserIdList = nodeApproverUserIdList;
    }

    public NodeApprover[] getNodeApproverOpenIdList() {
        return this.nodeApproverOpenIdList;
    }

    public void setNodeApproverOpenIdList(NodeApprover[] nodeApproverOpenIdList) {
        this.nodeApproverOpenIdList = nodeApproverOpenIdList;
    }

    public NodeCc[] getNodeCcUserIdList() {
        return this.nodeCcUserIdList;
    }

    public void setNodeCcUserIdList(NodeCc[] nodeCcUserIdList) {
        this.nodeCcUserIdList = nodeCcUserIdList;
    }

    public NodeCc[] getNodeCcOpenIdList() {
        return this.nodeCcOpenIdList;
    }

    public void setNodeCcOpenIdList(NodeCc[] nodeCcOpenIdList) {
        this.nodeCcOpenIdList = nodeCcOpenIdList;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


// builder 开始
  public InstanceCreate(){}

  public InstanceCreate(Builder builder){
      this.approvalCode = builder.approvalCode;
      this.userId = builder.userId;
      this.openId = builder.openId;
      this.departmentId = builder.departmentId;
      this.form = builder.form;
      this.nodeApproverUserIdList = builder.nodeApproverUserIdList;
      this.nodeApproverOpenIdList = builder.nodeApproverOpenIdList;
      this.nodeCcUserIdList = builder.nodeCcUserIdList;
      this.nodeCcOpenIdList = builder.nodeCcOpenIdList;
      this.uuid = builder.uuid;
  }

    public static class Builder {
        private String approvalCode;
        private String userId;
        private String openId;
        private String departmentId;
        private String form;
        private NodeApprover[] nodeApproverUserIdList;
        private NodeApprover[] nodeApproverOpenIdList;
        private NodeCc[] nodeCcUserIdList;
        private NodeCc[] nodeCcOpenIdList;
        private String uuid;
        public Builder approvalCode(String approvalCode) {
             this.approvalCode = approvalCode;
             return this;
        }
    
        public Builder userId(String userId) {
             this.userId = userId;
             return this;
        }
    
        public Builder openId(String openId) {
             this.openId = openId;
             return this;
        }
    
        public Builder departmentId(String departmentId) {
             this.departmentId = departmentId;
             return this;
        }
    
        public Builder form(String form) {
             this.form = form;
             return this;
        }
    
        public Builder nodeApproverUserIdList(NodeApprover[] nodeApproverUserIdList) {
             this.nodeApproverUserIdList = nodeApproverUserIdList;
             return this;
        }
    
        public Builder nodeApproverOpenIdList(NodeApprover[] nodeApproverOpenIdList) {
             this.nodeApproverOpenIdList = nodeApproverOpenIdList;
             return this;
        }
    
        public Builder nodeCcUserIdList(NodeCc[] nodeCcUserIdList) {
             this.nodeCcUserIdList = nodeCcUserIdList;
             return this;
        }
    
        public Builder nodeCcOpenIdList(NodeCc[] nodeCcOpenIdList) {
             this.nodeCcOpenIdList = nodeCcOpenIdList;
             return this;
        }
    
        public Builder uuid(String uuid) {
             this.uuid = uuid;
             return this;
        }
    
    
    public InstanceCreate build(){
        return new InstanceCreate(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
