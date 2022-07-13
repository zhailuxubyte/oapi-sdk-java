// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.baike.v1.model;
import com.larksuite.oapi.service.baike.v1.enums.*;
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
public class HighlightEntityReq {
    @Body
    private HighlightEntityReqBody body;

    public HighlightEntityReqBody getHighlightEntityReqBody() {
        return this.body;
    }

    public void setHighlightEntityReqBody(HighlightEntityReqBody body) {
        this.body = body;
    }

// builder 开始
  public HighlightEntityReq(){}

  public HighlightEntityReq(Builder builder){
        this.body = builder.body;
  }

    public static class Builder {
    
        private HighlightEntityReqBody body;
    
        public HighlightEntityReqBody getHighlightEntityReqBody() {
            return this.body;
        }
        public Builder highlightEntityReqBody(HighlightEntityReqBody body) {
             this.body = body;
             return this;
        }
    public HighlightEntityReq build(){
        return new HighlightEntityReq(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
