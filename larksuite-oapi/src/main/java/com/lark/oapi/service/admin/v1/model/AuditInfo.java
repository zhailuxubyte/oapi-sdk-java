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

package com.lark.oapi.service.admin.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.admin.v1.enums.*;
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
public class AuditInfo {
    @SerializedName("event_id")
    private String eventId;
    @SerializedName("unique_id")
    private String uniqueId;
    @SerializedName("event_name")
    private String eventName;
    @SerializedName("department_ids")
    private String[] departmentIds;
    @SerializedName("event_module")
    private Integer eventModule;
    @SerializedName("operator_type")
    private Integer operatorType;
    @SerializedName("operator_value")
    private String operatorValue;
    @SerializedName("objects")
    private AuditObjectEntity[] objects;
    @SerializedName("recipients")
    private AuditRecipientEntity[] recipients;
    @SerializedName("event_time")
    private Integer eventTime;
    @SerializedName("ip")
    private String ip;
    @SerializedName("operator_app")
    private String operatorApp;
    @SerializedName("audit_context")
    private AuditContext auditContext;
    @SerializedName("extend")
    private AuditEventExtend extend;
    @SerializedName("operator_app_name")
    private String operatorAppName;
    @SerializedName("common_drawers")
    private ApiAuditCommonDrawers commonDrawers;
    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public Integer getEventModule() {
        return this.eventModule;
    }

    public void setEventModule(Integer eventModule) {
        this.eventModule = eventModule;
    }

    public Integer getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public String getOperatorValue() {
        return this.operatorValue;
    }

    public void setOperatorValue(String operatorValue) {
        this.operatorValue = operatorValue;
    }

    public AuditObjectEntity[] getObjects() {
        return this.objects;
    }

    public void setObjects(AuditObjectEntity[] objects) {
        this.objects = objects;
    }

    public AuditRecipientEntity[] getRecipients() {
        return this.recipients;
    }

    public void setRecipients(AuditRecipientEntity[] recipients) {
        this.recipients = recipients;
    }

    public Integer getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(Integer eventTime) {
        this.eventTime = eventTime;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOperatorApp() {
        return this.operatorApp;
    }

    public void setOperatorApp(String operatorApp) {
        this.operatorApp = operatorApp;
    }

    public AuditContext getAuditContext() {
        return this.auditContext;
    }

    public void setAuditContext(AuditContext auditContext) {
        this.auditContext = auditContext;
    }

    public AuditEventExtend getExtend() {
        return this.extend;
    }

    public void setExtend(AuditEventExtend extend) {
        this.extend = extend;
    }

    public String getOperatorAppName() {
        return this.operatorAppName;
    }

    public void setOperatorAppName(String operatorAppName) {
        this.operatorAppName = operatorAppName;
    }

    public ApiAuditCommonDrawers getCommonDrawers() {
        return this.commonDrawers;
    }

    public void setCommonDrawers(ApiAuditCommonDrawers commonDrawers) {
        this.commonDrawers = commonDrawers;
    }


// builder 开始
  public AuditInfo(){}

  public AuditInfo(Builder builder){
      this.eventId = builder.eventId;
      this.uniqueId = builder.uniqueId;
      this.eventName = builder.eventName;
      this.departmentIds = builder.departmentIds;
      this.eventModule = builder.eventModule;
      this.operatorType = builder.operatorType;
      this.operatorValue = builder.operatorValue;
      this.objects = builder.objects;
      this.recipients = builder.recipients;
      this.eventTime = builder.eventTime;
      this.ip = builder.ip;
      this.operatorApp = builder.operatorApp;
      this.auditContext = builder.auditContext;
      this.extend = builder.extend;
      this.operatorAppName = builder.operatorAppName;
      this.commonDrawers = builder.commonDrawers;
  }

    public static class Builder {
        private String eventId;
        private String uniqueId;
        private String eventName;
        private String[] departmentIds;
        private Integer eventModule;
        private Integer operatorType;
        private String operatorValue;
        private AuditObjectEntity[] objects;
        private AuditRecipientEntity[] recipients;
        private Integer eventTime;
        private String ip;
        private String operatorApp;
        private AuditContext auditContext;
        private AuditEventExtend extend;
        private String operatorAppName;
        private ApiAuditCommonDrawers commonDrawers;
        public Builder eventId(String eventId) {
             this.eventId = eventId;
             return this;
        }
    
        public Builder uniqueId(String uniqueId) {
             this.uniqueId = uniqueId;
             return this;
        }
    
        public Builder eventName(String eventName) {
             this.eventName = eventName;
             return this;
        }
    
        public Builder departmentIds(String[] departmentIds) {
             this.departmentIds = departmentIds;
             return this;
        }
    
        public Builder eventModule(Integer eventModule) {
             this.eventModule = eventModule;
             return this;
        }
    
        public Builder operatorType(Integer operatorType) {
             this.operatorType = operatorType;
             return this;
        }
        public Builder operatorType(com.lark.oapi.service.admin.v1.enums.OperatorTypeEnum operatorType) {
             this.operatorType = operatorType.getValue();
             return this;
        }
    
        public Builder operatorValue(String operatorValue) {
             this.operatorValue = operatorValue;
             return this;
        }
    
        public Builder objects(AuditObjectEntity[] objects) {
             this.objects = objects;
             return this;
        }
    
        public Builder recipients(AuditRecipientEntity[] recipients) {
             this.recipients = recipients;
             return this;
        }
    
        public Builder eventTime(Integer eventTime) {
             this.eventTime = eventTime;
             return this;
        }
    
        public Builder ip(String ip) {
             this.ip = ip;
             return this;
        }
    
        public Builder operatorApp(String operatorApp) {
             this.operatorApp = operatorApp;
             return this;
        }
    
        public Builder auditContext(AuditContext auditContext) {
             this.auditContext = auditContext;
             return this;
        }
    
        public Builder extend(AuditEventExtend extend) {
             this.extend = extend;
             return this;
        }
    
        public Builder operatorAppName(String operatorAppName) {
             this.operatorAppName = operatorAppName;
             return this;
        }
    
        public Builder commonDrawers(ApiAuditCommonDrawers commonDrawers) {
             this.commonDrawers = commonDrawers;
             return this;
        }
    
    
    public AuditInfo build(){
        return new AuditInfo(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
