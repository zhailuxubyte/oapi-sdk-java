package com.lark.oapi.sample.apiall.helpdeskv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.helpdesk.v1.model.ListAgentScheduleReq;
import com.lark.oapi.service.helpdesk.v1.model.ListAgentScheduleResp;

// HTTP PATH: /open-apis/helpdesk/v1/agent_schedules"
public class ListAgentScheduleSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    ListAgentScheduleReq req = ListAgentScheduleReq.newBuilder()
        .status(new Integer[]{})
        .build();

    // 发起请求
    ListAgentScheduleResp resp = client.helpdesk().agentSchedule().list(req);

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
