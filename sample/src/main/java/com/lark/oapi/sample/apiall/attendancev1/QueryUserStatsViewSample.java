package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.QueryUserStatsViewReq;
import com.lark.oapi.service.attendance.v1.model.QueryUserStatsViewReqBody;
import com.lark.oapi.service.attendance.v1.model.QueryUserStatsViewResp;

// HTTP PATH: /open-apis/attendance/v1/user_stats_views/query"
public class QueryUserStatsViewSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    QueryUserStatsViewReq req = QueryUserStatsViewReq.newBuilder()
        .employeeType("employee_id")
        .queryUserStatsViewReqBody(QueryUserStatsViewReqBody.newBuilder()
            .locale("en")
            .statsType("daily")
            .userId("dd31248a")
            .build())
        .build();

    // 发起请求
    QueryUserStatsViewResp resp = client.attendance().userStatsView().query(req);

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
