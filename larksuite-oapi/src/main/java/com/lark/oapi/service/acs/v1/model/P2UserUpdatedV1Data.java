// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.acs.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2UserUpdatedV1Data {

  @SerializedName("user_id")
  private UserId userId;
  @SerializedName("card")
  private Integer card;
  @SerializedName("face_uploaded")
  private Boolean faceUploaded;

  public UserId getUserId() {
    return this.userId;
  }

  public void setUserId(UserId userId) {
    this.userId = userId;
  }

  public Integer getCard() {
    return this.card;
  }

  public void setCard(Integer card) {
    this.card = card;
  }

  public Boolean getFaceUploaded() {
    return this.faceUploaded;
  }

  public void setFaceUploaded(Boolean faceUploaded) {
    this.faceUploaded = faceUploaded;
  }

}
