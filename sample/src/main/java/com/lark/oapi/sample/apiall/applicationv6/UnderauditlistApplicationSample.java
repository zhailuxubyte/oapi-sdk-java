package com.lark.oapi.sample.apiall.applicationv6;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.application.v6.model.UnderauditlistApplicationReq;
import com.lark.oapi.service.application.v6.model.UnderauditlistApplicationResp;

// HTTP PATH: /open-apis/application/v6/applications/underauditlist"
public class UnderauditlistApplicationSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    UnderauditlistApplicationReq req = UnderauditlistApplicationReq.newBuilder()
        .lang("zh_cn")
        .pageToken("")
        .pageSize(20)
        .userIdType("user_id")
        .build();

    // 发起请求
    UnderauditlistApplicationResp resp = client.application().application().underauditlist(req);

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
