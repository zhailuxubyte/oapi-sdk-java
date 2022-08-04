package com.lark.oapi.sample.apiall.bitablev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.bitable.v1.model.DeleteAppTableRecordReq;
import com.lark.oapi.service.bitable.v1.model.DeleteAppTableRecordResp;

// HTTP PATH: /open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
public class DeleteAppTableRecordSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    DeleteAppTableRecordReq req = DeleteAppTableRecordReq.newBuilder()
        .appToken("")
        .tableId("")
        .recordId("")
        .build();

    // 发起请求
    DeleteAppTableRecordResp resp = client.bitable().appTableRecord().delete(req);

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
