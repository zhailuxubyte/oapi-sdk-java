package com.lark.oapi.sample.apiall.imv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.UrgentAppMessageReq;
import com.lark.oapi.service.im.v1.model.UrgentAppMessageResp;

// HTTP PATH: /open-apis/im/v1/messages/:message_id/urgent_app"
public class UrgentAppMessageSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    UrgentAppMessageReq req = UrgentAppMessageReq.newBuilder()
        .messageId("om_dc13264520392913993dd051dba21dcf")
        .userIdType("user_id")
        .build();

    // 发起请求
    UrgentAppMessageResp resp = client.im().message().urgentApp(req);

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
