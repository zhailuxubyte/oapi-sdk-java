// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.meeting_room.v1.model;
import com.google.gson.annotations.SerializedName;

public class EventUid {
    @SerializedName("uid")
    private String uid;
    @SerializedName("original_time")
    private Integer originalTime;

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getOriginalTime() {
        return this.originalTime;
    }

    public void setOriginalTime(Integer originalTime) {
        this.originalTime = originalTime;
    }

}
