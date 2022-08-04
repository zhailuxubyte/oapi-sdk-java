package com.lark.oapi.sample.apiall.vcv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.vc.v1.model.ApplyReserveReq;
import com.lark.oapi.service.vc.v1.model.ApplyReserveReqBody;
import com.lark.oapi.service.vc.v1.model.ApplyReserveResp;
import com.lark.oapi.service.vc.v1.model.ReserveMeetingSetting;

// HTTP PATH: /open-apis/vc/v1/reserves/apply"
public class ApplyReserveSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    ApplyReserveReq req = ApplyReserveReq.newBuilder()
        .userIdType("user_id")
        .applyReserveReqBody(ApplyReserveReqBody.newBuilder()
            .endTime("1608888867")
            .meetingSettings(ReserveMeetingSetting.newBuilder().build())
            .build())
        .build();

    // 发起请求
    ApplyReserveResp resp = client.vc().reserve().apply(req);

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
