// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.meeting_room.v1.model;
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
import com.larksuite.oapi.event.model.BaseEventV2;
import com.larksuite.oapi.core.response.BaseResponse;
public class P2MeetingRoomCreatedV1 extends BaseEventV2 {
    @SerializedName("event")
    private P2MeetingRoomCreatedV1Data event;
    public P2MeetingRoomCreatedV1Data getEvent() {
        return this.event;
    }

    public void setEvent(P2MeetingRoomCreatedV1Data event) {
        this.event = event;
    }

}
