// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.wiki.v2.model;
import com.larksuite.oapi.service.wiki.v2.enums.*;
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
public class Member {
    @SerializedName("member_type")
    private String memberType;
    @SerializedName("member_id")
    private String memberId;
    @SerializedName("member_role")
    private String memberRole;
    public String getMemberType() {
        return this.memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberRole() {
        return this.memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }


// builder 开始
  public Member(){}

  public Member(Builder builder){
      this.memberType = builder.memberType;
      this.memberId = builder.memberId;
      this.memberRole = builder.memberRole;
  }

    public static class Builder {
        private String memberType;
        private String memberId;
        private String memberRole;
        public Builder memberType(String memberType) {
             this.memberType = memberType;
             return this;
        }
    
        public Builder memberId(String memberId) {
             this.memberId = memberId;
             return this;
        }
    
        public Builder memberRole(String memberRole) {
             this.memberRole = memberRole;
             return this;
        }
    
    
    public Member build(){
        return new Member(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
