package com.lark.oapi.sample.apiall.translationv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.translation.v1.model.DetectTextReq;
import com.lark.oapi.service.translation.v1.model.DetectTextReqBody;
import com.lark.oapi.service.translation.v1.model.DetectTextResp;

// HTTP PATH: /open-apis/translation/v1/text/detect"
public class DetectTextSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    DetectTextReq req = DetectTextReq.newBuilder()
        .detectTextReqBody(DetectTextReqBody.newBuilder()
            .text("")
            .build())
        .build();

    // 发起请求
    DetectTextResp resp = client.translation().text().detect(req);

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
