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

public class PreviewNode {

  @SerializedName("node_id")
  private String nodeId;
  @SerializedName("node_name")
  private String nodeName;
  @SerializedName("node_type")
  private String nodeType;
  @SerializedName("comments")
  private String[] comments;
  @SerializedName("custom_node_id")
  private String customNodeId;
  @SerializedName("user_id_list")
  private String[] userIdList;
  @SerializedName("end_cc_id_list")
  private String[] endCcIdList;
  @SerializedName("is_empty_logic")
  private Boolean isEmptyLogic;
  @SerializedName("is_approver_type_free")
  private Boolean isApproverTypeFree;
  @SerializedName("has_cc_type_free")
  private Boolean hasCcTypeFree;

  // builder 开始
  public PreviewNode() {
  }

  public PreviewNode(Builder builder) {
    this.nodeId = builder.nodeId;
    this.nodeName = builder.nodeName;
    this.nodeType = builder.nodeType;
    this.comments = builder.comments;
    this.customNodeId = builder.customNodeId;
    this.userIdList = builder.userIdList;
    this.endCcIdList = builder.endCcIdList;
    this.isEmptyLogic = builder.isEmptyLogic;
    this.isApproverTypeFree = builder.isApproverTypeFree;
    this.hasCcTypeFree = builder.hasCcTypeFree;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getNodeId() {
    return this.nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public String getNodeName() {
    return this.nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public String getNodeType() {
    return this.nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public String[] getComments() {
    return this.comments;
  }

  public void setComments(String[] comments) {
    this.comments = comments;
  }

  public String getCustomNodeId() {
    return this.customNodeId;
  }

  public void setCustomNodeId(String customNodeId) {
    this.customNodeId = customNodeId;
  }

  public String[] getUserIdList() {
    return this.userIdList;
  }

  public void setUserIdList(String[] userIdList) {
    this.userIdList = userIdList;
  }

  public String[] getEndCcIdList() {
    return this.endCcIdList;
  }

  public void setEndCcIdList(String[] endCcIdList) {
    this.endCcIdList = endCcIdList;
  }

  public Boolean getIsEmptyLogic() {
    return this.isEmptyLogic;
  }

  public void setIsEmptyLogic(Boolean isEmptyLogic) {
    this.isEmptyLogic = isEmptyLogic;
  }

  public Boolean getIsApproverTypeFree() {
    return this.isApproverTypeFree;
  }

  public void setIsApproverTypeFree(Boolean isApproverTypeFree) {
    this.isApproverTypeFree = isApproverTypeFree;
  }

  public Boolean getHasCcTypeFree() {
    return this.hasCcTypeFree;
  }

  public void setHasCcTypeFree(Boolean hasCcTypeFree) {
    this.hasCcTypeFree = hasCcTypeFree;
  }

  public static class Builder {

    private String nodeId;
    private String nodeName;
    private String nodeType;
    private String[] comments;
    private String customNodeId;
    private String[] userIdList;
    private String[] endCcIdList;
    private Boolean isEmptyLogic;
    private Boolean isApproverTypeFree;
    private Boolean hasCcTypeFree;

    public Builder nodeId(String nodeId) {
      this.nodeId = nodeId;
      return this;
    }

    public Builder nodeName(String nodeName) {
      this.nodeName = nodeName;
      return this;
    }

    public Builder nodeType(String nodeType) {
      this.nodeType = nodeType;
      return this;
    }

    public Builder comments(String[] comments) {
      this.comments = comments;
      return this;
    }

    public Builder customNodeId(String customNodeId) {
      this.customNodeId = customNodeId;
      return this;
    }

    public Builder userIdList(String[] userIdList) {
      this.userIdList = userIdList;
      return this;
    }

    public Builder endCcIdList(String[] endCcIdList) {
      this.endCcIdList = endCcIdList;
      return this;
    }

    public Builder isEmptyLogic(Boolean isEmptyLogic) {
      this.isEmptyLogic = isEmptyLogic;
      return this;
    }

    public Builder isApproverTypeFree(Boolean isApproverTypeFree) {
      this.isApproverTypeFree = isApproverTypeFree;
      return this;
    }

    public Builder hasCcTypeFree(Boolean hasCcTypeFree) {
      this.hasCcTypeFree = hasCcTypeFree;
      return this;
    }


    public PreviewNode build() {
      return new PreviewNode(this);
    }
  }
}
