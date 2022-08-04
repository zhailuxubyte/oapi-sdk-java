package com.lark.oapi.sample.apiall.contactv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.contact.v3.model.UnbindDepartmentUnitReq;
import com.lark.oapi.service.contact.v3.model.UnbindDepartmentUnitReqBody;
import com.lark.oapi.service.contact.v3.model.UnbindDepartmentUnitResp;

// HTTP PATH: /open-apis/contact/v3/unit/unbind_department"
public class UnbindDepartmentUnitSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    UnbindDepartmentUnitReq req = UnbindDepartmentUnitReq.newBuilder()
        .unbindDepartmentUnitReqBody(UnbindDepartmentUnitReqBody.newBuilder()
            .unitId("")
            .departmentId("")
            .departmentIdType("open_department_id")
            .build())
        .build();

    // 发起请求
    UnbindDepartmentUnitResp resp = client.contact().unit().unbindDepartment(req);

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
