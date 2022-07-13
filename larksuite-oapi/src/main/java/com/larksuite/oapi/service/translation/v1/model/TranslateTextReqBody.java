// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.translation.v1.model;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.annotation.Body;
import com.larksuite.oapi.core.annotation.Path;
import com.larksuite.oapi.core.annotation.Query;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.larksuite.oapi.core.utils.Strings;
import com.larksuite.oapi.core.response.BaseResponse;
public class TranslateTextReqBody {
    @SerializedName("source_language")
    private String sourceLanguage;
    @SerializedName("text")
    private String text;
    @SerializedName("target_language")
    private String targetLanguage;
    @SerializedName("glossary")
    private Term[] glossary;
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public Term[] getGlossary() {
        return this.glossary;
    }

    public void setGlossary(Term[] glossary) {
        this.glossary = glossary;
    }


// builder 开始
  public TranslateTextReqBody(){}

  public TranslateTextReqBody(Builder builder){
      this.sourceLanguage = builder.sourceLanguage;
      this.text = builder.text;
      this.targetLanguage = builder.targetLanguage;
      this.glossary = builder.glossary;
  }

    public static class Builder {
        private String sourceLanguage;
        private String text;
        private String targetLanguage;
        private Term[] glossary;
        public Builder sourceLanguage(String sourceLanguage) {
             this.sourceLanguage = sourceLanguage;
             return this;
        }
    
        public Builder text(String text) {
             this.text = text;
             return this;
        }
    
        public Builder targetLanguage(String targetLanguage) {
             this.targetLanguage = targetLanguage;
             return this;
        }
    
        public Builder glossary(Term[] glossary) {
             this.glossary = glossary;
             return this;
        }
    
    
    public TranslateTextReqBody build(){
        return new TranslateTextReqBody(this);
      }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
