// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.larksuite.oapi.service.application.v6.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class NavigateMeta {
    @SerializedName("version")
    private String version;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("hover_image_url")
    private String hoverImageUrl;
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHoverImageUrl() {
        return this.hoverImageUrl;
    }

    public void setHoverImageUrl(String hoverImageUrl) {
        this.hoverImageUrl = hoverImageUrl;
    }


// builder 开始
  public NavigateMeta(){}

  public NavigateMeta(Builder builder){
      this.version = builder.version;
      this.imageUrl = builder.imageUrl;
      this.hoverImageUrl = builder.hoverImageUrl;
  }

    public static class Builder {
        private String version;
        private String imageUrl;
        private String hoverImageUrl;
        public Builder version(String version) {
             this.version = version;
             return this;
        }
    
        public Builder imageUrl(String imageUrl) {
             this.imageUrl = imageUrl;
             return this;
        }
    
        public Builder hoverImageUrl(String hoverImageUrl) {
             this.hoverImageUrl = hoverImageUrl;
             return this;
        }
    
    
    public NavigateMeta build(){
        return new NavigateMeta(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
