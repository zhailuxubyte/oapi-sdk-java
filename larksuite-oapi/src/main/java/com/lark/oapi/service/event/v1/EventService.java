// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.event.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.event.v1.model.ListOutboundIpReq;
import com.lark.oapi.service.event.v1.model.ListOutboundIpResp;

public class EventService {

  private final OutboundIp outboundIp;

  public EventService(Config config) {
    this.outboundIp = new OutboundIp(config);
  }

  public OutboundIp outboundIp() {
    return outboundIp;
  }

  public static class OutboundIp {

    private final Config config;

    public OutboundIp(Config config) {
      this.config = config;
    }

    public ListOutboundIpResp list(ListOutboundIpReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/event/v1/outbound_ip"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListOutboundIpResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListOutboundIpResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }

    public ListOutboundIpResp list(ListOutboundIpReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/event/v1/outbound_ip"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListOutboundIpResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListOutboundIpResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }
  }

}