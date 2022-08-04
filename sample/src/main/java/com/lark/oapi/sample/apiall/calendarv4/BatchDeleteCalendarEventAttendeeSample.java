package com.lark.oapi.sample.apiall.calendarv4;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.calendar.v4.model.BatchDeleteCalendarEventAttendeeReq;
import com.lark.oapi.service.calendar.v4.model.BatchDeleteCalendarEventAttendeeReqBody;
import com.lark.oapi.service.calendar.v4.model.BatchDeleteCalendarEventAttendeeResp;
import com.lark.oapi.service.calendar.v4.model.CalendarEventAttendeeId;

// HTTP PATH: /open-apis/calendar/v4/calendars/:calendar_id/events/:event_id/attendees/batch_delete"
public class BatchDeleteCalendarEventAttendeeSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    BatchDeleteCalendarEventAttendeeReq req = BatchDeleteCalendarEventAttendeeReq.newBuilder()
        .calendarId("")
        .eventId("")
        .userIdType("user_id")
        .batchDeleteCalendarEventAttendeeReqBody(
            BatchDeleteCalendarEventAttendeeReqBody.newBuilder()
                .attendeeIds(new String[]{})
                .deleteIds(new CalendarEventAttendeeId[]{})
                .needNotification(false)
                .instanceStartTimeAdmin("")
                .isEnableAdmin(false)
                .build())
        .build();

    // 发起请求
    BatchDeleteCalendarEventAttendeeResp resp = client.calendar().calendarEventAttendee()
        .batchDelete(req);

    // 处理服务端错误
    if (!resp.success()) {
      System.out.println(String.format("code:%s,msg:%s,reqId:%s"
          , resp.getCode(), resp.getMsg(), resp.getRequestId()));
      return;
    }

    // 业务数据处理
    System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
  }
}
