// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;
import com.larksuite.oapi.service.search.v2.enums.*;
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
public class CreateDataSourceReq {
    @Body
    private DataSource body;

    public DataSource getDataSource() {
        return this.body;
    }

    public void setDataSource(DataSource body) {
        this.body = body;
    }

// builder 开始
  public CreateDataSourceReq(){}

  public CreateDataSourceReq(Builder builder){
        this.body = builder.body;
  }

    public static class Builder {
    
        private DataSource body;
    
        public DataSource getDataSource() {
            return this.body;
        }
        public Builder dataSource(DataSource body) {
             this.body = body;
             return this;
        }
    public CreateDataSourceReq build(){
        return new CreateDataSourceReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
