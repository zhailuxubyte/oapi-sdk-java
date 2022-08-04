package com.lark.oapi.sample.apiall.bitablev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.bitable.v1.model.GetAppReq;
import com.lark.oapi.service.bitable.v1.model.GetAppResp;

// HTTP PATH: /open-apis/bitable/v1/apps/:app_token"
public class GetAppSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    GetAppReq req = GetAppReq.newBuilder()
        .appToken("")
        .build();

    // 发起请求
    GetAppResp resp = client.bitable().app().get(req);

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
