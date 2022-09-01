// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.speech_to_text.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;
public class StreamConfig {
    @SerializedName("stream_id")
    private String streamId;
    @SerializedName("sequence_id")
    private Integer sequenceId;
    @SerializedName("action")
    private Integer action;
    @SerializedName("format")
    private String format;
    @SerializedName("engine_type")
    private String engineType;
    public String getStreamId() {
        return this.streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public Integer getSequenceId() {
        return this.sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Integer getAction() {
        return this.action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


// builder 开始
  public StreamConfig(){}

  public StreamConfig(Builder builder){
      this.streamId = builder.streamId;
      this.sequenceId = builder.sequenceId;
      this.action = builder.action;
      this.format = builder.format;
      this.engineType = builder.engineType;
  }

    public static class Builder {
        private String streamId;
        private Integer sequenceId;
        private Integer action;
        private String format;
        private String engineType;
        public Builder streamId(String streamId) {
             this.streamId = streamId;
             return this;
        }
    
        public Builder sequenceId(Integer sequenceId) {
             this.sequenceId = sequenceId;
             return this;
        }
    
        public Builder action(Integer action) {
             this.action = action;
             return this;
        }
    
        public Builder format(String format) {
             this.format = format;
             return this;
        }
    
        public Builder engineType(String engineType) {
             this.engineType = engineType;
             return this;
        }
    
    
    public StreamConfig build(){
        return new StreamConfig(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
