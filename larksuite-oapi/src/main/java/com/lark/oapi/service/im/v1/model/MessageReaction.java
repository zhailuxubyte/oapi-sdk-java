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

package com.lark.oapi.service.im.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
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
public class MessageReaction {
    @SerializedName("reaction_id")
    private String reactionId;
    @SerializedName("operator")
    private Operator operator;
    @SerializedName("action_time")
    private String actionTime;
    @SerializedName("reaction_type")
    private Emoji reactionType;
    public String getReactionId() {
        return this.reactionId;
    }

    public void setReactionId(String reactionId) {
        this.reactionId = reactionId;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public Emoji getReactionType() {
        return this.reactionType;
    }

    public void setReactionType(Emoji reactionType) {
        this.reactionType = reactionType;
    }


// builder 开始
  public MessageReaction(){}

  public MessageReaction(Builder builder){
      this.reactionId = builder.reactionId;
      this.operator = builder.operator;
      this.actionTime = builder.actionTime;
      this.reactionType = builder.reactionType;
  }

    public static class Builder {
        private String reactionId;
        private Operator operator;
        private String actionTime;
        private Emoji reactionType;
        public Builder reactionId(String reactionId) {
             this.reactionId = reactionId;
             return this;
        }
    
        public Builder operator(Operator operator) {
             this.operator = operator;
             return this;
        }
    
        public Builder actionTime(String actionTime) {
             this.actionTime = actionTime;
             return this;
        }
    
        public Builder reactionType(Emoji reactionType) {
             this.reactionType = reactionType;
             return this;
        }
    
    
    public MessageReaction build(){
        return new MessageReaction(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
