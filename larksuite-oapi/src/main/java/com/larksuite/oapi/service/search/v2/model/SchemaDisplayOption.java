// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;
import com.larksuite.oapi.service.search.v2.enums.*;
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
public class SchemaDisplayOption {
    @SerializedName("display_label")
    private String displayLabel;
    @SerializedName("display_type")
    private String displayType;
    public String getDisplayLabel() {
        return this.displayLabel;
    }

    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }


// builder 开始
  public SchemaDisplayOption(){}

  public SchemaDisplayOption(Builder builder){
      this.displayLabel = builder.displayLabel;
      this.displayType = builder.displayType;
  }

    public static class Builder {
        private String displayLabel;
        private String displayType;
        public Builder displayLabel(String displayLabel) {
             this.displayLabel = displayLabel;
             return this;
        }
    
        public Builder displayType(String displayType) {
             this.displayType = displayType;
             return this;
        }
        public Builder displayType(com.larksuite.oapi.service.search.v2.enums.DisplayTypeEnum displayType) {
             this.displayType = displayType.getValue();
             return this;
        }
    
    
    public SchemaDisplayOption build(){
        return new SchemaDisplayOption(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
