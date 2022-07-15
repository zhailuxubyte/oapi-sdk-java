// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class CreateAppTableRecordReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Path
  @SerializedName("app_token")
  private String appToken;
  @Path
  @SerializedName("table_id")
  private String tableId;
  @Body
  private AppTableRecord body;
  // builder 开始
  public CreateAppTableRecordReq() {
  }

  public CreateAppTableRecordReq(Builder builder) {
    this.userIdType = builder.userIdType;
    this.appToken = builder.appToken;
    this.tableId = builder.tableId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getAppToken() {
    return this.appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public String getTableId() {
    return this.tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }

  public AppTableRecord getAppTableRecord() {
    return this.body;
  }

  public void setAppTableRecord(AppTableRecord body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private String appToken;
    private String tableId;
    private AppTableRecord body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.bitable.v1.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Builder appToken(String appToken) {
      this.appToken = appToken;
      return this;
    }

    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    public AppTableRecord getAppTableRecord() {
      return this.body;
    }

    public Builder appTableRecord(AppTableRecord body) {
      this.body = body;
      return this;
    }

    public CreateAppTableRecordReq build() {
      return new CreateAppTableRecordReq(this);
    }
  }
}
