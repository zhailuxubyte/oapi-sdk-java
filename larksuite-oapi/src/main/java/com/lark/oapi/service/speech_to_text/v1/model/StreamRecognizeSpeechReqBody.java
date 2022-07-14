// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.speech_to_text.v1.model;

import com.google.gson.annotations.SerializedName;

public class StreamRecognizeSpeechReqBody {

  @SerializedName("speech")
  private Speech speech;
  @SerializedName("config")
  private StreamConfig config;

  // builder 开始
  public StreamRecognizeSpeechReqBody() {
  }

  public StreamRecognizeSpeechReqBody(Builder builder) {
    this.speech = builder.speech;
    this.config = builder.config;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Speech getSpeech() {
    return this.speech;
  }

  public void setSpeech(Speech speech) {
    this.speech = speech;
  }

  public StreamConfig getConfig() {
    return this.config;
  }

  public void setConfig(StreamConfig config) {
    this.config = config;
  }

  public static class Builder {

    private Speech speech;
    private StreamConfig config;

    public Builder speech(Speech speech) {
      this.speech = speech;
      return this;
    }

    public Builder config(StreamConfig config) {
      this.config = config;
      return this;
    }


    public StreamRecognizeSpeechReqBody build() {
      return new StreamRecognizeSpeechReqBody(this);
    }
  }
}
