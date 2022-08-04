package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.ReplyContent;
import com.lark.oapi.service.drive.v1.model.UpdateFileCommentReplyReq;
import com.lark.oapi.service.drive.v1.model.UpdateFileCommentReplyReqBody;
import com.lark.oapi.service.drive.v1.model.UpdateFileCommentReplyResp;

// HTTP PATH: /open-apis/drive/v1/files/:file_token/comments/:comment_id/replies/:reply_id"
public class UpdateFileCommentReplySample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    UpdateFileCommentReplyReq req = UpdateFileCommentReplyReq.newBuilder()
        .fileToken("")
        .commentId("")
        .replyId("")
        .fileType("doc")
        .userIdType("user_id")
        .updateFileCommentReplyReqBody(UpdateFileCommentReplyReqBody.newBuilder()
            .content(ReplyContent.newBuilder().build())
            .build())
        .build();

    // 发起请求
    UpdateFileCommentReplyResp resp = client.drive().fileCommentReply().update(req);

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
