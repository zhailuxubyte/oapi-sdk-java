package com.lark.oapi.sample.apiall.taskv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.task.v1.model.CreateTaskCollaboratorReq;
import com.lark.oapi.service.task.v1.model.CreateTaskCollaboratorResp;

// HTTP PATH: /open-apis/task/v1/tasks/:task_id/collaborators"
public class CreateTaskCollaboratorSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    CreateTaskCollaboratorReq req = CreateTaskCollaboratorReq.newBuilder()
        .taskId("83912691-2e43-47fc-94a4-d512e03984fa")
        .userIdType("user_id")
        .build();

    // 发起请求
    CreateTaskCollaboratorResp resp = client.task().taskCollaborator().create(req);

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
