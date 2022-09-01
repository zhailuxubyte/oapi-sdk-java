package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.*;

// HTTP PATH: /open-apis/attendance/v1/user_task_remedys"
public class CreateUserTaskRemedySample{

  public static void main(String arg[]) throws Exception {
	  // 构建client
	  Client client = Client.newBuilder("appId", "appSecret").build();

	  // 创建请求对象
	  CreateUserTaskRemedyReq req = CreateUserTaskRemedyReq.newBuilder()
			 .employeeType("employee_id")
			 .UserTaskRemedy(UserTaskRemedy.newBuilder()
				 .userId("abd754f7")
				 .remedyDate(20210701)
				 .punchNo(0)
				 .workType(1)
				 .approvalId("6737202939523236113")
				 .remedyTime("")
				 .status(2)
				 .reason("忘记打卡")
				 .time("1611476284")
				 .timeZone("Asia/Shanghai")
				 .createTime("1611476284")
				 .updateTime("1611476284")
				  .build())
			 .build();

	  // 发起请求
	  CreateUserTaskRemedyResp resp = client.attendance().userTaskRemedy().create(req);

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
