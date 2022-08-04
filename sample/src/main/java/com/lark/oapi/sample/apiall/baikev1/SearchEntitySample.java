package com.lark.oapi.sample.apiall.baikev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.baike.v1.model.SearchEntityReq;
import com.lark.oapi.service.baike.v1.model.SearchEntityReqBody;
import com.lark.oapi.service.baike.v1.model.SearchEntityResp;

// HTTP PATH: /open-apis/baike/v1/entities/search"
public class SearchEntitySample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    SearchEntityReq req = SearchEntityReq.newBuilder()
        .pageToken("")
        .pageSize(20)
        .userIdType("user_id")
        .searchEntityReqBody(SearchEntityReqBody.newBuilder()
            .query("百科")
            .build())
        .build();

    // 发起请求
    SearchEntityResp resp = client.baike().entity().search(req);

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
