// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.admin.v1.model;
import com.larksuite.oapi.service.admin.v1.enums.*;
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
public class Grant {
    @SerializedName("id")
    private String id;
    @SerializedName("badge_id")
    private String badgeId;
    @SerializedName("name")
    private String name;
    @SerializedName("grant_type")
    private Integer grantType;
    @SerializedName("time_zone")
    private String timeZone;
    @SerializedName("rule_detail")
    private RuleDetail ruleDetail;
    @SerializedName("is_grant_all")
    private Boolean isGrantAll;
    @SerializedName("user_ids")
    private String[] userIds;
    @SerializedName("department_ids")
    private String[] departmentIds;
    @SerializedName("group_ids")
    private String[] groupIds;
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBadgeId() {
        return this.badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrantType() {
        return this.grantType;
    }

    public void setGrantType(Integer grantType) {
        this.grantType = grantType;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public RuleDetail getRuleDetail() {
        return this.ruleDetail;
    }

    public void setRuleDetail(RuleDetail ruleDetail) {
        this.ruleDetail = ruleDetail;
    }

    public Boolean getIsGrantAll() {
        return this.isGrantAll;
    }

    public void setIsGrantAll(Boolean isGrantAll) {
        this.isGrantAll = isGrantAll;
    }

    public String[] getUserIds() {
        return this.userIds;
    }

    public void setUserIds(String[] userIds) {
        this.userIds = userIds;
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String[] getGroupIds() {
        return this.groupIds;
    }

    public void setGroupIds(String[] groupIds) {
        this.groupIds = groupIds;
    }


// builder 开始
  public Grant(){}

  public Grant(Builder builder){
      this.id = builder.id;
      this.badgeId = builder.badgeId;
      this.name = builder.name;
      this.grantType = builder.grantType;
      this.timeZone = builder.timeZone;
      this.ruleDetail = builder.ruleDetail;
      this.isGrantAll = builder.isGrantAll;
      this.userIds = builder.userIds;
      this.departmentIds = builder.departmentIds;
      this.groupIds = builder.groupIds;
  }

    public static class Builder {
        private String id;
        private String badgeId;
        private String name;
        private Integer grantType;
        private String timeZone;
        private RuleDetail ruleDetail;
        private Boolean isGrantAll;
        private String[] userIds;
        private String[] departmentIds;
        private String[] groupIds;
        public Builder id(String id) {
             this.id = id;
             return this;
        }
    
        public Builder badgeId(String badgeId) {
             this.badgeId = badgeId;
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
        public Builder grantType(Integer grantType) {
             this.grantType = grantType;
             return this;
        }
        public Builder grantType(com.larksuite.oapi.service.admin.v1.enums.GrantTypeEnum grantType) {
             this.grantType = grantType.getValue();
             return this;
        }
    
        public Builder timeZone(String timeZone) {
             this.timeZone = timeZone;
             return this;
        }
    
        public Builder ruleDetail(RuleDetail ruleDetail) {
             this.ruleDetail = ruleDetail;
             return this;
        }
    
        public Builder isGrantAll(Boolean isGrantAll) {
             this.isGrantAll = isGrantAll;
             return this;
        }
    
        public Builder userIds(String[] userIds) {
             this.userIds = userIds;
             return this;
        }
    
        public Builder departmentIds(String[] departmentIds) {
             this.departmentIds = departmentIds;
             return this;
        }
    
        public Builder groupIds(String[] groupIds) {
             this.groupIds = groupIds;
             return this;
        }
    
    
    public Grant build(){
        return new Grant(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
