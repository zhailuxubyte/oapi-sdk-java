// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class FloatImage {
    @SerializedName("float_image_id")
    private String floatImageId;
    @SerializedName("float_image_token")
    private String floatImageToken;
    @SerializedName("range")
    private String range;
    @SerializedName("width")
    private Double width;
    @SerializedName("height")
    private Double height;
    @SerializedName("offset_x")
    private Double offsetX;
    @SerializedName("offset_y")
    private Double offsetY;

    // builder 开始
    public FloatImage() {
    }

    public FloatImage(Builder builder) {
        this.floatImageId = builder.floatImageId;
        this.floatImageToken = builder.floatImageToken;
        this.range = builder.range;
        this.width = builder.width;
        this.height = builder.height;
        this.offsetX = builder.offsetX;
        this.offsetY = builder.offsetY;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFloatImageId() {
        return this.floatImageId;
    }

    public void setFloatImageId(String floatImageId) {
        this.floatImageId = floatImageId;
    }

    public String getFloatImageToken() {
        return this.floatImageToken;
    }

    public void setFloatImageToken(String floatImageToken) {
        this.floatImageToken = floatImageToken;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getOffsetX() {
        return this.offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return this.offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public static class Builder {
        private String floatImageId;
        private String floatImageToken;
        private String range;
        private Double width;
        private Double height;
        private Double offsetX;
        private Double offsetY;

        public Builder floatImageId(String floatImageId) {
            this.floatImageId = floatImageId;
            return this;
        }

        public Builder floatImageToken(String floatImageToken) {
            this.floatImageToken = floatImageToken;
            return this;
        }

        public Builder range(String range) {
            this.range = range;
            return this;
        }

        public Builder width(Double width) {
            this.width = width;
            return this;
        }

        public Builder height(Double height) {
            this.height = height;
            return this;
        }

        public Builder offsetX(Double offsetX) {
            this.offsetX = offsetX;
            return this;
        }

        public Builder offsetY(Double offsetY) {
            this.offsetY = offsetY;
            return this;
        }


        public FloatImage build() {
            return new FloatImage(this);
        }
    }
}
