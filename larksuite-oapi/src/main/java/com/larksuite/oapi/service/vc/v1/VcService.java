// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1;

import com.larksuite.oapi.core.token.AccessTokenType;
import com.larksuite.oapi.core.Transport;
import com.larksuite.oapi.core.response.RawResponse;
import com.larksuite.oapi.core.utils.UnmarshalRespUtil;
import com.larksuite.oapi.event.IEventHandler;
import com.larksuite.oapi.core.utils.Sets;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.core.request.RequestOptions;
import java.io.ByteArrayOutputStream;
import com.larksuite.oapi.event.model.BaseEvent;
import com.larksuite.oapi.event.model.BaseEventV2;
import com.larksuite.oapi.service.vc.v1.model.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/end"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           EndMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, EndMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public EndMeetingResp end(EndMeetingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/end"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           EndMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, EndMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public GetMeetingResp get(GetMeetingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/meetings/:meeting_id"
                       ,Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           GetMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetMeetingResp get(GetMeetingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/meetings/:meeting_id"
                       ,Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           GetMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public InviteMeetingResp invite(InviteMeetingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/invite"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           InviteMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, InviteMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public InviteMeetingResp invite(InviteMeetingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/invite"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           InviteMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, InviteMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public KickoutMeetingResp kickout(KickoutMeetingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/kickout"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           KickoutMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, KickoutMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public KickoutMeetingResp kickout(KickoutMeetingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/kickout"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           KickoutMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, KickoutMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public ListByNoMeetingResp listByNo(ListByNoMeetingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/meetings/list_by_no"
                       ,Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           ListByNoMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListByNoMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public ListByNoMeetingResp listByNo(ListByNoMeetingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/meetings/list_by_no"
                       ,Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           ListByNoMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListByNoMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public SetHostMeetingResp setHost(SetHostMeetingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/set_host"
                       ,Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           SetHostMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SetHostMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public SetHostMeetingResp setHost(SetHostMeetingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/set_host"
                       ,Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           SetHostMeetingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SetHostMeetingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public MeetingRecording meetingRecording() {
        return meetingRecording;
    }

    public static class MeetingRecording {
        private final Config config;

        public MeetingRecording(Config config) {
            this.config = config;
        }
    
        public GetMeetingRecordingResp get(GetMeetingRecordingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           GetMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetMeetingRecordingResp get(GetMeetingRecordingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           GetMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public SetPermissionMeetingRecordingResp setPermission(SetPermissionMeetingRecordingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording/set_permission"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           SetPermissionMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SetPermissionMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public SetPermissionMeetingRecordingResp setPermission(SetPermissionMeetingRecordingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording/set_permission"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           SetPermissionMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SetPermissionMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public StartMeetingRecordingResp start(StartMeetingRecordingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording/start"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           StartMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, StartMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public StartMeetingRecordingResp start(StartMeetingRecordingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording/start"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           StartMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, StartMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public StopMeetingRecordingResp stop(StopMeetingRecordingReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording/stop"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           StopMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, StopMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public StopMeetingRecordingResp stop(StopMeetingRecordingReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/vc/v1/meetings/:meeting_id/recording/stop"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           StopMeetingRecordingResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, StopMeetingRecordingResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public Report report() {
        return report;
    }

    public static class Report {
        private final Config config;

        public Report(Config config) {
            this.config = config;
        }
    
        public GetDailyReportResp getDaily(GetDailyReportReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reports/get_daily"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           GetDailyReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetDailyReportResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetDailyReportResp getDaily(GetDailyReportReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reports/get_daily"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           GetDailyReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetDailyReportResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public GetTopUserReportResp getTopUser(GetTopUserReportReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reports/get_top_user"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           GetTopUserReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetTopUserReportResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetTopUserReportResp getTopUser(GetTopUserReportReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reports/get_top_user"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           GetTopUserReportResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetTopUserReportResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public Reserve reserve() {
        return reserve;
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
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/vc/v1/reserves/apply"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           ApplyReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ApplyReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public ApplyReserveResp apply(ApplyReserveReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/vc/v1/reserves/apply"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           ApplyReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ApplyReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public DeleteReserveResp delete(DeleteReserveReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "DELETE"
                       ,"/open-apis/vc/v1/reserves/:reserve_id"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           DeleteReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public DeleteReserveResp delete(DeleteReserveReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "DELETE"
                       ,"/open-apis/vc/v1/reserves/:reserve_id"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           DeleteReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public GetReserveResp get(GetReserveReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reserves/:reserve_id"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           GetReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetReserveResp get(GetReserveReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reserves/:reserve_id"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           GetReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public GetActiveMeetingReserveResp getActiveMeeting(GetActiveMeetingReserveReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reserves/:reserve_id/get_active_meeting"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           GetActiveMeetingReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetActiveMeetingReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetActiveMeetingReserveResp getActiveMeeting(GetActiveMeetingReserveReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/reserves/:reserve_id/get_active_meeting"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           GetActiveMeetingReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetActiveMeetingReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public UpdateReserveResp update(UpdateReserveReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PUT"
                       ,"/open-apis/vc/v1/reserves/:reserve_id"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
	       
           // 反序列化
           UpdateReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public UpdateReserveResp update(UpdateReserveReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PUT"
                       ,"/open-apis/vc/v1/reserves/:reserve_id"
                       ,Sets.newHashSet(AccessTokenType.User)
                       ,req);
            
           // 反序列化
           UpdateReserveResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateReserveResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public RoomConfig roomConfig() {
        return roomConfig;
    }

    public static class RoomConfig {
        private final Config config;

        public RoomConfig(Config config) {
            this.config = config;
        }
    
        public QueryRoomConfigResp query(QueryRoomConfigReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/room_configs/query"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           QueryRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryRoomConfigResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public QueryRoomConfigResp query(QueryRoomConfigReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/vc/v1/room_configs/query"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           QueryRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryRoomConfigResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public SetRoomConfigResp set(SetRoomConfigReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/vc/v1/room_configs/set"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           SetRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SetRoomConfigResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public SetRoomConfigResp set(SetRoomConfigReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/vc/v1/room_configs/set"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           SetRoomConfigResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SetRoomConfigResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public abstract static class P2MeetingJoinMeetingV1Handler implements IEventHandler<P2MeetingJoinMeetingV1> {
        @Override
        public P2MeetingJoinMeetingV1 getEvent() {
            return new P2MeetingJoinMeetingV1();
        }
    }
    public abstract static class P2MeetingLeaveMeetingV1Handler implements IEventHandler<P2MeetingLeaveMeetingV1> {
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
    public abstract static class P2MeetingStartedV1Handler implements IEventHandler<P2MeetingStartedV1> {
        @Override
        public P2MeetingStartedV1 getEvent() {
            return new P2MeetingStartedV1();
        }
    }
    public abstract static class P2MeetingRecordingEndedV1Handler implements IEventHandler<P2MeetingRecordingEndedV1> {
        @Override
        public P2MeetingRecordingEndedV1 getEvent() {
            return new P2MeetingRecordingEndedV1();
        }
    }
    public abstract static class P2MeetingRecordingReadyV1Handler implements IEventHandler<P2MeetingRecordingReadyV1> {
        @Override
        public P2MeetingRecordingReadyV1 getEvent() {
            return new P2MeetingRecordingReadyV1();
        }
    }
    public abstract static class P2MeetingRecordingStartedV1Handler implements IEventHandler<P2MeetingRecordingStartedV1> {
        @Override
        public P2MeetingRecordingStartedV1 getEvent() {
            return new P2MeetingRecordingStartedV1();
        }
    }
    public abstract static class P2MeetingShareEndedV1Handler implements IEventHandler<P2MeetingShareEndedV1> {
        @Override
        public P2MeetingShareEndedV1 getEvent() {
            return new P2MeetingShareEndedV1();
        }
    }
    public abstract static class P2MeetingShareStartedV1Handler implements IEventHandler<P2MeetingShareStartedV1> {
        @Override
        public P2MeetingShareStartedV1 getEvent() {
            return new P2MeetingShareStartedV1();
        }
    }

}