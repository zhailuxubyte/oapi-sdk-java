// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;
import com.larksuite.oapi.service.bitable.v1.enums.*;
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
public class AppTable {
    @SerializedName("table_id")
    private String tableId;
    @SerializedName("revision")
    private Integer revision;
    @SerializedName("name")
    private String name;
    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Integer getRevision() {
        return this.revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


// builder 开始
  public AppTable(){}

  public AppTable(Builder builder){
      this.tableId = builder.tableId;
      this.revision = builder.revision;
      this.name = builder.name;
  }

    public static class Builder {
        private String tableId;
        private Integer revision;
        private String name;
        public Builder tableId(String tableId) {
             this.tableId = tableId;
             return this;
        }
    
        public Builder revision(Integer revision) {
             this.revision = revision;
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
    
    public AppTable build(){
        return new AppTable(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
