package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.DeleteFileCommentReplyReq;
import com.lark.oapi.service.drive.v1.model.DeleteFileCommentReplyResp;

// HTTP PATH: /open-apis/drive/v1/files/:file_token/comments/:comment_id/replies/:reply_id"
public class DeleteFileCommentReplySample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    DeleteFileCommentReplyReq req = DeleteFileCommentReplyReq.newBuilder()
        .fileToken("")
        .commentId("")
        .replyId("")
        .fileType("doc")
        .build();

    // 发起请求
    DeleteFileCommentReplyResp resp = client.drive().fileCommentReply().delete(req);

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
