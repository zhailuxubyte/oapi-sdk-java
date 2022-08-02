// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.vc.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.vc.v1.model.ApplyReserveReq;
import com.lark.oapi.service.vc.v1.model.ApplyReserveResp;
import com.lark.oapi.service.vc.v1.model.DeleteReserveReq;
import com.lark.oapi.service.vc.v1.model.DeleteReserveResp;
import com.lark.oapi.service.vc.v1.model.EndMeetingReq;
import com.lark.oapi.service.vc.v1.model.EndMeetingResp;
import com.lark.oapi.service.vc.v1.model.GetActiveMeetingReserveReq;
import com.lark.oapi.service.vc.v1.model.GetActiveMeetingReserveResp;
import com.lark.oapi.service.vc.v1.model.GetDailyReportReq;
import com.lark.oapi.service.vc.v1.model.GetDailyReportResp;
import com.lark.oapi.service.vc.v1.model.GetMeetingRecordingReq;
import com.lark.oapi.service.vc.v1.model.GetMeetingRecordingResp;
import com.lark.oapi.service.vc.v1.model.GetMeetingReq;
import com.lark.oapi.service.vc.v1.model.GetMeetingResp;
import com.lark.oapi.service.vc.v1.model.GetReserveReq;
import com.lark.oapi.service.vc.v1.model.GetReserveResp;
import com.lark.oapi.service.vc.v1.model.GetTopUserReportReq;
import com.lark.oapi.service.vc.v1.model.GetTopUserReportResp;
import com.lark.oapi.service.vc.v1.model.InviteMeetingReq;
import com.lark.oapi.service.vc.v1.model.InviteMeetingResp;
import com.lark.oapi.service.vc.v1.model.KickoutMeetingReq;
import com.lark.oapi.service.vc.v1.model.KickoutMeetingResp;
import com.lark.oapi.service.vc.v1.model.ListByNoMeetingReq;
import com.lark.oapi.service.vc.v1.model.ListByNoMeetingResp;
import com.lark.oapi.service.vc.v1.model.P2MeetingEndedV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingJoinMeetingV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingLeaveMeetingV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingRecordingEndedV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingRecordingReadyV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingRecordingStartedV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingShareEndedV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingShareStartedV1;
import com.lark.oapi.service.vc.v1.model.P2MeetingStartedV1;
import com.lark.oapi.service.vc.v1.model.QueryRoomConfigReq;
import com.lark.oapi.service.vc.v1.model.QueryRoomConfigResp;
import com.lark.oapi.service.vc.v1.model.SetHostMeetingReq;
import com.lark.oapi.service.vc.v1.model.SetHostMeetingResp;
import com.lark.oapi.service.vc.v1.model.SetPermissionMeetingRecordingReq;
import com.lark.oapi.service.vc.v1.model.SetPermissionMeetingRecordingResp;
import com.lark.oapi.service.vc.v1.model.SetRoomConfigReq;
import com.lark.oapi.service.vc.v1.model.SetRoomConfigResp;
import com.lark.oapi.service.vc.v1.model.StartMeetingRecordingReq;
import com.lark.oapi.service.vc.v1.model.StartMeetingRecordingResp;
import com.lark.oapi.service.vc.v1.model.StopMeetingRecordingReq;
import com.lark.oapi.service.vc.v1.model.StopMeetingRecordingResp;
import com.lark.oapi.service.vc.v1.model.UpdateReserveReq;
import com.lark.oapi.service.vc.v1.model.UpdateReserveResp;

public class VcService {

  private final Meeting meeting;
  private final MeetingRecording meetingRecording;
  private final Report report;
  private final Reserve reserve;
  private final RoomConfig roomConfig;

  public VcService(Config config) {
    this.meeting = new Meeting(config);
    this.meetingRecording = new MeetingRecording(config);
    this.report = new Report(config);
    this.reserve = new Reserve(config);
    this.roomConfig = new RoomConfig(config);
  }

  public Meeting meeting() {
    return meeting;
  }

  public MeetingRecording meetingRecording() {
    return meetingRecording;
  }

  public Report report() {
    return report;
  }

  public Reserve reserve() {
    return reserve;
  }

  public RoomConfig roomConfig() {
    return roomConfig;
  }

  public static class Meeting {

    private final Config config;

