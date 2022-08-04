package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.SubscribeFileReq;
import com.lark.oapi.service.drive.v1.model.SubscribeFileResp;

// HTTP PATH: /open-apis/drive/v1/files/:file_token/subscribe"
public class SubscribeFileSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    SubscribeFileReq req = SubscribeFileReq.newBuilder()
        .fileToken("")
        .fileType("doc")
        .build();

    // 发起请求
    SubscribeFileResp resp = client.drive().file().subscribe(req);

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
