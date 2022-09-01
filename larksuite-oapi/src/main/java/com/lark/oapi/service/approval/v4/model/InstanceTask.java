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
public class InstanceTask {
    @SerializedName("id")
    private String id;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("open_id")
    private String openId;
    @SerializedName("status")
    private String status;
    @SerializedName("node_id")
    private String nodeId;
    @SerializedName("node_name")
    private String nodeName;
    @SerializedName("custom_node_id")
    private String customNodeId;
    @SerializedName("type")
    private String type;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("end_time")
    private String endTime;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getCustomNodeId() {
        return this.customNodeId;
    }

    public void setCustomNodeId(String customNodeId) {
        this.customNodeId = customNodeId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


// builder 开始
  public InstanceTask(){}

  public InstanceTask(Builder builder){
      this.id = builder.id;
      this.userId = builder.userId;
      this.openId = builder.openId;
      this.status = builder.status;
      this.nodeId = builder.nodeId;
      this.nodeName = builder.nodeName;
      this.customNodeId = builder.customNodeId;
      this.type = builder.type;
      this.startTime = builder.startTime;
      this.endTime = builder.endTime;
  }

    public static class Builder {
        private String id;
        private String userId;
        private String openId;
        private String status;
        private String nodeId;
        private String nodeName;
        private String customNodeId;
        private String type;
        private String startTime;
        private String endTime;
        public Builder id(String id) {
             this.id = id;
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
    
        public Builder status(String status) {
             this.status = status;
             return this;
        }
        public Builder status(com.lark.oapi.service.approval.v4.enums.StatusEnum status) {
             this.status = status.getValue();
             return this;
        }
    
        public Builder nodeId(String nodeId) {
             this.nodeId = nodeId;
             return this;
        }
    
        public Builder nodeName(String nodeName) {
             this.nodeName = nodeName;
             return this;
        }
    
        public Builder customNodeId(String customNodeId) {
             this.customNodeId = customNodeId;
             return this;
        }
    
        public Builder type(String type) {
             this.type = type;
             return this;
        }
        public Builder type(com.lark.oapi.service.approval.v4.enums.TypeEnum type) {
             this.type = type.getValue();
             return this;
        }
    
        public Builder startTime(String startTime) {
             this.startTime = startTime;
             return this;
        }
    
        public Builder endTime(String endTime) {
             this.endTime = endTime;
             return this;
        }
    
    
    public InstanceTask build(){
        return new InstanceTask(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
