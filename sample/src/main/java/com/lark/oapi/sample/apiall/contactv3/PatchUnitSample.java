package com.lark.oapi.sample.apiall.contactv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.contact.v3.model.PatchUnitReq;
import com.lark.oapi.service.contact.v3.model.PatchUnitReqBody;
import com.lark.oapi.service.contact.v3.model.PatchUnitResp;

// HTTP PATH: /open-apis/contact/v3/unit/:unit_id"
public class PatchUnitSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    PatchUnitReq req = PatchUnitReq.newBuilder()
        .unitId("")
        .patchUnitReqBody(PatchUnitReqBody.newBuilder()
            .name("")
            .build())
        .build();

    // 发起请求
    PatchUnitResp resp = client.contact().unit().patch(req);

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
