package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.QueryUserStatsFieldReq;
import com.lark.oapi.service.attendance.v1.model.QueryUserStatsFieldReqBody;
import com.lark.oapi.service.attendance.v1.model.QueryUserStatsFieldResp;

// HTTP PATH: /open-apis/attendance/v1/user_stats_fields/query"
public class QueryUserStatsFieldSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    QueryUserStatsFieldReq req = QueryUserStatsFieldReq.newBuilder()
        .employeeType("employee_id")
        .queryUserStatsFieldReqBody(QueryUserStatsFieldReqBody.newBuilder()
            .locale("en")
            .statsType("daily")
            .startDate(0)
            .endDate(0)
            .build())
        .build();

    // 发起请求
    QueryUserStatsFieldResp resp = client.attendance().userStatsField().query(req);

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
