package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.GetFileCommentReq;
import com.lark.oapi.service.drive.v1.model.GetFileCommentResp;

// HTTP PATH: /open-apis/drive/v1/files/:file_token/comments/:comment_id"
public class GetFileCommentSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    GetFileCommentReq req = GetFileCommentReq.newBuilder()
        .fileToken("")
        .commentId("")
        .fileType("doc")
        .userIdType("user_id")
        .build();

    // 发起请求
    GetFileCommentResp resp = client.drive().fileComment().get(req);

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
