package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.UploadFinishMediaReq;
import com.lark.oapi.service.drive.v1.model.UploadFinishMediaReqBody;
import com.lark.oapi.service.drive.v1.model.UploadFinishMediaResp;

// HTTP PATH: /open-apis/drive/v1/medias/upload_finish"
public class UploadFinishMediaSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    UploadFinishMediaReq req = UploadFinishMediaReq.newBuilder()
        .uploadFinishMediaReqBody(UploadFinishMediaReqBody.newBuilder()
            .uploadId("")
            .blockNum(0)
            .build())
        .build();

    // 发起请求
    UploadFinishMediaResp resp = client.drive().media().uploadFinish(req);

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
