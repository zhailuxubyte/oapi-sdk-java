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
public class Node {
    @SerializedName("space_id")
    private Long spaceId;
    @SerializedName("node_token")
    private String nodeToken;
    @SerializedName("obj_token")
    private String objToken;
    @SerializedName("obj_type")
    private String objType;
    @SerializedName("parent_node_token")
    private String parentNodeToken;
    @SerializedName("node_type")
    private String nodeType;
    @SerializedName("origin_node_token")
    private String originNodeToken;
    @SerializedName("origin_space_id")
    private Long originSpaceId;
    @SerializedName("has_child")
    private Boolean hasChild;
    @SerializedName("title")
    private String title;
    @SerializedName("obj_create_time")
    private Long objCreateTime;
    @SerializedName("obj_edit_time")
    private Long objEditTime;
    @SerializedName("node_create_time")
    private Long nodeCreateTime;
    @SerializedName("creator")
    private String creator;
    @SerializedName("owner")
    private String owner;
    public Long getSpaceId() {
        return this.spaceId;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public String getNodeToken() {
        return this.nodeToken;
    }

    public void setNodeToken(String nodeToken) {
        this.nodeToken = nodeToken;
    }

    public String getObjToken() {
        return this.objToken;
    }

    public void setObjToken(String objToken) {
        this.objToken = objToken;
    }

    public String getObjType() {
        return this.objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getParentNodeToken() {
        return this.parentNodeToken;
    }

    public void setParentNodeToken(String parentNodeToken) {
        this.parentNodeToken = parentNodeToken;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getOriginNodeToken() {
        return this.originNodeToken;
    }

    public void setOriginNodeToken(String originNodeToken) {
        this.originNodeToken = originNodeToken;
    }

    public Long getOriginSpaceId() {
        return this.originSpaceId;
    }

    public void setOriginSpaceId(Long originSpaceId) {
        this.originSpaceId = originSpaceId;
    }

    public Boolean getHasChild() {
        return this.hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getObjCreateTime() {
        return this.objCreateTime;
    }

    public void setObjCreateTime(Long objCreateTime) {
        this.objCreateTime = objCreateTime;
    }

    public Long getObjEditTime() {
        return this.objEditTime;
    }

    public void setObjEditTime(Long objEditTime) {
        this.objEditTime = objEditTime;
    }

    public Long getNodeCreateTime() {
        return this.nodeCreateTime;
    }

    public void setNodeCreateTime(Long nodeCreateTime) {
        this.nodeCreateTime = nodeCreateTime;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


// builder 开始
  public Node(){}

  public Node(Builder builder){
      this.spaceId = builder.spaceId;
      this.nodeToken = builder.nodeToken;
      this.objToken = builder.objToken;
      this.objType = builder.objType;
      this.parentNodeToken = builder.parentNodeToken;
      this.nodeType = builder.nodeType;
      this.originNodeToken = builder.originNodeToken;
      this.originSpaceId = builder.originSpaceId;
      this.hasChild = builder.hasChild;
      this.title = builder.title;
      this.objCreateTime = builder.objCreateTime;
      this.objEditTime = builder.objEditTime;
      this.nodeCreateTime = builder.nodeCreateTime;
      this.creator = builder.creator;
      this.owner = builder.owner;
  }

    public static class Builder {
        private Long spaceId;
        private String nodeToken;
        private String objToken;
        private String objType;
        private String parentNodeToken;
        private String nodeType;
        private String originNodeToken;
        private Long originSpaceId;
        private Boolean hasChild;
        private String title;
        private Long objCreateTime;
        private Long objEditTime;
        private Long nodeCreateTime;
        private String creator;
        private String owner;
        public Builder spaceId(Long spaceId) {
             this.spaceId = spaceId;
             return this;
        }
    
        public Builder nodeToken(String nodeToken) {
             this.nodeToken = nodeToken;
             return this;
        }
    
        public Builder objToken(String objToken) {
             this.objToken = objToken;
             return this;
        }
    
        public Builder objType(String objType) {
             this.objType = objType;
             return this;
        }
        public Builder objType(com.larksuite.oapi.service.wiki.v2.enums.ObjTypeEnum objType) {
             this.objType = objType.getValue();
             return this;
        }
    
        public Builder parentNodeToken(String parentNodeToken) {
             this.parentNodeToken = parentNodeToken;
             return this;
        }
    
        public Builder nodeType(String nodeType) {
             this.nodeType = nodeType;
             return this;
        }
        public Builder nodeType(com.larksuite.oapi.service.wiki.v2.enums.NodeTypeEnum nodeType) {
             this.nodeType = nodeType.getValue();
             return this;
        }
    
        public Builder originNodeToken(String originNodeToken) {
             this.originNodeToken = originNodeToken;
             return this;
        }
    
        public Builder originSpaceId(Long originSpaceId) {
             this.originSpaceId = originSpaceId;
             return this;
        }
    
        public Builder hasChild(Boolean hasChild) {
             this.hasChild = hasChild;
             return this;
        }
    
        public Builder title(String title) {
             this.title = title;
             return this;
        }
    
        public Builder objCreateTime(Long objCreateTime) {
             this.objCreateTime = objCreateTime;
             return this;
        }
    
        public Builder objEditTime(Long objEditTime) {
             this.objEditTime = objEditTime;
             return this;
        }
    
        public Builder nodeCreateTime(Long nodeCreateTime) {
             this.nodeCreateTime = nodeCreateTime;
             return this;
        }
    
        public Builder creator(String creator) {
             this.creator = creator;
             return this;
        }
    
        public Builder owner(String owner) {
             this.owner = owner;
             return this;
        }
    
    
    public Node build(){
        return new Node(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
