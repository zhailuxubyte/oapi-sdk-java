package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.QueryUserTaskReq;
import com.lark.oapi.service.attendance.v1.model.QueryUserTaskReqBody;
import com.lark.oapi.service.attendance.v1.model.QueryUserTaskResp;

// HTTP PATH: /open-apis/attendance/v1/user_tasks/query"
public class QueryUserTaskSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    QueryUserTaskReq req = QueryUserTaskReq.newBuilder()
        .employeeType("employee_id")
        .ignoreInvalidUsers(true)
        .includeTerminatedUser(true)
        .queryUserTaskReqBody(QueryUserTaskReqBody.newBuilder()
            .userIds(new String[]{})
            .checkDateFrom(20190817)
            .checkDateTo(20190820)
            .build())
        .build();

    // 发起请求
    QueryUserTaskResp resp = client.attendance().userTask().query(req);

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
