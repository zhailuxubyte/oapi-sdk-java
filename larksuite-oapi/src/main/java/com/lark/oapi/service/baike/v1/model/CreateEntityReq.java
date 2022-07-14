// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class CreateEntityReq {

  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Body
  private Entity body;

  // builder 开始
  public CreateEntityReq() {
  }

  public CreateEntityReq(Builder builder) {
    this.userIdType = builder.userIdType;
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

  public Entity getEntity() {
    return this.body;
  }

  public void setEntity(Entity body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType;
    private Entity body;

    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    public Builder userIdType(com.lark.oapi.service.baike.v1.enums.UserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public Entity getEntity() {
      return this.body;
    }

    public Builder entity(Entity body) {
      this.body = body;
      return this;
    }

    public CreateEntityReq build() {
      return new CreateEntityReq(this);
    }
  }
}
