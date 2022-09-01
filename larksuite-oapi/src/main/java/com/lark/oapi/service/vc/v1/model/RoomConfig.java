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

package com.lark.oapi.service.vc.v1.model;
import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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
public class RoomConfig {
    @SerializedName("room_background")
    private String roomBackground;
    @SerializedName("display_background")
    private String displayBackground;
    @SerializedName("digital_signage")
    private RoomDigitalSignage digitalSignage;
    @SerializedName("room_box_digital_signage")
    private RoomDigitalSignage roomBoxDigitalSignage;
    @SerializedName("room_status")
    private RoomStatus roomStatus;
    public String getRoomBackground() {
        return this.roomBackground;
    }

    public void setRoomBackground(String roomBackground) {
        this.roomBackground = roomBackground;
    }

    public String getDisplayBackground() {
        return this.displayBackground;
    }

    public void setDisplayBackground(String displayBackground) {
        this.displayBackground = displayBackground;
    }

    public RoomDigitalSignage getDigitalSignage() {
        return this.digitalSignage;
    }

    public void setDigitalSignage(RoomDigitalSignage digitalSignage) {
        this.digitalSignage = digitalSignage;
    }

    public RoomDigitalSignage getRoomBoxDigitalSignage() {
        return this.roomBoxDigitalSignage;
    }

    public void setRoomBoxDigitalSignage(RoomDigitalSignage roomBoxDigitalSignage) {
        this.roomBoxDigitalSignage = roomBoxDigitalSignage;
    }

    public RoomStatus getRoomStatus() {
        return this.roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }


// builder 开始
  public RoomConfig(){}

  public RoomConfig(Builder builder){
      this.roomBackground = builder.roomBackground;
      this.displayBackground = builder.displayBackground;
      this.digitalSignage = builder.digitalSignage;
      this.roomBoxDigitalSignage = builder.roomBoxDigitalSignage;
      this.roomStatus = builder.roomStatus;
  }

    public static class Builder {
        private String roomBackground;
        private String displayBackground;
        private RoomDigitalSignage digitalSignage;
        private RoomDigitalSignage roomBoxDigitalSignage;
        private RoomStatus roomStatus;
        public Builder roomBackground(String roomBackground) {
             this.roomBackground = roomBackground;
             return this;
        }
    
        public Builder displayBackground(String displayBackground) {
             this.displayBackground = displayBackground;
             return this;
        }
    
        public Builder digitalSignage(RoomDigitalSignage digitalSignage) {
             this.digitalSignage = digitalSignage;
             return this;
        }
    
        public Builder roomBoxDigitalSignage(RoomDigitalSignage roomBoxDigitalSignage) {
             this.roomBoxDigitalSignage = roomBoxDigitalSignage;
             return this;
        }
    
        public Builder roomStatus(RoomStatus roomStatus) {
             this.roomStatus = roomStatus;
             return this;
        }
    
    
    public RoomConfig build(){
        return new RoomConfig(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
