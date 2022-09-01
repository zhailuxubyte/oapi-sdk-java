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

package com.lark.oapi.service.speech_to_text.v1;

import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.core.utils.Sets;



import com.lark.oapi.core.Config;
import com.lark.oapi.core.request.RequestOptions;
import java.io.ByteArrayOutputStream;
import com.lark.oapi.event.model.BaseEvent;
import com.lark.oapi.event.model.BaseEventV2;
import com.lark.oapi.service.speech_to_text.v1.model.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SpeechToTextService {
    private final Speech speech;

    public SpeechToTextService(Config config) {
        this.speech = new Speech(config);
    }
    public Speech speech() {
        return speech;
    }

    public static class Speech {
        private final Config config;

        public Speech(Config config) {
            this.config = config;
        }
    
        public FileRecognizeSpeechResp fileRecognize(FileRecognizeSpeechReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/speech_to_text/v1/speech/file_recognize"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           FileRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, FileRecognizeSpeechResp.class);
           resp.setRawResponse(httpResponse);
           resp.setRequest(req);
           
           return resp;
        }

        public FileRecognizeSpeechResp fileRecognize(FileRecognizeSpeechReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/speech_to_text/v1/speech/file_recognize"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           FileRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, FileRecognizeSpeechResp.class);
           resp.setRawResponse(httpResponse);
           resp.setRequest(req);
           
           return resp;
        }
    
        public StreamRecognizeSpeechResp streamRecognize(StreamRecognizeSpeechReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/speech_to_text/v1/speech/stream_recognize"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
	       
           // 反序列化
           StreamRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, StreamRecognizeSpeechResp.class);
           resp.setRawResponse(httpResponse);
           resp.setRequest(req);
           
           return resp;
        }

        public StreamRecognizeSpeechResp streamRecognize(StreamRecognizeSpeechReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config,reqOptions, "POST"
                       ,"/open-apis/speech_to_text/v1/speech/stream_recognize"
                       ,Sets.newHashSet(AccessTokenType.Tenant)
                       ,req);
            
           // 反序列化
           StreamRecognizeSpeechResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, StreamRecognizeSpeechResp.class);
           resp.setRawResponse(httpResponse);
           resp.setRequest(req);
           
           return resp;
        }
    }

}