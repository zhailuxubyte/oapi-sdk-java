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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class PatchAgentSchedulesReq {

  @Path
  @SerializedName("agent_id")
  private String agentId;
  @Body
  private PatchAgentSchedulesReqBody body;

  // builder 开始
  public PatchAgentSchedulesReq() {
  }

  public PatchAgentSchedulesReq(Builder builder) {
    this.agentId = builder.agentId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAgentId() {
    return this.agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public PatchAgentSchedulesReqBody getPatchAgentSchedulesReqBody() {
    return this.body;
  }

  public void setPatchAgentSchedulesReqBody(PatchAgentSchedulesReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String agentId;
    private PatchAgentSchedulesReqBody body;

    public Builder agentId(String agentId) {
      this.agentId = agentId;
      return this;
    }

    public PatchAgentSchedulesReqBody getPatchAgentSchedulesReqBody() {
      return this.body;
    }

    public Builder patchAgentSchedulesReqBody(PatchAgentSchedulesReqBody body) {
      this.body = body;
      return this;
    }

    public PatchAgentSchedulesReq build() {
      return new PatchAgentSchedulesReq(this);
    }
  }
}
