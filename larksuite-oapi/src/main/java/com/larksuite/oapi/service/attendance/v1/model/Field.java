// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class Field {
    @SerializedName("code")
    private String code;
    @SerializedName("title")
    private String title;
    @SerializedName("child_fields")
    private ChildField[] childFields;

    // builder 开始
    public Field() {
    }

    public Field(Builder builder) {
        this.code = builder.code;
        this.title = builder.title;
        this.childFields = builder.childFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ChildField[] getChildFields() {
        return this.childFields;
    }

    public void setChildFields(ChildField[] childFields) {
        this.childFields = childFields;
    }

    public static class Builder {
        private String code;
        private String title;
        private ChildField[] childFields;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder childFields(ChildField[] childFields) {
            this.childFields = childFields;
            return this;
        }


        public Field build() {
            return new Field(this);
        }
    }
}
