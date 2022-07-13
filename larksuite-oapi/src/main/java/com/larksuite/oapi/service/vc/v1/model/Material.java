// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class Material {
    @SerializedName("name")
    private String name;
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("file_size")
    private Integer fileSize;
    @SerializedName("device_type")
    private Integer deviceType;
    @SerializedName("material_type")
    private Integer materialType;
    @SerializedName("review_result")
    private Integer reviewResult;
    @SerializedName("material_source")
    private Integer materialSource;

    // builder 开始
    public Material() {
    }

    public Material(Builder builder) {
        this.name = builder.name;
        this.fileToken = builder.fileToken;
        this.fileSize = builder.fileSize;
        this.deviceType = builder.deviceType;
        this.materialType = builder.materialType;
        this.reviewResult = builder.reviewResult;
        this.materialSource = builder.materialSource;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getMaterialType() {
        return this.materialType;
    }

    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
    }

    public Integer getReviewResult() {
        return this.reviewResult;
    }

    public void setReviewResult(Integer reviewResult) {
        this.reviewResult = reviewResult;
    }

    public Integer getMaterialSource() {
        return this.materialSource;
    }

    public void setMaterialSource(Integer materialSource) {
        this.materialSource = materialSource;
    }

    public static class Builder {
        private String name;
        private String fileToken;
        private Integer fileSize;
        private Integer deviceType;
        private Integer materialType;
        private Integer reviewResult;
        private Integer materialSource;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public Builder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Builder deviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        public Builder deviceType(com.larksuite.oapi.service.vc.v1.enums.DeviceTypeEnum deviceType) {
            this.deviceType = deviceType.getValue();
            return this;
        }

        public Builder materialType(Integer materialType) {
            this.materialType = materialType;
            return this;
        }

        public Builder materialType(com.larksuite.oapi.service.vc.v1.enums.MaterialTypeEnum materialType) {
            this.materialType = materialType.getValue();
            return this;
        }

        public Builder reviewResult(Integer reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }

        public Builder reviewResult(com.larksuite.oapi.service.vc.v1.enums.ReviewResultEnum reviewResult) {
            this.reviewResult = reviewResult.getValue();
            return this;
        }

        public Builder materialSource(Integer materialSource) {
            this.materialSource = materialSource;
            return this;
        }

        public Builder materialSource(com.larksuite.oapi.service.vc.v1.enums.MaterialSourceEnum materialSource) {
            this.materialSource = materialSource.getValue();
            return this;
        }


        public Material build() {
            return new Material(this);
        }
    }
}
