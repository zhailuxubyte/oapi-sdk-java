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
public class UserAnnualReport {
    @SerializedName("year_2021")
    private UserReport2021 year2021;
    public UserReport2021 getYear2021() {
        return this.year2021;
    }

    public void setYear2021(UserReport2021 year2021) {
        this.year2021 = year2021;
    }


// builder 开始
  public UserAnnualReport(){}

  public UserAnnualReport(Builder builder){
      this.year2021 = builder.year2021;
  }

    public static class Builder {
        private UserReport2021 year2021;
        public Builder year2021(UserReport2021 year2021) {
             this.year2021 = year2021;
             return this;
        }
    
    
    public UserAnnualReport build(){
        return new UserAnnualReport(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
