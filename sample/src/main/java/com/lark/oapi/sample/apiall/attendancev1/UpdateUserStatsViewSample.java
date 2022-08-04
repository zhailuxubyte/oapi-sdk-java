package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.UpdateUserStatsViewReq;
import com.lark.oapi.service.attendance.v1.model.UpdateUserStatsViewReqBody;
import com.lark.oapi.service.attendance.v1.model.UpdateUserStatsViewResp;
import com.lark.oapi.service.attendance.v1.model.UserStatsView;

// HTTP PATH: /open-apis/attendance/v1/user_stats_views/:user_stats_view_id"
public class UpdateUserStatsViewSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    UpdateUserStatsViewReq req = UpdateUserStatsViewReq.newBuilder()
        .userStatsViewId("")
        .employeeType("employee_id")
        .updateUserStatsViewReqBody(UpdateUserStatsViewReqBody.newBuilder()
            .view(UserStatsView.newBuilder().build())
            .build())
        .build();

    // 发起请求
    UpdateUserStatsViewResp resp = client.attendance().userStatsView().update(req);

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
