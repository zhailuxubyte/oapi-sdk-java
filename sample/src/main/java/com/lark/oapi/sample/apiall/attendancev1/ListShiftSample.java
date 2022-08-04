package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.ListShiftReq;
import com.lark.oapi.service.attendance.v1.model.ListShiftResp;

// HTTP PATH: /open-apis/attendance/v1/shifts"
public class ListShiftSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    ListShiftReq req = ListShiftReq.newBuilder()
        .pageSize(10)
        .pageToken("")
        .build();

    // 发起请求
    ListShiftResp resp = client.attendance().shift().list(req);

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
