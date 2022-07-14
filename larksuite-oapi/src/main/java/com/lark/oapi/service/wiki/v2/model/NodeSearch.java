// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;

public class NodeSearch {

  @SerializedName("node_id")
  private String nodeId;
  @SerializedName("space_id")
  private String spaceId;
  @SerializedName("parent_id")
  private String parentId;
  @SerializedName("obj_type")
  private Integer objType;
  @SerializedName("title")
  private String title;
  @SerializedName("url")
  private String url;
  @SerializedName("icon")
  private String icon;
  @SerializedName("area_id")
  private String areaId;
  @SerializedName("sort_id")
  private Double sortId;
  @SerializedName("domain")
  private String domain;
  @SerializedName("obj_token")
  private String objToken;

  // builder 开始
  public NodeSearch() {
  }

  public NodeSearch(Builder builder) {
    this.nodeId = builder.nodeId;
    this.spaceId = builder.spaceId;
    this.parentId = builder.parentId;
    this.objType = builder.objType;
    this.title = builder.title;
    this.url = builder.url;
    this.icon = builder.icon;
    this.areaId = builder.areaId;
    this.sortId = builder.sortId;
    this.domain = builder.domain;
    this.objToken = builder.objToken;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getNodeId() {
    return this.nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public String getSpaceId() {
    return this.spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public String getParentId() {
    return this.parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Integer getObjType() {
    return this.objType;
  }

  public void setObjType(Integer objType) {
    this.objType = objType;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getIcon() {
    return this.icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getAreaId() {
    return this.areaId;
  }

  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }

  public Double getSortId() {
    return this.sortId;
  }

  public void setSortId(Double sortId) {
    this.sortId = sortId;
  }

  public String getDomain() {
    return this.domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getObjToken() {
    return this.objToken;
  }

  public void setObjToken(String objToken) {
    this.objToken = objToken;
  }

  public static class Builder {

    private String nodeId;
    private String spaceId;
    private String parentId;
    private Integer objType;
    private String title;
    private String url;
    private String icon;
    private String areaId;
    private Double sortId;
    private String domain;
    private String objToken;

    public Builder nodeId(String nodeId) {
      this.nodeId = nodeId;
      return this;
    }

    public Builder spaceId(String spaceId) {
      this.spaceId = spaceId;
      return this;
    }

    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }

    public Builder objType(Integer objType) {
      this.objType = objType;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }

    public Builder areaId(String areaId) {
      this.areaId = areaId;
      return this;
    }

    public Builder sortId(Double sortId) {
      this.sortId = sortId;
      return this;
    }

    public Builder domain(String domain) {
      this.domain = domain;
      return this;
    }

    public Builder objToken(String objToken) {
      this.objToken = objToken;
      return this;
    }


    public NodeSearch build() {
      return new NodeSearch(this);
    }
  }
}
