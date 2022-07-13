// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class PermissionPublic {
    @SerializedName("external_access")
    private Boolean externalAccess;
    @SerializedName("security_entity")
    private String securityEntity;
    @SerializedName("comment_entity")
    private String commentEntity;
    @SerializedName("share_entity")
    private String shareEntity;
    @SerializedName("link_share_entity")
    private String linkShareEntity;
    @SerializedName("invite_external")
    private Boolean inviteExternal;
    @SerializedName("lock_switch")
    private Boolean lockSwitch;

    // builder 开始
    public PermissionPublic() {
    }

    public PermissionPublic(Builder builder) {
        this.externalAccess = builder.externalAccess;
        this.securityEntity = builder.securityEntity;
        this.commentEntity = builder.commentEntity;
        this.shareEntity = builder.shareEntity;
        this.linkShareEntity = builder.linkShareEntity;
        this.inviteExternal = builder.inviteExternal;
        this.lockSwitch = builder.lockSwitch;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getExternalAccess() {
        return this.externalAccess;
    }

    public void setExternalAccess(Boolean externalAccess) {
        this.externalAccess = externalAccess;
    }

    public String getSecurityEntity() {
        return this.securityEntity;
    }

    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }

    public String getCommentEntity() {
        return this.commentEntity;
    }

    public void setCommentEntity(String commentEntity) {
        this.commentEntity = commentEntity;
    }

    public String getShareEntity() {
        return this.shareEntity;
    }

    public void setShareEntity(String shareEntity) {
        this.shareEntity = shareEntity;
    }

    public String getLinkShareEntity() {
        return this.linkShareEntity;
    }

    public void setLinkShareEntity(String linkShareEntity) {
        this.linkShareEntity = linkShareEntity;
    }

    public Boolean getInviteExternal() {
        return this.inviteExternal;
    }

    public void setInviteExternal(Boolean inviteExternal) {
        this.inviteExternal = inviteExternal;
    }

    public Boolean getLockSwitch() {
        return this.lockSwitch;
    }

    public void setLockSwitch(Boolean lockSwitch) {
        this.lockSwitch = lockSwitch;
    }

    public static class Builder {
        private Boolean externalAccess;
        private String securityEntity;
        private String commentEntity;
        private String shareEntity;
        private String linkShareEntity;
        private Boolean inviteExternal;
        private Boolean lockSwitch;

        public Builder externalAccess(Boolean externalAccess) {
            this.externalAccess = externalAccess;
            return this;
        }

        public Builder securityEntity(String securityEntity) {
            this.securityEntity = securityEntity;
            return this;
        }

        public Builder securityEntity(com.larksuite.oapi.service.drive.v1.enums.SecurityEntityEnum securityEntity) {
            this.securityEntity = securityEntity.getValue();
            return this;
        }

        public Builder commentEntity(String commentEntity) {
            this.commentEntity = commentEntity;
            return this;
        }

        public Builder commentEntity(com.larksuite.oapi.service.drive.v1.enums.CommentEntityEnum commentEntity) {
            this.commentEntity = commentEntity.getValue();
            return this;
        }

        public Builder shareEntity(String shareEntity) {
            this.shareEntity = shareEntity;
            return this;
        }

        public Builder shareEntity(com.larksuite.oapi.service.drive.v1.enums.ShareEntityEnum shareEntity) {
            this.shareEntity = shareEntity.getValue();
            return this;
        }

        public Builder linkShareEntity(String linkShareEntity) {
            this.linkShareEntity = linkShareEntity;
            return this;
        }

        public Builder linkShareEntity(com.larksuite.oapi.service.drive.v1.enums.LinkShareEntityEnum linkShareEntity) {
            this.linkShareEntity = linkShareEntity.getValue();
            return this;
        }

        public Builder inviteExternal(Boolean inviteExternal) {
            this.inviteExternal = inviteExternal;
            return this;
        }

        public Builder lockSwitch(Boolean lockSwitch) {
            this.lockSwitch = lockSwitch;
            return this;
        }


        public PermissionPublic build() {
            return new PermissionPublic(this);
        }
    }
}
