// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.meeting_room.v1.model;
import com.google.gson.annotations.SerializedName;

public class BuildingBatchGetIdResult {
    @SerializedName("buildings")
    private BuildingId[] buildings;

    public BuildingId[] getBuildings() {
        return this.buildings;
    }

    public void setBuildings(BuildingId[] buildings) {
        this.buildings = buildings;
    }

}
