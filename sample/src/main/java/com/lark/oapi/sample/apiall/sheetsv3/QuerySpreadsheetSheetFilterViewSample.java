package com.lark.oapi.sample.apiall.sheetsv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.sheets.v3.model.QuerySpreadsheetSheetFilterViewReq;
import com.lark.oapi.service.sheets.v3.model.QuerySpreadsheetSheetFilterViewResp;

// HTTP PATH: /open-apis/sheets/v3/spreadsheets/:spreadsheet_token/sheets/:sheet_id/filter_views/query"
public class QuerySpreadsheetSheetFilterViewSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    QuerySpreadsheetSheetFilterViewReq req = QuerySpreadsheetSheetFilterViewReq.newBuilder()
        .spreadsheetToken("")
        .sheetId("")
        .build();

    // 发起请求
    QuerySpreadsheetSheetFilterViewResp resp = client.sheets().spreadsheetSheetFilterView()
        .query(req);

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
