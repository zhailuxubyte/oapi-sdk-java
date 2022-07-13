// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.larksuite.oapi.service.vc.v1.enums.*;
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
public class SetRoomConfigReqBody {
    @SerializedName("scope")
    private Integer scope;
    @SerializedName("country_id")
    private String countryId;
    @SerializedName("district_id")
    private String districtId;
    @SerializedName("building_id")
    private String buildingId;
    @SerializedName("floor_name")
    private String floorName;
    @SerializedName("room_id")
    private String roomId;
    @SerializedName("room_config")
    private RoomConfig roomConfig;
    public Integer getScope() {
        return this.scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getDistrictId() {
        return this.districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getFloorName() {
        return this.floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public RoomConfig getRoomConfig() {
        return this.roomConfig;
    }

    public void setRoomConfig(RoomConfig roomConfig) {
        this.roomConfig = roomConfig;
    }


// builder 开始
  public SetRoomConfigReqBody(){}

  public SetRoomConfigReqBody(Builder builder){
      this.scope = builder.scope;
      this.countryId = builder.countryId;
      this.districtId = builder.districtId;
      this.buildingId = builder.buildingId;
      this.floorName = builder.floorName;
      this.roomId = builder.roomId;
      this.roomConfig = builder.roomConfig;
  }

    public static class Builder {
        private Integer scope;
        private String countryId;
        private String districtId;
        private String buildingId;
        private String floorName;
        private String roomId;
        private RoomConfig roomConfig;
        public Builder scope(Integer scope) {
             this.scope = scope;
             return this;
        }
        public Builder scope(com.larksuite.oapi.service.vc.v1.enums.NodeScopeEnum scope) {
             this.scope = scope.getValue();
             return this;
        }
    
        public Builder countryId(String countryId) {
             this.countryId = countryId;
             return this;
        }
    
        public Builder districtId(String districtId) {
             this.districtId = districtId;
             return this;
        }
    
        public Builder buildingId(String buildingId) {
             this.buildingId = buildingId;
             return this;
        }
    
        public Builder floorName(String floorName) {
             this.floorName = floorName;
             return this;
        }
    
        public Builder roomId(String roomId) {
             this.roomId = roomId;
             return this;
        }
    
        public Builder roomConfig(RoomConfig roomConfig) {
             this.roomConfig = roomConfig;
             return this;
        }
    
    
    public SetRoomConfigReqBody build(){
        return new SetRoomConfigReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
