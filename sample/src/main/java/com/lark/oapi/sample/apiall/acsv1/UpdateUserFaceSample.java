package com.lark.oapi.sample.apiall.acsv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.acs.v1.model.UpdateUserFaceReq;
import com.lark.oapi.service.acs.v1.model.UpdateUserFaceResp;
import java.io.File;

// HTTP PATH: /open-apis/acs/v1/users/:user_id/face"
public class UpdateUserFaceSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    File file = new File("filepath");
    UpdateUserFaceReq req = UpdateUserFaceReq.newBuilder()
        .userId("")
        .userIdType("user_id")
        .build();

    // 发起请求
    UpdateUserFaceResp resp = client.acs().userFace().update(req);

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
