// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.larksuite.oapi.service.vc.v1.enums.*;
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
public class ReservePermissionChecker {
    @SerializedName("check_field")
    private Integer checkField;
    @SerializedName("check_mode")
    private Integer checkMode;
    @SerializedName("check_list")
    private String[] checkList;
    public Integer getCheckField() {
        return this.checkField;
    }

    public void setCheckField(Integer checkField) {
        this.checkField = checkField;
    }

    public Integer getCheckMode() {
        return this.checkMode;
    }

    public void setCheckMode(Integer checkMode) {
        this.checkMode = checkMode;
    }

    public String[] getCheckList() {
        return this.checkList;
    }

    public void setCheckList(String[] checkList) {
        this.checkList = checkList;
    }


// builder 开始
  public ReservePermissionChecker(){}

  public ReservePermissionChecker(Builder builder){
      this.checkField = builder.checkField;
      this.checkMode = builder.checkMode;
      this.checkList = builder.checkList;
  }

    public static class Builder {
        private Integer checkField;
        private Integer checkMode;
        private String[] checkList;
        public Builder checkField(Integer checkField) {
             this.checkField = checkField;
             return this;
        }
        public Builder checkField(com.larksuite.oapi.service.vc.v1.enums.PermCheckFieldEnum checkField) {
             this.checkField = checkField.getValue();
             return this;
        }
    
        public Builder checkMode(Integer checkMode) {
             this.checkMode = checkMode;
             return this;
        }
        public Builder checkMode(com.larksuite.oapi.service.vc.v1.enums.PermCheckModeEnum checkMode) {
             this.checkMode = checkMode.getValue();
             return this;
        }
    
        public Builder checkList(String[] checkList) {
             this.checkList = checkList;
             return this;
        }
    
    
    public ReservePermissionChecker build(){
        return new ReservePermissionChecker(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
