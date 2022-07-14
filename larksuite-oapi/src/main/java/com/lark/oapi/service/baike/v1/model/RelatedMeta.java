// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;

public class RelatedMeta {

  @SerializedName("users")
  private Referer[] users;
  @SerializedName("chats")
  private Referer[] chats;
  @SerializedName("docs")
  private Referer[] docs;
  @SerializedName("oncalls")
  private Referer[] oncalls;
  @SerializedName("links")
  private Referer[] links;
  @SerializedName("abbreviations")
  private Abbreviation[] abbreviations;
  @SerializedName("classifications")
  private Classification[] classifications;

  // builder 开始
  public RelatedMeta() {
  }

  public RelatedMeta(Builder builder) {
    this.users = builder.users;
    this.chats = builder.chats;
    this.docs = builder.docs;
    this.oncalls = builder.oncalls;
    this.links = builder.links;
    this.abbreviations = builder.abbreviations;
    this.classifications = builder.classifications;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Referer[] getUsers() {
    return this.users;
  }

  public void setUsers(Referer[] users) {
    this.users = users;
  }

  public Referer[] getChats() {
    return this.chats;
  }

  public void setChats(Referer[] chats) {
    this.chats = chats;
  }

  public Referer[] getDocs() {
    return this.docs;
  }

  public void setDocs(Referer[] docs) {
    this.docs = docs;
  }

  public Referer[] getOncalls() {
    return this.oncalls;
  }

  public void setOncalls(Referer[] oncalls) {
    this.oncalls = oncalls;
  }

  public Referer[] getLinks() {
    return this.links;
  }

  public void setLinks(Referer[] links) {
    this.links = links;
  }

  public Abbreviation[] getAbbreviations() {
    return this.abbreviations;
  }

  public void setAbbreviations(Abbreviation[] abbreviations) {
    this.abbreviations = abbreviations;
  }

  public Classification[] getClassifications() {
    return this.classifications;
  }

  public void setClassifications(Classification[] classifications) {
    this.classifications = classifications;
  }

  public static class Builder {

    private Referer[] users;
    private Referer[] chats;
    private Referer[] docs;
    private Referer[] oncalls;
    private Referer[] links;
    private Abbreviation[] abbreviations;
    private Classification[] classifications;

    public Builder users(Referer[] users) {
      this.users = users;
      return this;
    }

    public Builder chats(Referer[] chats) {
      this.chats = chats;
      return this;
    }

    public Builder docs(Referer[] docs) {
      this.docs = docs;
      return this;
    }

    public Builder oncalls(Referer[] oncalls) {
      this.oncalls = oncalls;
      return this;
    }

    public Builder links(Referer[] links) {
      this.links = links;
      return this;
    }

    public Builder abbreviations(Abbreviation[] abbreviations) {
      this.abbreviations = abbreviations;
      return this;
    }

    public Builder classifications(Classification[] classifications) {
      this.classifications = classifications;
      return this;
    }


    public RelatedMeta build() {
      return new RelatedMeta(this);
    }
  }
}
