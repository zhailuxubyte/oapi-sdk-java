package com.lark.oapi.sample.apiall.passportv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.passport.v1.model.QuerySessionReq;
import com.lark.oapi.service.passport.v1.model.QuerySessionReqBody;
import com.lark.oapi.service.passport.v1.model.QuerySessionResp;

// HTTP PATH: /open-apis/passport/v1/sessions/query"
public class QuerySessionSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    QuerySessionReq req = QuerySessionReq.newBuilder()
        .userIdType("open_id")
        .querySessionReqBody(QuerySessionReqBody.newBuilder()
            .userIds(new String[]{})
            .build())
        .build();

    // 发起请求
    QuerySessionResp resp = client.passport().session().query(req);

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
