// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class TaskApprove {
    @SerializedName("approval_code")
    private String approvalCode;
    @SerializedName("instance_code")
    private String instanceCode;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("comment")
    private String comment;
    @SerializedName("task_id")
    private String taskId;

    // builder 开始
    public TaskApprove() {
    }

    public TaskApprove(Builder builder) {
        this.approvalCode = builder.approvalCode;
        this.instanceCode = builder.instanceCode;
        this.userId = builder.userId;
        this.comment = builder.comment;
        this.taskId = builder.taskId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getInstanceCode() {
        return this.instanceCode;
    }

    public void setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public static class Builder {
        private String approvalCode;
        private String instanceCode;
        private String userId;
        private String comment;
        private String taskId;

        public Builder approvalCode(String approvalCode) {
            this.approvalCode = approvalCode;
            return this;
        }

        public Builder instanceCode(String instanceCode) {
            this.instanceCode = instanceCode;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }


        public TaskApprove build() {
            return new TaskApprove(this);
        }
    }
}
