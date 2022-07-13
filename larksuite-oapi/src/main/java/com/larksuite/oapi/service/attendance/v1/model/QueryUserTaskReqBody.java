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
public class QueryUserTaskReqBody {
    @SerializedName("user_ids")
    private String[] userIds;
    @SerializedName("check_date_from")
    private Integer checkDateFrom;
    @SerializedName("check_date_to")
    private Integer checkDateTo;
    public String[] getUserIds() {
        return this.userIds;
    }

    public void setUserIds(String[] userIds) {
        this.userIds = userIds;
    }

    public Integer getCheckDateFrom() {
        return this.checkDateFrom;
    }

    public void setCheckDateFrom(Integer checkDateFrom) {
        this.checkDateFrom = checkDateFrom;
    }

    public Integer getCheckDateTo() {
        return this.checkDateTo;
    }

    public void setCheckDateTo(Integer checkDateTo) {
        this.checkDateTo = checkDateTo;
    }


// builder 开始
  public QueryUserTaskReqBody(){}

  public QueryUserTaskReqBody(Builder builder){
      this.userIds = builder.userIds;
      this.checkDateFrom = builder.checkDateFrom;
      this.checkDateTo = builder.checkDateTo;
  }

    public static class Builder {
        private String[] userIds;
        private Integer checkDateFrom;
        private Integer checkDateTo;
        public Builder userIds(String[] userIds) {
             this.userIds = userIds;
             return this;
        }
    
        public Builder checkDateFrom(Integer checkDateFrom) {
             this.checkDateFrom = checkDateFrom;
             return this;
        }
    
        public Builder checkDateTo(Integer checkDateTo) {
             this.checkDateTo = checkDateTo;
             return this;
        }
    
    
    public QueryUserTaskReqBody build(){
        return new QueryUserTaskReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
