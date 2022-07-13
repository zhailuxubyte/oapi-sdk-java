// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class Machine {
    @SerializedName("machine_sn")
    private String machineSn;
    @SerializedName("machine_name")
    private String machineName;

    // builder 开始
    public Machine() {
    }

    public Machine(Builder builder) {
        this.machineSn = builder.machineSn;
        this.machineName = builder.machineName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMachineSn() {
        return this.machineSn;
    }

    public void setMachineSn(String machineSn) {
        this.machineSn = machineSn;
    }

    public String getMachineName() {
        return this.machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public static class Builder {
        private String machineSn;
        private String machineName;

        public Builder machineSn(String machineSn) {
            this.machineSn = machineSn;
            return this;
        }

        public Builder machineName(String machineName) {
            this.machineName = machineName;
            return this;
        }


        public Machine build() {
            return new Machine(this);
        }
    }
}
