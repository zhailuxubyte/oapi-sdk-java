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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class CheckExternalInstanceReqBody {

  @SerializedName("instances")
  private ExteranlInstanceCheck[] instances;

  // builder 开始
  public CheckExternalInstanceReqBody() {
  }

  public CheckExternalInstanceReqBody(Builder builder) {
    this.instances = builder.instances;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public ExteranlInstanceCheck[] getInstances() {
    return this.instances;
  }

  public void setInstances(ExteranlInstanceCheck[] instances) {
    this.instances = instances;
  }

  public static class Builder {

    private ExteranlInstanceCheck[] instances;

    public Builder instances(ExteranlInstanceCheck[] instances) {
      this.instances = instances;
      return this;
    }


    public CheckExternalInstanceReqBody build() {
      return new CheckExternalInstanceReqBody(this);
    }
  }
}
