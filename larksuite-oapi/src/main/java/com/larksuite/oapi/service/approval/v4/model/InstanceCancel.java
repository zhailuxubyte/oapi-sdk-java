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
public class InstanceCancel {
    @SerializedName("approval_code")
    private String approvalCode;
    @SerializedName("instance_code")
    private String instanceCode;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("notify_starter")
    private Boolean notifyStarter;
    public String getApprovalCode() {
        return this.approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getInstanceCode() {
        return this.instanceCode;
    }

    public void setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getNotifyStarter() {
        return this.notifyStarter;
    }

    public void setNotifyStarter(Boolean notifyStarter) {
        this.notifyStarter = notifyStarter;
    }


// builder 开始
  public InstanceCancel(){}

  public InstanceCancel(Builder builder){
      this.approvalCode = builder.approvalCode;
      this.instanceCode = builder.instanceCode;
      this.userId = builder.userId;
      this.notifyStarter = builder.notifyStarter;
  }

    public static class Builder {
        private String approvalCode;
        private String instanceCode;
        private String userId;
        private Boolean notifyStarter;
        public Builder approvalCode(String approvalCode) {
             this.approvalCode = approvalCode;
             return this;
        }
    
        public Builder instanceCode(String instanceCode) {
             this.instanceCode = instanceCode;
             return this;
        }
    
        public Builder userId(String userId) {
             this.userId = userId;
             return this;
        }
    
        public Builder notifyStarter(Boolean notifyStarter) {
             this.notifyStarter = notifyStarter;
             return this;
        }
    
    
    public InstanceCancel build(){
        return new InstanceCancel(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
