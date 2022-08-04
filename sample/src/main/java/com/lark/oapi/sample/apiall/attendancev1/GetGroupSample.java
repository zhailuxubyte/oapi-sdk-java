package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.GetGroupReq;
import com.lark.oapi.service.attendance.v1.model.GetGroupResp;

// HTTP PATH: /open-apis/attendance/v1/groups/:group_id"
public class GetGroupSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    GetGroupReq req = GetGroupReq.newBuilder()
        .groupId("6919358128597097404")
        .employeeType("employee_id")
        .deptType("open_id")
        .build();

    // 发起请求
    GetGroupResp resp = client.attendance().group().get(req);

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
