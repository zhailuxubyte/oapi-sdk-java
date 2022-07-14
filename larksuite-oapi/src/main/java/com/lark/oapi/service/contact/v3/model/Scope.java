// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class Scope {

  @SerializedName("departments")
  private Department[] departments;
  @SerializedName("users")
  private User[] users;
  @SerializedName("user_groups")
  private UserGroup[] userGroups;

  // builder 开始
  public Scope() {
  }

  public Scope(Builder builder) {
    this.departments = builder.departments;
    this.users = builder.users;
    this.userGroups = builder.userGroups;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Department[] getDepartments() {
    return this.departments;
  }

  public void setDepartments(Department[] departments) {
    this.departments = departments;
  }

  public User[] getUsers() {
    return this.users;
  }

  public void setUsers(User[] users) {
    this.users = users;
  }

  public UserGroup[] getUserGroups() {
    return this.userGroups;
  }

  public void setUserGroups(UserGroup[] userGroups) {
    this.userGroups = userGroups;
  }

  public static class Builder {

    private Department[] departments;
    private User[] users;
    private UserGroup[] userGroups;

    public Builder departments(Department[] departments) {
      this.departments = departments;
      return this;
    }

    public Builder users(User[] users) {
      this.users = users;
      return this;
    }

    public Builder userGroups(UserGroup[] userGroups) {
      this.userGroups = userGroups;
      return this;
    }


    public Scope build() {
      return new Scope(this);
    }
  }
}
