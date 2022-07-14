// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class P2CalendarAclCreatedV4Data {

  @SerializedName("acl_id")
  private String aclId;
  @SerializedName("role")
  private String role;
  @SerializedName("scope")
  private AclScopeEvent scope;
  @SerializedName("user_id_list")
  private UserId[] userIdList;

  public String getAclId() {
    return this.aclId;
  }

  public void setAclId(String aclId) {
    this.aclId = aclId;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public AclScopeEvent getScope() {
    return this.scope;
  }

  public void setScope(AclScopeEvent scope) {
    this.scope = scope;
  }

  public UserId[] getUserIdList() {
    return this.userIdList;
  }

  public void setUserIdList(UserId[] userIdList) {
    this.userIdList = userIdList;
  }

}
