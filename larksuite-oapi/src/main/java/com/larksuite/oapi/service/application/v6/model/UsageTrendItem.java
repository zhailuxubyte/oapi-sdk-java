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
public class UsageTrendItem {
    @SerializedName("timestamp")
    private Long timestamp;
    @SerializedName("page_view")
    private Long pageView;
    @SerializedName("unique_visitor")
    private Long uniqueVisitor;
    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getPageView() {
        return this.pageView;
    }

    public void setPageView(Long pageView) {
        this.pageView = pageView;
    }

    public Long getUniqueVisitor() {
        return this.uniqueVisitor;
    }

    public void setUniqueVisitor(Long uniqueVisitor) {
        this.uniqueVisitor = uniqueVisitor;
    }


// builder 开始
  public UsageTrendItem(){}

  public UsageTrendItem(Builder builder){
      this.timestamp = builder.timestamp;
      this.pageView = builder.pageView;
      this.uniqueVisitor = builder.uniqueVisitor;
  }

    public static class Builder {
        private Long timestamp;
        private Long pageView;
        private Long uniqueVisitor;
        public Builder timestamp(Long timestamp) {
             this.timestamp = timestamp;
             return this;
        }
    
        public Builder pageView(Long pageView) {
             this.pageView = pageView;
             return this;
        }
    
        public Builder uniqueVisitor(Long uniqueVisitor) {
             this.uniqueVisitor = uniqueVisitor;
             return this;
        }
    
    
    public UsageTrendItem build(){
        return new UsageTrendItem(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
