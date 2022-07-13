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
public class SearchDepartmentReqBody {
    @SerializedName("query")
    private String query;
    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }


// builder 开始
  public SearchDepartmentReqBody(){}

  public SearchDepartmentReqBody(Builder builder){
      this.query = builder.query;
  }

    public static class Builder {
        private String query;
        public Builder query(String query) {
             this.query = query;
             return this;
        }
    
    
    public SearchDepartmentReqBody build(){
        return new SearchDepartmentReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
