package com.lark.oapi.sample.apiall.imv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.ListMessageReactionReq;
import com.lark.oapi.service.im.v1.model.ListMessageReactionResp;

// HTTP PATH: /open-apis/im/v1/messages/:message_id/reactions"
public class ListMessageReactionSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    ListMessageReactionReq req = ListMessageReactionReq.newBuilder()
        .messageId("")
        .reactionType("")
        .pageToken("")
        .pageSize(0)
        .userIdType("open_id")
        .build();

    // 发起请求
    ListMessageReactionResp resp = client.im().messageReaction().list(req);

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
