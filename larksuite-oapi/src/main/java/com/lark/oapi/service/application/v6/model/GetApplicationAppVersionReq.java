// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetApplicationAppVersionReq {

  @Query
  @SerializedName("lang")
  private String lang;
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("app_id")
  private String appId;
  @Path
  @SerializedName("version_id")
  private String versionId;

  // builder 开始
  public GetApplicationAppVersionReq() {
  }

  public GetApplicationAppVersionReq(Builder builder) {
    this.lang = builder.lang;
    this.userIdType = builder.userIdType;
    this.appId = builder.appId;
    this.versionId = builder.versionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getLang() {
    return this.lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getVersionId() {
    return this.versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public static class Builder {

    private String lang;
    private String userIdType;
    private String appId;
    private String versionId;

    public Builder lang(String lang) {
      this.lang = lang;
      return this;
    }

    public Builder lang(com.lark.oapi.service.application.v6.enums.I18nKeyEnum lang) {
      this.lang = lang.getValue();
      return this;
    }

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(
        com.lark.oapi.service.application.v6.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    public Builder versionId(String versionId) {
      this.versionId = versionId;
      return this;
    }

    public GetApplicationAppVersionReq build() {
      return new GetApplicationAppVersionReq(this);
    }
  }
}
