package com.lark.oapi.sample.apiall.wikiv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.wiki.v2.model.ListSpaceNodeReq;
import com.lark.oapi.service.wiki.v2.model.ListSpaceNodeResp;

// HTTP PATH: /open-apis/wiki/v2/spaces/:space_id/nodes"
public class ListSpaceNodeSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    ListSpaceNodeReq req = ListSpaceNodeReq.newBuilder()
        .spaceId("")
        .pageSize(0)
        .pageToken("")
        .parentNodeToken("")
        .build();

    // 发起请求
    ListSpaceNodeResp resp = client.wiki().spaceNode().list(req);

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
