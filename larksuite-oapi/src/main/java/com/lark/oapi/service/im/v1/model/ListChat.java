// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListChat {

  @SerializedName("chat_id")
  private String chatId;
  @SerializedName("avatar")
  private String avatar;
  @SerializedName("name")
  private String name;
  @SerializedName("description")
  private String description;
  @SerializedName("owner_id")
  private String ownerId;
  @SerializedName("owner_id_type")
  private String ownerIdType;
  @SerializedName("external")
  private Boolean external;
  @SerializedName("tenant_key")
  private String tenantKey;

  // builder 开始
  public ListChat() {
  }

  public ListChat(Builder builder) {
    this.chatId = builder.chatId;
    this.avatar = builder.avatar;
    this.name = builder.name;
    this.description = builder.description;
    this.ownerId = builder.ownerId;
    this.ownerIdType = builder.ownerIdType;
    this.external = builder.external;
    this.tenantKey = builder.tenantKey;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getChatId() {
    return this.chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
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

  public String getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getOwnerIdType() {
    return this.ownerIdType;
  }

  public void setOwnerIdType(String ownerIdType) {
    this.ownerIdType = ownerIdType;
  }

  public Boolean getExternal() {
    return this.external;
  }

  public void setExternal(Boolean external) {
    this.external = external;
  }

  public String getTenantKey() {
    return this.tenantKey;
  }

  public void setTenantKey(String tenantKey) {
    this.tenantKey = tenantKey;
  }

  public static class Builder {

    private String chatId;
    private String avatar;
    private String name;
    private String description;
    private String ownerId;
    private String ownerIdType;
    private Boolean external;
    private String tenantKey;

    public Builder chatId(String chatId) {
      this.chatId = chatId;
      return this;
    }

    public Builder avatar(String avatar) {
      this.avatar = avatar;
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

    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }

    public Builder ownerIdType(String ownerIdType) {
      this.ownerIdType = ownerIdType;
      return this;
    }

    public Builder external(Boolean external) {
      this.external = external;
      return this;
    }

    public Builder tenantKey(String tenantKey) {
      this.tenantKey = tenantKey;
      return this;
    }


    public ListChat build() {
      return new ListChat(this);
    }
  }
}
