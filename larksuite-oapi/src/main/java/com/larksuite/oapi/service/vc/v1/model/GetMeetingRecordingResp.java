// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.response.BaseResponse;

public class GetMeetingRecordingResp extends BaseResponse {

    @SerializedName("data")
    private GetMeetingRecordingDTO body;

    public GetMeetingRecordingDTO getGetMeetingRecordingDTO() {
        return this.body;
    }

    public void setGetMeetingRecordingDTO(GetMeetingRecordingDTO body) {
        this.body = body;
    }
}
