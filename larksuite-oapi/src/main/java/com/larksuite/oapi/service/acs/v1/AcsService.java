// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.acs.v1;

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
import com.larksuite.oapi.service.acs.v1.model.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AcsService {
    private final AccessRecord accessRecord;
    private final AccessRecordAccessPhoto accessRecordAccessPhoto;
    private final Device device;
    private final User user;
    private final UserFace userFace;

    public AcsService(Config config) {
        this.accessRecord = new AccessRecord(config);
        this.accessRecordAccessPhoto = new AccessRecordAccessPhoto(config);
        this.device = new Device(config);
        this.user = new User(config);
        this.userFace = new UserFace(config);
    }
    public AccessRecord accessRecord() {
        return accessRecord;
    }

    public static class AccessRecord {
        private final Config config;

        public AccessRecord(Config config) {
            this.config = config;
        }
    
        public ListAccessRecordResp list(ListAccessRecordReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/access_records"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           ListAccessRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAccessRecordResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public ListAccessRecordResp list(ListAccessRecordReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/access_records"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           ListAccessRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAccessRecordResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public AccessRecordAccessPhoto accessRecordAccessPhoto() {
        return accessRecordAccessPhoto;
    }

    public static class AccessRecordAccessPhoto {
        private final Config config;

        public AccessRecordAccessPhoto(Config config) {
            this.config = config;
        }
    
        public GetAccessRecordAccessPhotoResp get(GetAccessRecordAccessPhotoReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }
            reqOptions.setSupportDownLoad(true);

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/access_records/:access_record_id/access_photo"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
            if (httpResponse.getStatusCode() == 200) {
                GetAccessRecordAccessPhotoResp resp = new GetAccessRecordAccessPhotoResp();
                resp.setRawResponse(httpResponse);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                outputStream.write(httpResponse.getBody());
                resp.setFileStream(outputStream);
                resp.setFileName(httpResponse.getFileName());
                return  resp;
            }
           // 反序列化
           GetAccessRecordAccessPhotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetAccessRecordAccessPhotoResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetAccessRecordAccessPhotoResp get(GetAccessRecordAccessPhotoReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();
            reqOptions.setSupportDownLoad(true);

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/access_records/:access_record_id/access_photo"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
            // 下载请求，返回流
            if (httpResponse.getStatusCode() == 200) {
                GetAccessRecordAccessPhotoResp resp = new GetAccessRecordAccessPhotoResp();
                resp.setRawResponse(httpResponse);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                outputStream.write(httpResponse.getBody());
                resp.setFileStream(outputStream);
                resp.setFileName(httpResponse.getFileName());
                return  resp;
            }
           // 反序列化
           GetAccessRecordAccessPhotoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetAccessRecordAccessPhotoResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public Device device() {
        return device;
    }

    public static class Device {
        private final Config config;

        public Device(Config config) {
            this.config = config;
        }
    
        public ListDeviceResp list( RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/devices"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,null);
	       
           // 反序列化
           ListDeviceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListDeviceResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public ListDeviceResp list() throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/devices"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,null);
            
           // 反序列化
           ListDeviceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListDeviceResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public User user() {
        return user;
    }

    public static class User {
        private final Config config;

        public User(Config config) {
            this.config = config;
        }
    
        public GetUserResp get(GetUserReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/users/:user_id"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           GetUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetUserResp get(GetUserReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/users/:user_id"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           GetUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public ListUserResp list(ListUserReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/users"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           ListUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListUserResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public ListUserResp list(ListUserReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/users"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           ListUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListUserResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public PatchUserResp patch(PatchUserReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/acs/v1/users/:user_id"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           PatchUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchUserResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public PatchUserResp patch(PatchUserReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PATCH"
                       ,"/open-apis/acs/v1/users/:user_id"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           PatchUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchUserResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public UserFace userFace() {
        return userFace;
    }

    public static class UserFace {
        private final Config config;

        public UserFace(Config config) {
            this.config = config;
        }
    
        public GetUserFaceResp get(GetUserFaceReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }
            reqOptions.setSupportDownLoad(true);

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/users/:user_id/face"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
            if (httpResponse.getStatusCode() == 200) {
                GetUserFaceResp resp = new GetUserFaceResp();
                resp.setRawResponse(httpResponse);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                outputStream.write(httpResponse.getBody());
                resp.setFileStream(outputStream);
                resp.setFileName(httpResponse.getFileName());
                return  resp;
            }
           // 反序列化
           GetUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserFaceResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public GetUserFaceResp get(GetUserFaceReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();
            reqOptions.setSupportDownLoad(true);

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "GET"
                       ,"/open-apis/acs/v1/users/:user_id/face"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
            // 下载请求，返回流
            if (httpResponse.getStatusCode() == 200) {
                GetUserFaceResp resp = new GetUserFaceResp();
                resp.setRawResponse(httpResponse);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                outputStream.write(httpResponse.getBody());
                resp.setFileStream(outputStream);
                resp.setFileName(httpResponse.getFileName());
                return  resp;
            }
           // 反序列化
           GetUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserFaceResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    
        public UpdateUserFaceResp update(UpdateUserFaceReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }
            reqOptions.setSupportUpload(true);

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PUT"
                       ,"/open-apis/acs/v1/users/:user_id/face"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           UpdateUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateUserFaceResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }

        public UpdateUserFaceResp update(UpdateUserFaceReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();
            reqOptions.setSupportUpload(true);

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "PUT"
                       ,"/open-apis/acs/v1/users/:user_id/face"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           UpdateUserFaceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateUserFaceResp.class);
           resp.setRawResponse(httpResponse);
           return resp;
        }
    }

    public abstract static class P2AccessRecordCreatedV1Handler implements IEventHandler<P2AccessRecordCreatedV1> {
        @Override
        public P2AccessRecordCreatedV1 getEvent() {
            return new P2AccessRecordCreatedV1();
        }
    }
    public abstract static class P2UserUpdatedV1Handler implements IEventHandler<P2UserUpdatedV1> {
        @Override
        public P2UserUpdatedV1 getEvent() {
            return new P2UserUpdatedV1();
        }
    }

}