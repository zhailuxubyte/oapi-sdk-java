// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.passport.v1.model;

import com.google.gson.annotations.SerializedName;

public class IdpCredentialId {
    @SerializedName("idp_credential_id")
    private String idpCredentialId;

    // builder 开始
    public IdpCredentialId() {
    }

    public IdpCredentialId(Builder builder) {
        this.idpCredentialId = builder.idpCredentialId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIdpCredentialId() {
        return this.idpCredentialId;
    }

    public void setIdpCredentialId(String idpCredentialId) {
        this.idpCredentialId = idpCredentialId;
    }

    public static class Builder {
        private String idpCredentialId;

        public Builder idpCredentialId(String idpCredentialId) {
            this.idpCredentialId = idpCredentialId;
            return this;
        }


        public IdpCredentialId build() {
            return new IdpCredentialId(this);
        }
    }
}
