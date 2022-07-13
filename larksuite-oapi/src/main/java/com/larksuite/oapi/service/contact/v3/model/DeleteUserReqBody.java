// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.larksuite.oapi.service.contact.v3.enums.*;
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
public class DeleteUserReqBody {
    @SerializedName("department_chat_acceptor_user_id")
    private String departmentChatAcceptorUserId;
    @SerializedName("external_chat_acceptor_user_id")
    private String externalChatAcceptorUserId;
    @SerializedName("docs_acceptor_user_id")
    private String docsAcceptorUserId;
    @SerializedName("calendar_acceptor_user_id")
    private String calendarAcceptorUserId;
    @SerializedName("application_acceptor_user_id")
    private String applicationAcceptorUserId;
    @SerializedName("helpdesk_acceptor_user_id")
    private String helpdeskAcceptorUserId;
    public String getDepartmentChatAcceptorUserId() {
        return this.departmentChatAcceptorUserId;
    }

    public void setDepartmentChatAcceptorUserId(String departmentChatAcceptorUserId) {
        this.departmentChatAcceptorUserId = departmentChatAcceptorUserId;
    }

    public String getExternalChatAcceptorUserId() {
        return this.externalChatAcceptorUserId;
    }

    public void setExternalChatAcceptorUserId(String externalChatAcceptorUserId) {
        this.externalChatAcceptorUserId = externalChatAcceptorUserId;
    }

    public String getDocsAcceptorUserId() {
        return this.docsAcceptorUserId;
    }

    public void setDocsAcceptorUserId(String docsAcceptorUserId) {
        this.docsAcceptorUserId = docsAcceptorUserId;
    }

    public String getCalendarAcceptorUserId() {
        return this.calendarAcceptorUserId;
    }

    public void setCalendarAcceptorUserId(String calendarAcceptorUserId) {
        this.calendarAcceptorUserId = calendarAcceptorUserId;
    }

    public String getApplicationAcceptorUserId() {
        return this.applicationAcceptorUserId;
    }

    public void setApplicationAcceptorUserId(String applicationAcceptorUserId) {
        this.applicationAcceptorUserId = applicationAcceptorUserId;
    }

    public String getHelpdeskAcceptorUserId() {
        return this.helpdeskAcceptorUserId;
    }

    public void setHelpdeskAcceptorUserId(String helpdeskAcceptorUserId) {
        this.helpdeskAcceptorUserId = helpdeskAcceptorUserId;
    }


// builder 开始
  public DeleteUserReqBody(){}

  public DeleteUserReqBody(Builder builder){
      this.departmentChatAcceptorUserId = builder.departmentChatAcceptorUserId;
      this.externalChatAcceptorUserId = builder.externalChatAcceptorUserId;
      this.docsAcceptorUserId = builder.docsAcceptorUserId;
      this.calendarAcceptorUserId = builder.calendarAcceptorUserId;
      this.applicationAcceptorUserId = builder.applicationAcceptorUserId;
      this.helpdeskAcceptorUserId = builder.helpdeskAcceptorUserId;
  }

    public static class Builder {
        private String departmentChatAcceptorUserId;
        private String externalChatAcceptorUserId;
        private String docsAcceptorUserId;
        private String calendarAcceptorUserId;
        private String applicationAcceptorUserId;
        private String helpdeskAcceptorUserId;
        public Builder departmentChatAcceptorUserId(String departmentChatAcceptorUserId) {
             this.departmentChatAcceptorUserId = departmentChatAcceptorUserId;
             return this;
        }
    
        public Builder externalChatAcceptorUserId(String externalChatAcceptorUserId) {
             this.externalChatAcceptorUserId = externalChatAcceptorUserId;
             return this;
        }
    
        public Builder docsAcceptorUserId(String docsAcceptorUserId) {
             this.docsAcceptorUserId = docsAcceptorUserId;
             return this;
        }
    
        public Builder calendarAcceptorUserId(String calendarAcceptorUserId) {
             this.calendarAcceptorUserId = calendarAcceptorUserId;
             return this;
        }
    
        public Builder applicationAcceptorUserId(String applicationAcceptorUserId) {
             this.applicationAcceptorUserId = applicationAcceptorUserId;
             return this;
        }
    
        public Builder helpdeskAcceptorUserId(String helpdeskAcceptorUserId) {
             this.helpdeskAcceptorUserId = helpdeskAcceptorUserId;
             return this;
        }
    
    
    public DeleteUserReqBody build(){
        return new DeleteUserReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
