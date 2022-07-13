// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.attendance.v1.model;
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
public class BatchCreateUserDailyShiftDTO {
    @SerializedName("user_daily_shifts")
    private UserDailyShift[] userDailyShifts;
    public UserDailyShift[] getUserDailyShifts() {
        return this.userDailyShifts;
    }

    public void setUserDailyShifts(UserDailyShift[] userDailyShifts) {
        this.userDailyShifts = userDailyShifts;
    }

}
