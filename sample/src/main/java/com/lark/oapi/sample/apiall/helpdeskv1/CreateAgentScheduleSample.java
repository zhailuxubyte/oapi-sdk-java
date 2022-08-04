package com.lark.oapi.sample.apiall.helpdeskv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.helpdesk.v1.model.AgentScheduleUpdateInfo;
import com.lark.oapi.service.helpdesk.v1.model.CreateAgentScheduleReq;
import com.lark.oapi.service.helpdesk.v1.model.CreateAgentScheduleReqBody;
import com.lark.oapi.service.helpdesk.v1.model.CreateAgentScheduleResp;

// HTTP PATH: /open-apis/helpdesk/v1/agent_schedules"
public class CreateAgentScheduleSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    CreateAgentScheduleReq req = CreateAgentScheduleReq.newBuilder()
        .createAgentScheduleReqBody(CreateAgentScheduleReqBody.newBuilder()
            .agentSchedules(new AgentScheduleUpdateInfo[]{})
            .build())
        .build();

    // 发起请求
    CreateAgentScheduleResp resp = client.helpdesk().agentSchedule().create(req);

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
