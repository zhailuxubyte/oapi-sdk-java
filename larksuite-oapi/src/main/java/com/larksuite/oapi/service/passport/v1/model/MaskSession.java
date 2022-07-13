// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.passport.v1.model;

import com.google.gson.annotations.SerializedName;

public class MaskSession {
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("terminal_type")
    private Integer terminalType;
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public MaskSession() {
    }

    public MaskSession(Builder builder) {
        this.createTime = builder.createTime;
        this.terminalType = builder.terminalType;
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getTerminalType() {
        return this.terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        private Long createTime;
        private Integer terminalType;
        private String userId;

        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder terminalType(Integer terminalType) {
            this.terminalType = terminalType;
            return this;
        }

        public Builder terminalType(com.larksuite.oapi.service.passport.v1.enums.TerminalTypeEnum terminalType) {
            this.terminalType = terminalType.getValue();
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public MaskSession build() {
            return new MaskSession(this);
        }
    }
}
