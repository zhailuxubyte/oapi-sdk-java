// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditObjectDetail {

  @SerializedName("clone_source")
  private String cloneSource;
  @SerializedName("text_detail")
  private String textDetail;
  @SerializedName("file_name")
  private String fileName;
  @SerializedName("third_party_appID")
  private String thirdPartyAppID;
  @SerializedName("contain_file_num")
  private Integer containFileNum;
  @SerializedName("permission_setting_type")
  private String permissionSettingType;
  @SerializedName("permission_external_access_Type")
  private Boolean permissionExternalAccessType;
  @SerializedName("permission_share_type")
  private String permissionShareType;
  @SerializedName("file_service_source")
  private String fileServiceSource;
  @SerializedName("okr_download_content")
  private String okrDownloadContent;
  @SerializedName("container_type")
  private String containerType;
  @SerializedName("container_id")
  private String containerId;
  @SerializedName("current_page")
  private String currentPage;

  // builder 开始
  public AuditObjectDetail() {
  }

  public AuditObjectDetail(Builder builder) {
    this.cloneSource = builder.cloneSource;
    this.textDetail = builder.textDetail;
    this.fileName = builder.fileName;
    this.thirdPartyAppID = builder.thirdPartyAppID;
    this.containFileNum = builder.containFileNum;
    this.permissionSettingType = builder.permissionSettingType;
    this.permissionExternalAccessType = builder.permissionExternalAccessType;
    this.permissionShareType = builder.permissionShareType;
    this.fileServiceSource = builder.fileServiceSource;
    this.okrDownloadContent = builder.okrDownloadContent;
    this.containerType = builder.containerType;
    this.containerId = builder.containerId;
    this.currentPage = builder.currentPage;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCloneSource() {
    return this.cloneSource;
  }

  public void setCloneSource(String cloneSource) {
    this.cloneSource = cloneSource;
  }

  public String getTextDetail() {
    return this.textDetail;
  }

  public void setTextDetail(String textDetail) {
    this.textDetail = textDetail;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getThirdPartyAppID() {
    return this.thirdPartyAppID;
  }

  public void setThirdPartyAppID(String thirdPartyAppID) {
    this.thirdPartyAppID = thirdPartyAppID;
  }

  public Integer getContainFileNum() {
    return this.containFileNum;
  }

  public void setContainFileNum(Integer containFileNum) {
    this.containFileNum = containFileNum;
  }

  public String getPermissionSettingType() {
    return this.permissionSettingType;
  }

  public void setPermissionSettingType(String permissionSettingType) {
    this.permissionSettingType = permissionSettingType;
  }

  public Boolean getPermissionExternalAccessType() {
    return this.permissionExternalAccessType;
  }

  public void setPermissionExternalAccessType(Boolean permissionExternalAccessType) {
    this.permissionExternalAccessType = permissionExternalAccessType;
  }

  public String getPermissionShareType() {
    return this.permissionShareType;
  }

  public void setPermissionShareType(String permissionShareType) {
    this.permissionShareType = permissionShareType;
  }

  public String getFileServiceSource() {
    return this.fileServiceSource;
  }

  public void setFileServiceSource(String fileServiceSource) {
    this.fileServiceSource = fileServiceSource;
  }

  public String getOkrDownloadContent() {
    return this.okrDownloadContent;
  }

  public void setOkrDownloadContent(String okrDownloadContent) {
    this.okrDownloadContent = okrDownloadContent;
  }

  public String getContainerType() {
    return this.containerType;
  }

  public void setContainerType(String containerType) {
    this.containerType = containerType;
  }

  public String getContainerId() {
    return this.containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public String getCurrentPage() {
    return this.currentPage;
  }

  public void setCurrentPage(String currentPage) {
    this.currentPage = currentPage;
  }

  public static class Builder {

    private String cloneSource;
    private String textDetail;
    private String fileName;
    private String thirdPartyAppID;
    private Integer containFileNum;
    private String permissionSettingType;
    private Boolean permissionExternalAccessType;
    private String permissionShareType;
    private String fileServiceSource;
    private String okrDownloadContent;
    private String containerType;
    private String containerId;
    private String currentPage;

    public Builder cloneSource(String cloneSource) {
      this.cloneSource = cloneSource;
      return this;
    }

    public Builder textDetail(String textDetail) {
      this.textDetail = textDetail;
      return this;
    }

    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder thirdPartyAppID(String thirdPartyAppID) {
      this.thirdPartyAppID = thirdPartyAppID;
      return this;
    }

    public Builder containFileNum(Integer containFileNum) {
      this.containFileNum = containFileNum;
      return this;
    }

    public Builder permissionSettingType(String permissionSettingType) {
      this.permissionSettingType = permissionSettingType;
      return this;
    }

    public Builder permissionExternalAccessType(Boolean permissionExternalAccessType) {
      this.permissionExternalAccessType = permissionExternalAccessType;
      return this;
    }

    public Builder permissionShareType(String permissionShareType) {
      this.permissionShareType = permissionShareType;
      return this;
    }

    public Builder fileServiceSource(String fileServiceSource) {
      this.fileServiceSource = fileServiceSource;
      return this;
    }

    public Builder okrDownloadContent(String okrDownloadContent) {
      this.okrDownloadContent = okrDownloadContent;
      return this;
    }

    public Builder containerType(String containerType) {
      this.containerType = containerType;
      return this;
    }

    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    public Builder currentPage(String currentPage) {
      this.currentPage = currentPage;
      return this;
    }


    public AuditObjectDetail build() {
      return new AuditObjectDetail(this);
    }
  }
}
