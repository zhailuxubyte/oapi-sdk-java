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
public class CreateGroupReqBody {
    @SerializedName("group_id")
    private String groupId;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("type")
    private Integer type;
    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


// builder 开始
  public CreateGroupReqBody(){}

  public CreateGroupReqBody(Builder builder){
      this.groupId = builder.groupId;
      this.name = builder.name;
      this.description = builder.description;
      this.type = builder.type;
  }

    public static class Builder {
        private String groupId;
        private String name;
        private String description;
        private Integer type;
        public Builder groupId(String groupId) {
             this.groupId = groupId;
             return this;
        }
    
        public Builder name(String name) {
             this.name = name;
             return this;
        }
    
        public Builder description(String description) {
             this.description = description;
             return this;
        }
    
        public Builder type(Integer type) {
             this.type = type;
             return this;
        }
        public Builder type(com.larksuite.oapi.service.contact.v3.enums.CreateGroupTypeEnum type) {
             this.type = type.getValue();
             return this;
        }
    
    
    public CreateGroupReqBody build(){
        return new CreateGroupReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
