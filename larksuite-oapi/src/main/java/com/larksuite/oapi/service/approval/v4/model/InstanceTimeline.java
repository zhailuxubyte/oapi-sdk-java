// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.approval.v4.model;
import com.larksuite.oapi.service.approval.v4.enums.*;
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
public class InstanceTimeline {
    @SerializedName("type")
    private String type;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("open_id")
    private String openId;
    @SerializedName("user_id_list")
    private String[] userIdList;
    @SerializedName("open_id_list")
    private String[] openIdList;
    @SerializedName("task_id")
    private String taskId;
    @SerializedName("comment")
    private String comment;
    @SerializedName("cc_user_list")
    private InstanceCcUser[] ccUserList;
    @SerializedName("ext")
    private String ext;
    @SerializedName("node_key")
    private String nodeKey;
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
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

    public String[] getUserIdList() {
        return this.userIdList;
    }

    public void setUserIdList(String[] userIdList) {
        this.userIdList = userIdList;
    }

    public String[] getOpenIdList() {
        return this.openIdList;
    }

    public void setOpenIdList(String[] openIdList) {
        this.openIdList = openIdList;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public InstanceCcUser[] getCcUserList() {
        return this.ccUserList;
    }

    public void setCcUserList(InstanceCcUser[] ccUserList) {
        this.ccUserList = ccUserList;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getNodeKey() {
        return this.nodeKey;
    }

    public void setNodeKey(String nodeKey) {
        this.nodeKey = nodeKey;
    }


// builder 开始
  public InstanceTimeline(){}

  public InstanceTimeline(Builder builder){
      this.type = builder.type;
      this.createTime = builder.createTime;
      this.userId = builder.userId;
      this.openId = builder.openId;
      this.userIdList = builder.userIdList;
      this.openIdList = builder.openIdList;
      this.taskId = builder.taskId;
      this.comment = builder.comment;
      this.ccUserList = builder.ccUserList;
      this.ext = builder.ext;
      this.nodeKey = builder.nodeKey;
  }

    public static class Builder {
        private String type;
        private Long createTime;
        private String userId;
        private String openId;
        private String[] userIdList;
        private String[] openIdList;
        private String taskId;
        private String comment;
        private InstanceCcUser[] ccUserList;
        private String ext;
        private String nodeKey;
        public Builder type(String type) {
             this.type = type;
             return this;
        }
        public Builder type(com.larksuite.oapi.service.approval.v4.enums.TypeEnum type) {
             this.type = type.getValue();
             return this;
        }
    
        public Builder createTime(Long createTime) {
             this.createTime = createTime;
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
    
        public Builder userIdList(String[] userIdList) {
             this.userIdList = userIdList;
             return this;
        }
    
        public Builder openIdList(String[] openIdList) {
             this.openIdList = openIdList;
             return this;
        }
    
        public Builder taskId(String taskId) {
             this.taskId = taskId;
             return this;
        }
    
        public Builder comment(String comment) {
             this.comment = comment;
             return this;
        }
    
        public Builder ccUserList(InstanceCcUser[] ccUserList) {
             this.ccUserList = ccUserList;
             return this;
        }
    
        public Builder ext(String ext) {
             this.ext = ext;
             return this;
        }
    
        public Builder nodeKey(String nodeKey) {
             this.nodeKey = nodeKey;
             return this;
        }
    
    
    public InstanceTimeline build(){
        return new InstanceTimeline(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
