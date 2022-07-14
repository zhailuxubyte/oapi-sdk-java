// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class UpdateSpaceSettingReq {

  @Path
  @SerializedName("space_id")
  private String spaceId;
  @Body
  private Setting body;

  // builder 开始
  public UpdateSpaceSettingReq() {
  }

  public UpdateSpaceSettingReq(Builder builder) {
    this.spaceId = builder.spaceId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getSpaceId() {
    return this.spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public Setting getSetting() {
    return this.body;
  }

  public void setSetting(Setting body) {
    this.body = body;
  }

  public static class Builder {

    private String spaceId;
    private Setting body;

    public Builder spaceId(String spaceId) {
      this.spaceId = spaceId;
      return this;
    }

    public Setting getSetting() {
      return this.body;
    }

    public Builder setting(Setting body) {
      this.body = body;
      return this;
    }

    public UpdateSpaceSettingReq build() {
      return new UpdateSpaceSettingReq(this);
    }
  }
}
