package com.lark.oapi.sample.apiall.helpdeskv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.helpdesk.v1.model.CreateFaqReq;
import com.lark.oapi.service.helpdesk.v1.model.CreateFaqReqBody;
import com.lark.oapi.service.helpdesk.v1.model.CreateFaqResp;
import com.lark.oapi.service.helpdesk.v1.model.FaqUpdateInfo;

// HTTP PATH: /open-apis/helpdesk/v1/faqs"
public class CreateFaqSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    CreateFaqReq req = CreateFaqReq.newBuilder()
        .createFaqReqBody(CreateFaqReqBody.newBuilder()
            .faq(FaqUpdateInfo.newBuilder().build())
            .build())
        .build();

    // 发起请求
    CreateFaqResp resp = client.helpdesk().faq().create(req);

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
