// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class UnbindDepartmentUnitReqBody {
    @SerializedName("unit_id")
    private String unitId;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("department_id_type")
    private String departmentIdType;

    // builder 开始
    public UnbindDepartmentUnitReqBody() {
    }

    public UnbindDepartmentUnitReqBody(Builder builder) {
        this.unitId = builder.unitId;
        this.departmentId = builder.departmentId;
        this.departmentIdType = builder.departmentIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUnitId() {
        return this.unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public static class Builder {
        private String unitId;
        private String departmentId;
        private String departmentIdType;

        public Builder unitId(String unitId) {
            this.unitId = unitId;
            return this;
        }

        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        public Builder departmentIdType(com.larksuite.oapi.service.contact.v3.enums.DepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }


        public UnbindDepartmentUnitReqBody build() {
            return new UnbindDepartmentUnitReqBody(this);
        }
    }
}
