// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;

public class Space {

  @SerializedName("name")
  private String name;
  @SerializedName("description")
  private String description;
  @SerializedName("space_id")
  private String spaceId;
  @SerializedName("space_type")
  private String spaceType;
  @SerializedName("visibility")
  private String visibility;

  // builder 开始
  public Space() {
  }

  public Space(Builder builder) {
    this.name = builder.name;
    this.description = builder.description;
    this.spaceId = builder.spaceId;
    this.spaceType = builder.spaceType;
    this.visibility = builder.visibility;
  }

  public static Builder newBuilder() {
    return new Builder();
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

  public String getSpaceId() {
    return this.spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public String getSpaceType() {
    return this.spaceType;
  }

  public void setSpaceType(String spaceType) {
    this.spaceType = spaceType;
  }

  public String getVisibility() {
    return this.visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public static class Builder {

    private String name;
    private String description;
    private String spaceId;
    private String spaceType;
    private String visibility;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder spaceId(String spaceId) {
      this.spaceId = spaceId;
      return this;
    }

    public Builder spaceType(String spaceType) {
      this.spaceType = spaceType;
      return this;
    }

    public Builder spaceType(com.lark.oapi.service.wiki.v2.enums.SpaceTypeEnum spaceType) {
      this.spaceType = spaceType.getValue();
      return this;
    }

    public Builder visibility(String visibility) {
      this.visibility = visibility;
      return this;
    }

    public Builder visibility(com.lark.oapi.service.wiki.v2.enums.SpaceVisibilityEnum visibility) {
      this.visibility = visibility.getValue();
      return this;
    }


    public Space build() {
      return new Space(this);
    }
  }
}
