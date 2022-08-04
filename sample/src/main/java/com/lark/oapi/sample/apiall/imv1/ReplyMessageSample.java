package com.lark.oapi.sample.apiall.imv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.ReplyMessageReq;
import com.lark.oapi.service.im.v1.model.ReplyMessageReqBody;
import com.lark.oapi.service.im.v1.model.ReplyMessageResp;

// HTTP PATH: /open-apis/im/v1/messages/:message_id/reply"
public class ReplyMessageSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    ReplyMessageReq req = ReplyMessageReq.newBuilder()
        .messageId("om_dc13264520392913993dd051dba21dcf")
        .replyMessageReqBody(ReplyMessageReqBody.newBuilder()
            .content("")
            .msgType("")
            .build())
        .build();

    // 发起请求
    ReplyMessageResp resp = client.im().message().reply(req);

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
