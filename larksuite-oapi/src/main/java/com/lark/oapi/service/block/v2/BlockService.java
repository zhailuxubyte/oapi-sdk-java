// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.block.v2;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.block.v2.model.CreateEntityReq;
import com.lark.oapi.service.block.v2.model.CreateEntityResp;
import com.lark.oapi.service.block.v2.model.CreateMessageReq;
import com.lark.oapi.service.block.v2.model.CreateMessageResp;
import com.lark.oapi.service.block.v2.model.UpdateEntityReq;
import com.lark.oapi.service.block.v2.model.UpdateEntityResp;

public class BlockService {

  private final Entity entity;
  private final Message message;

  public BlockService(Config config) {
    this.entity = new Entity(config);
    this.message = new Message(config);
  }

  public Entity entity() {
    return entity;
  }

  public Message message() {
    return message;
  }

  public static class Entity {

    private final Config config;

    public Entity(Config config) {
      this.config = config;
    }

    public CreateEntityResp create(CreateEntityReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/block/v2/entities"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateEntityResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateEntityResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }

    public CreateEntityResp create(CreateEntityReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/block/v2/entities"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateEntityResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateEntityResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }

    public UpdateEntityResp update(UpdateEntityReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/block/v2/entities/:block_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      UpdateEntityResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateEntityResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }

    public UpdateEntityResp update(UpdateEntityReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/block/v2/entities/:block_id"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      UpdateEntityResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateEntityResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }
  }

  public static class Message {

    private final Config config;

    public Message(Config config) {
      this.config = config;
    }

    public CreateMessageResp create(CreateMessageReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/block/v2/message"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateMessageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateMessageResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }

    public CreateMessageResp create(CreateMessageReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/block/v2/message"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      CreateMessageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          CreateMessageResp.class);
      resp.setRawResponse(httpResponse);
      return resp;
    }
  }

}