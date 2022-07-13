// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;
import com.larksuite.oapi.service.attendance.v1.enums.*;
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
public class GroupMeta {
    @SerializedName("group_id")
    private String groupId;
    @SerializedName("group_name")
    private String groupName;
    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


// builder 开始
  public GroupMeta(){}

  public GroupMeta(Builder builder){
      this.groupId = builder.groupId;
      this.groupName = builder.groupName;
  }

    public static class Builder {
        private String groupId;
        private String groupName;
        public Builder groupId(String groupId) {
             this.groupId = groupId;
             return this;
        }
    
        public Builder groupName(String groupName) {
             this.groupName = groupName;
             return this;
        }
    
    
    public GroupMeta build(){
        return new GroupMeta(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
