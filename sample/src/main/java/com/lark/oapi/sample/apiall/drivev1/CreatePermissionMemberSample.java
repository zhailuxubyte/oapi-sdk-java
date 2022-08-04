package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.CreatePermissionMemberReq;
import com.lark.oapi.service.drive.v1.model.CreatePermissionMemberResp;

// HTTP PATH: /open-apis/drive/v1/permissions/:token/members"
public class CreatePermissionMemberSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    CreatePermissionMemberReq req = CreatePermissionMemberReq.newBuilder()
        .token("")
        .type("doc")
        .needNotification(false)
        .build();

    // 发起请求
    CreatePermissionMemberResp resp = client.drive().permissionMember().create(req);

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