    public Meeting(Config config) {
      this.config = config;
    }

    public EndMeetingResp end(EndMeetingReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/end"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      EndMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, EndMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public EndMeetingResp end(EndMeetingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/end"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      EndMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, EndMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetMeetingResp get(GetMeetingReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/meetings/:meeting_id"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetMeetingResp get(GetMeetingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/meetings/:meeting_id"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public InviteMeetingResp invite(InviteMeetingReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/invite"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      InviteMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          InviteMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public InviteMeetingResp invite(InviteMeetingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/invite"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      InviteMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          InviteMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public KickoutMeetingResp kickout(KickoutMeetingReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/vc/v1/meetings/:meeting_id/kickout"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      KickoutMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          KickoutMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public KickoutMeetingResp kickout(KickoutMeetingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/vc/v1/meetings/:meeting_id/kickout"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      KickoutMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          KickoutMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public ListByNoMeetingResp listByNo(ListByNoMeetingReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/meetings/list_by_no"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListByNoMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListByNoMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public ListByNoMeetingResp listByNo(ListByNoMeetingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/meetings/list_by_no"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      ListByNoMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          ListByNoMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public SetHostMeetingResp setHost(SetHostMeetingReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/set_host"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      SetHostMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          SetHostMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public SetHostMeetingResp setHost(SetHostMeetingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/set_host"
          , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
          , req);

      // 反序列化
      SetHostMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          SetHostMeetingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class MeetingRecording {

    private final Config config;

    public MeetingRecording(Config config) {
      this.config = config;
    }

    public GetMeetingRecordingResp get(GetMeetingRecordingReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      GetMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetMeetingRecordingResp get(GetMeetingRecordingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      GetMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public SetPermissionMeetingRecordingResp setPermission(SetPermissionMeetingRecordingReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording/set_permission"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      SetPermissionMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          SetPermissionMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public SetPermissionMeetingRecordingResp setPermission(SetPermissionMeetingRecordingReq req)
        throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording/set_permission"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      SetPermissionMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          SetPermissionMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public StartMeetingRecordingResp start(StartMeetingRecordingReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording/start"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      StartMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          StartMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public StartMeetingRecordingResp start(StartMeetingRecordingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording/start"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      StartMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          StartMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public StopMeetingRecordingResp stop(StopMeetingRecordingReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording/stop"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      StopMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          StopMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public StopMeetingRecordingResp stop(StopMeetingRecordingReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
          , "/open-apis/vc/v1/meetings/:meeting_id/recording/stop"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      StopMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          StopMeetingRecordingResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class Report {

    private final Config config;

    public Report(Config config) {
      this.config = config;
    }

    public GetDailyReportResp getDaily(GetDailyReportReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reports/get_daily"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetDailyReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetDailyReportResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetDailyReportResp getDaily(GetDailyReportReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reports/get_daily"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetDailyReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetDailyReportResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetTopUserReportResp getTopUser(GetTopUserReportReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reports/get_top_user"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetTopUserReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetTopUserReportResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetTopUserReportResp getTopUser(GetTopUserReportReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reports/get_top_user"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      GetTopUserReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetTopUserReportResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class Reserve {

    private final Config config;

    public Reserve(Config config) {
      this.config = config;
    }

    public ApplyReserveResp apply(ApplyReserveReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/vc/v1/reserves/apply"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      ApplyReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ApplyReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public ApplyReserveResp apply(ApplyReserveReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/vc/v1/reserves/apply"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      ApplyReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ApplyReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public DeleteReserveResp delete(DeleteReserveReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/vc/v1/reserves/:reserve_id"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      DeleteReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public DeleteReserveResp delete(DeleteReserveReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
          , "/open-apis/vc/v1/reserves/:reserve_id"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      DeleteReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          DeleteReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetReserveResp get(GetReserveReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reserves/:reserve_id"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      GetReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetReserveResp get(GetReserveReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reserves/:reserve_id"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      GetReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetActiveMeetingReserveResp getActiveMeeting(GetActiveMeetingReserveReq req,
        RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reserves/:reserve_id/get_active_meeting"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      GetActiveMeetingReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetActiveMeetingReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public GetActiveMeetingReserveResp getActiveMeeting(GetActiveMeetingReserveReq req)
        throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/reserves/:reserve_id/get_active_meeting"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      GetActiveMeetingReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          GetActiveMeetingReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public UpdateReserveResp update(UpdateReserveReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/vc/v1/reserves/:reserve_id"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      UpdateReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UpdateReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public UpdateReserveResp update(UpdateReserveReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
          , "/open-apis/vc/v1/reserves/:reserve_id"
          , Sets.newHashSet(AccessTokenType.User)
          , req);

      // 反序列化
      UpdateReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          UpdateReserveResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public static class RoomConfig {

    private final Config config;

    public RoomConfig(Config config) {
      this.config = config;
    }

    public QueryRoomConfigResp query(QueryRoomConfigReq req, RequestOptions reqOptions)
        throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/room_configs/query"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      QueryRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          QueryRoomConfigResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public QueryRoomConfigResp query(QueryRoomConfigReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
          , "/open-apis/vc/v1/room_configs/query"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      QueryRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          QueryRoomConfigResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public SetRoomConfigResp set(SetRoomConfigReq req, RequestOptions reqOptions) throws Exception {
      // 请求参数选项
      if (reqOptions == null) {
        reqOptions = new RequestOptions();
      }

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/vc/v1/room_configs/set"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      SetRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          SetRoomConfigResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }

    public SetRoomConfigResp set(SetRoomConfigReq req) throws Exception {
      // 请求参数选项
      RequestOptions reqOptions = new RequestOptions();

      // 发起请求
      RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
          , "/open-apis/vc/v1/room_configs/set"
          , Sets.newHashSet(AccessTokenType.Tenant)
          , req);

      // 反序列化
      SetRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse,
          SetRoomConfigResp.class);
      resp.setRawResponse(httpResponse);
      resp.setRequest(req);

      return resp;
    }
  }

  public abstract static class P2MeetingJoinMeetingV1Handler implements
      IEventHandler<P2MeetingJoinMeetingV1> {

    @Override
    public P2MeetingJoinMeetingV1 getEvent() {
      return new P2MeetingJoinMeetingV1();
    }
  }

  public abstract static class P2MeetingLeaveMeetingV1Handler implements
      IEventHandler<P2MeetingLeaveMeetingV1> {

    @Override
    public P2MeetingLeaveMeetingV1 getEvent() {
      return new P2MeetingLeaveMeetingV1();
    }
  }

  public abstract static class P2MeetingEndedV1Handler implements IEventHandler<P2MeetingEndedV1> {

    @Override
    public P2MeetingEndedV1 getEvent() {
      return new P2MeetingEndedV1();
    }
  }

  public abstract static class P2MeetingStartedV1Handler implements
      IEventHandler<P2MeetingStartedV1> {

    @Override
    public P2MeetingStartedV1 getEvent() {
      return new P2MeetingStartedV1();
    }
  }

  public abstract static class P2MeetingRecordingEndedV1Handler implements
      IEventHandler<P2MeetingRecordingEndedV1> {

    @Override
    public P2MeetingRecordingEndedV1 getEvent() {
      return new P2MeetingRecordingEndedV1();
    }
  }

  public abstract static class P2MeetingRecordingReadyV1Handler implements
      IEventHandler<P2MeetingRecordingReadyV1> {

    @Override
    public P2MeetingRecordingReadyV1 getEvent() {
      return new P2MeetingRecordingReadyV1();
    }
  }

  public abstract static class P2MeetingRecordingStartedV1Handler implements
      IEventHandler<P2MeetingRecordingStartedV1> {

    @Override
    public P2MeetingRecordingStartedV1 getEvent() {
      return new P2MeetingRecordingStartedV1();
    }
  }

  public abstract static class P2MeetingShareEndedV1Handler implements
      IEventHandler<P2MeetingShareEndedV1> {

    @Override
    public P2MeetingShareEndedV1 getEvent() {
      return new P2MeetingShareEndedV1();
    }
  }

  public abstract static class P2MeetingShareStartedV1Handler implements
      IEventHandler<P2MeetingShareStartedV1> {

    @Override
    public P2MeetingShareStartedV1 getEvent() {
      return new P2MeetingShareStartedV1();
    }
  }
}