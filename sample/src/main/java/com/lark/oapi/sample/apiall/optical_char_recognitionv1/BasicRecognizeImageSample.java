package com.lark.oapi.sample.apiall.optical_char_recognitionv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.optical_char_recognition.v1.model.BasicRecognizeImageReq;
import com.lark.oapi.service.optical_char_recognition.v1.model.BasicRecognizeImageReqBody;
import com.lark.oapi.service.optical_char_recognition.v1.model.BasicRecognizeImageResp;

// HTTP PATH: /open-apis/optical_char_recognition/v1/image/basic_recognize"
public class BasicRecognizeImageSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    BasicRecognizeImageReq req = BasicRecognizeImageReq.newBuilder()
        .basicRecognizeImageReqBody(BasicRecognizeImageReqBody.newBuilder()
            .image("")
            .build())
        .build();

    // 发起请求
    BasicRecognizeImageResp resp = client.opticalCharRecognition().image().basicRecognize(req);

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
