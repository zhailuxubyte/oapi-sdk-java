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

public class ApplicationEventOwner {

  @SerializedName("type")
  private Integer type;
  @SerializedName("name")
  private String name;
  @SerializedName("help_desk")
  private String helpDesk;
  @SerializedName("email")
  private String email;
  @SerializedName("phone")
  private String phone;

  // builder 开始
  public ApplicationEventOwner() {
  }

  public ApplicationEventOwner(Builder builder) {
    this.type = builder.type;
    this.name = builder.name;
    this.helpDesk = builder.helpDesk;
    this.email = builder.email;
    this.phone = builder.phone;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHelpDesk() {
    return this.helpDesk;
  }

  public void setHelpDesk(String helpDesk) {
    this.helpDesk = helpDesk;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public static class Builder {

    private Integer type;
    private String name;
    private String helpDesk;
    private String email;
    private String phone;

    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder helpDesk(String helpDesk) {
      this.helpDesk = helpDesk;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }


    public ApplicationEventOwner build() {
      return new ApplicationEventOwner(this);
    }
  }
}
