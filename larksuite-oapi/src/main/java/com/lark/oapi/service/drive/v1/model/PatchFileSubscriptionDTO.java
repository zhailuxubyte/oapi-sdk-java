// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class PatchFileSubscriptionDTO {

  @SerializedName("subscription")
  private FileSubscription subscription;

  public FileSubscription getSubscription() {
    return this.subscription;
  }

  public void setSubscription(FileSubscription subscription) {
    this.subscription = subscription;
  }

}
