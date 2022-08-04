package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.UploadPartMediaReq;
import com.lark.oapi.service.drive.v1.model.UploadPartMediaReqBody;
import com.lark.oapi.service.drive.v1.model.UploadPartMediaResp;
import java.io.File;

// HTTP PATH: /open-apis/drive/v1/medias/upload_part"
public class UploadPartMediaSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    File file = new File("filepath");
    UploadPartMediaReq req = UploadPartMediaReq.newBuilder()
        .uploadPartMediaReqBody(UploadPartMediaReqBody.newBuilder()
            .uploadId("")
            .seq(0)
            .size(0)
            .checksum("")
            .file(file)
            .build())
        .build();

    // 发起请求
    UploadPartMediaResp resp = client.drive().media().uploadPart(req);

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
