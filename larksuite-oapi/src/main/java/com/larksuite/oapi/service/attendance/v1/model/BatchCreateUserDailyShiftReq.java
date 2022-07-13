// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Query;

public class BatchCreateUserDailyShiftReq {
    @Query
    @SerializedName("employee_type")
    private String employeeType;
    @Body
    private BatchCreateUserDailyShiftReqBody body;

    // builder 开始
    public BatchCreateUserDailyShiftReq() {
    }

    public BatchCreateUserDailyShiftReq(Builder builder) {
        this.employeeType = builder.employeeType;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public BatchCreateUserDailyShiftReqBody getBatchCreateUserDailyShiftReqBody() {
        return this.body;
    }

    public void setBatchCreateUserDailyShiftReqBody(BatchCreateUserDailyShiftReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String employeeType;
        private BatchCreateUserDailyShiftReqBody body;

        public Builder employeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        public Builder employeeType(com.larksuite.oapi.service.attendance.v1.enums.EmployeeTypeEnum employeeType) {
            this.employeeType = employeeType.getValue();
            return this;
        }

        public BatchCreateUserDailyShiftReqBody getBatchCreateUserDailyShiftReqBody() {
            return this.body;
        }

        public Builder batchCreateUserDailyShiftReqBody(BatchCreateUserDailyShiftReqBody body) {
            this.body = body;
            return this;
        }

        public BatchCreateUserDailyShiftReq build() {
            return new BatchCreateUserDailyShiftReq(this);
        }
    }
}
