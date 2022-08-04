package com.lark.oapi.sample.apiall.imv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.CreateFileReq;
import com.lark.oapi.service.im.v1.model.CreateFileReqBody;
import com.lark.oapi.service.im.v1.model.CreateFileResp;
import java.io.File;

// HTTP PATH: /open-apis/im/v1/files"
public class CreateFileSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    File file = new File("filepath");
    CreateFileReq req = CreateFileReq.newBuilder()
        .createFileReqBody(CreateFileReqBody.newBuilder()
            .fileType("opus")
            .fileName("测试视频.mp4")
            .duration(3000)
            .file(file)
            .build())
        .build();

    // 发起请求
    CreateFileResp resp = client.im().file().create(req);

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
